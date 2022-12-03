package net.ppatel.silvermod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ppatel.silvermod.SilverMod;

public class ModItems {

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.SILVER)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SilverMod.LOGGER.debug("Registering Mod Items for " + SilverMod.MOD_ID);
    }
}
