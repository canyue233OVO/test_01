package com.hfr.clowder;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * 派系仓库系统
 * 存储区块宣称系统和人口系统产出的物品
 */
public class ClowderStorehouse {
    
    /** 仓库容量（物品槽位数量） */
    public static final int STORAGE_SIZE = 54; // 6行9列
    
    /** 存储的物品 */
    private ItemStack[] inventory;
    
    /** 所属派系 */
    private Clowder owner;
    
    public ClowderStorehouse(Clowder owner) {
        this.owner = owner;
        this.inventory = new ItemStack[STORAGE_SIZE];
    }
    
    /**
     * 添加物品到仓库
     * @return 未能添加的物品（仓库满时）
     */
    public ItemStack addItem(ItemStack stack) {
        if(stack == null || stack.stackSize <= 0) {
            return null;
        }
        
        ItemStack remaining = stack.copy();
        
        // 先尝试堆叠到已有物品
        for(int i = 0; i < inventory.length; i++) {
            if(inventory[i] != null && canStack(inventory[i], remaining)) {
                int transferAmount = Math.min(remaining.stackSize, 
                    inventory[i].getMaxStackSize() - inventory[i].stackSize);
                
                if(transferAmount > 0) {
                    inventory[i].stackSize += transferAmount;
                    remaining.stackSize -= transferAmount;
                    
                    if(remaining.stackSize <= 0) {
                        return null;
                    }
                }
            }
        }
        
        // 再尝试放入空槽位
        for(int i = 0; i < inventory.length; i++) {
            if(inventory[i] == null) {
                inventory[i] = remaining.copy();
                return null;
            }
        }
        
        // 仓库满了，返回未能添加的部分
        return remaining;
    }
    
    /**
     * 从仓库取出物品
     */
    public ItemStack removeItem(int slot, int amount) {
        if(slot < 0 || slot >= inventory.length || inventory[slot] == null) {
            return null;
        }
        
        ItemStack stack = inventory[slot];
        
        if(amount >= stack.stackSize) {
            ItemStack result = stack.copy();
            inventory[slot] = null;
            return result;
        } else {
            ItemStack result = stack.splitStack(amount);
            if(stack.stackSize <= 0) {
                inventory[slot] = null;
            }
            return result;
        }
    }
    
    /**
     * 获取指定槽位的物品
     */
    public ItemStack getStackInSlot(int slot) {
        if(slot < 0 || slot >= inventory.length) {
            return null;
        }
        return inventory[slot];
    }
    
    /**
     * 设置指定槽位的物品
     */
    public void setInventorySlotContents(int slot, ItemStack stack) {
        if(slot >= 0 && slot < inventory.length) {
            inventory[slot] = stack;
        }
    }
    
    /**
     * 判断两个物品是否可以堆叠
     */
    private boolean canStack(ItemStack stack1, ItemStack stack2) {
        if(stack1 == null || stack2 == null) {
            return false;
        }
        
        if(stack1.getItem() != stack2.getItem()) {
            return false;
        }
        
        if(stack1.getItemDamage() != stack2.getItemDamage()) {
            return false;
        }
        
        if(!ItemStack.areItemStackTagsEqual(stack1, stack2)) {
            return false;
        }
        
        return true;
    }
    
    /**
     * 获取仓库大小
     */
    public int getSizeInventory() {
        return inventory.length;
    }
    
    /**
     * 清空仓库
     */
    public void clear() {
        for(int i = 0; i < inventory.length; i++) {
            inventory[i] = null;
        }
    }
    
    /**
     * 写入NBT
     */
    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList itemList = new NBTTagList();
        
        for(int i = 0; i < inventory.length; i++) {
            if(inventory[i] != null) {
                NBTTagCompound itemTag = new NBTTagCompound();
                itemTag.setByte("Slot", (byte)i);
                inventory[i].writeToNBT(itemTag);
                itemList.appendTag(itemTag);
            }
        }
        
        nbt.setTag("Items", itemList);
    }
    
    /**
     * 从NBT读取
     */
    public void readFromNBT(NBTTagCompound nbt) {
        NBTTagList itemList = nbt.getTagList("Items", 10);
        
        for(int i = 0; i < itemList.tagCount(); i++) {
            NBTTagCompound itemTag = itemList.getCompoundTagAt(i);
            byte slot = itemTag.getByte("Slot");
            
            if(slot >= 0 && slot < inventory.length) {
                inventory[slot] = ItemStack.loadItemStackFromNBT(itemTag);
            }
        }
    }
    
    /**
     * 获取仓库中物品的总数量
     */
    public int getTotalItemCount() {
        int count = 0;
        for(ItemStack stack : inventory) {
            if(stack != null) {
                count += stack.stackSize;
            }
        }
        return count;
    }
    
    /**
     * 获取仓库中特定物品的数量
     */
    public int getItemCount(ItemStack targetStack) {
        if(targetStack == null) {
            return 0;
        }
        
        int count = 0;
        for(ItemStack stack : inventory) {
            if(stack != null && canStack(stack, targetStack)) {
                count += stack.stackSize;
            }
        }
        return count;
    }
}
