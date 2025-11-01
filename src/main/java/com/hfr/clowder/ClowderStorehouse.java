package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 派系仓库系统
 * 存储派系的共享物品
 */
public class ClowderStorehouse implements IInventory {
	
	/** 仓库槽位数量 */
	private static final int STOREHOUSE_SIZE = 54; // 6行9列，类似大箱子
	
	/** 物品存储 */
	private ItemStack[] inventory;
	
	/** 所属派系UUID */
	private String clowderUuid;
	
	public ClowderStorehouse(String clowderUuid) {
		this.clowderUuid = clowderUuid;
		this.inventory = new ItemStack[STOREHOUSE_SIZE];
	}
	
	/**
	 * 添加物品到仓库
	 * @return 是否成功添加（或部分添加）
	 */
	public boolean addItem(ItemStack stack) {
		if (stack == null || stack.stackSize <= 0) {
			return false;
		}
		
		ItemStack toAdd = stack.copy();
		
		// 先尝试合并到现有堆叠
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null && canMerge(inventory[i], toAdd)) {
				int space = inventory[i].getMaxStackSize() - inventory[i].stackSize;
				if (space > 0) {
					int amountToAdd = Math.min(space, toAdd.stackSize);
					inventory[i].stackSize += amountToAdd;
					toAdd.stackSize -= amountToAdd;
					
					if (toAdd.stackSize <= 0) {
						return true;
					}
				}
			}
		}
		
		// 然后尝试放入空槽位
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				inventory[i] = toAdd.copy();
				return true;
			}
		}
		
		// 仓库已满，但可能部分添加成功
		return toAdd.stackSize < stack.stackSize;
	}
	
	/**
	 * 从仓库移除物品
	 * @param itemName 物品注册名
	 * @param amount 数量
	 * @return 是否成功移除
	 */
	public boolean removeItem(String itemName, int amount) {
		int remaining = amount;
		
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				String stackName = Item.itemRegistry.getNameForObject(inventory[i].getItem());
				if (stackName.equals(itemName)) {
					int toRemove = Math.min(remaining, inventory[i].stackSize);
					inventory[i].stackSize -= toRemove;
					remaining -= toRemove;
					
					if (inventory[i].stackSize <= 0) {
						inventory[i] = null;
					}
					
					if (remaining <= 0) {
						return true;
					}
				}
			}
		}
		
		return remaining == 0;
	}
	
	/**
	 * 检查是否有足够的物品
	 */
	public boolean hasItem(String itemName, int amount) {
		int count = 0;
		
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				String stackName = Item.itemRegistry.getNameForObject(inventory[i].getItem());
				if (stackName.equals(itemName)) {
					count += inventory[i].stackSize;
					if (count >= amount) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 获取某种物品的总数
	 */
	public int getItemCount(String itemName) {
		int count = 0;
		
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				String stackName = Item.itemRegistry.getNameForObject(inventory[i].getItem());
				if (stackName.equals(itemName)) {
					count += inventory[i].stackSize;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * 检查两个物品堆是否可以合并
	 */
	private boolean canMerge(ItemStack stack1, ItemStack stack2) {
		if (stack1 == null || stack2 == null) {
			return false;
		}
		
		return stack1.getItem() == stack2.getItem() && 
		       stack1.getItemDamage() == stack2.getItemDamage() &&
		       ItemStack.areItemStackTagsEqual(stack1, stack2);
	}
	
	/**
	 * 清空仓库
	 */
	public void clear() {
		for (int i = 0; i < inventory.length; i++) {
			inventory[i] = null;
		}
	}
	
	/**
	 * 获取仓库内容的摘要（用于显示）
	 */
	public List<String> getInventorySummary() {
		List<String> summary = new ArrayList<>();
		Map<String, Integer> itemCounts = new HashMap<>();
		
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				String name = inventory[i].getDisplayName();
				itemCounts.put(name, itemCounts.getOrDefault(name, 0) + inventory[i].stackSize);
			}
		}
		
		for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
			summary.add(entry.getKey() + " x" + entry.getValue());
		}
		
		return summary;
	}
	
	// ===== IInventory接口实现 =====
	
	@Override
	public int getSizeInventory() {
		return STOREHOUSE_SIZE;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventory[slot];
	}
	
	@Override
	public ItemStack decrStackSize(int slot, int amount) {
		if (inventory[slot] != null) {
			ItemStack stack;
			
			if (inventory[slot].stackSize <= amount) {
				stack = inventory[slot];
				inventory[slot] = null;
				markDirty();
				return stack;
			} else {
				stack = inventory[slot].splitStack(amount);
				if (inventory[slot].stackSize == 0) {
					inventory[slot] = null;
				}
				markDirty();
				return stack;
			}
		}
		return null;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		if (inventory[slot] != null) {
			ItemStack stack = inventory[slot];
			inventory[slot] = null;
			return stack;
		}
		return null;
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inventory[slot] = stack;
		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}
	
	@Override
	public String getInventoryName() {
		return "container.clowderStorehouse";
	}
	
	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	@Override
	public void markDirty() {
		// 标记需要保存
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// 检查玩家是否属于这个派系
		Clowder clowder = Clowder.getClowderByUUID(clowderUuid);
		if (clowder == null) {
			return false;
		}
		
		String playerName = player.getCommandSenderName();
		return clowder.members.containsKey(playerName);
	}
	
	@Override
	public void openInventory() {
		// 打开仓库时调用
	}
	
	@Override
	public void closeInventory() {
		// 关闭仓库时调用
	}
	
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return true;
	}
	
	/**
	 * 保存到NBT
	 */
	public NBTTagCompound saveToNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		
		NBTTagList itemList = new NBTTagList();
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				NBTTagCompound itemTag = new NBTTagCompound();
				itemTag.setByte("Slot", (byte) i);
				inventory[i].writeToNBT(itemTag);
				itemList.appendTag(itemTag);
			}
		}
		nbt.setTag("Items", itemList);
		
		return nbt;
	}
	
	/**
	 * 从NBT加载
	 */
	public void loadFromNBT(NBTTagCompound nbt) {
		NBTTagList itemList = nbt.getTagList("Items", 10);
		
		for (int i = 0; i < itemList.tagCount(); i++) {
			NBTTagCompound itemTag = itemList.getCompoundTagAt(i);
			byte slot = itemTag.getByte("Slot");
			
			if (slot >= 0 && slot < inventory.length) {
				inventory[slot] = ItemStack.loadItemStackFromNBT(itemTag);
			}
		}
	}
}
