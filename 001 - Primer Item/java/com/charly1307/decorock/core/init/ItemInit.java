package com.charly1307.decorock.core.init;

import com.charly1307.decorock.DecoRockMain;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			DecoRockMain.MOD_ID);

	public static final RegistryObject<Item> PRIMER_ITEM = ITEMS.register("primer_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
