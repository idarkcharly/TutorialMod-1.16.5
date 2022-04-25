package com.charly1307.decorock.core.itemgroup;

import com.charly1307.decorock.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DecoRockItemGroup extends ItemGroup {

	public static final DecoRockItemGroup DECOROCK = new DecoRockItemGroup(ItemGroup.TABS.length, "DecoRock");
	
	public DecoRockItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.PRIMER_ITEM.get());
	}
}
