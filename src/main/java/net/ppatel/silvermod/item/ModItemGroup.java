package net.ppatel.silvermod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ppatel.silvermod.SilverMod;

public class ModItemGroup {
    public static final ItemGroup SILVER = FabricItemGroupBuilder.build(
            new Identifier(SilverMod.MOD_ID,"silver"), () -> new ItemStack(ModItems.RAW_SILVER));
}
