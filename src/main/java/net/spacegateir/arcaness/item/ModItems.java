package net.spacegateir.arcaness.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.arcaness.ArcaneSteppingStones;
import net.spacegateir.arcaness.block.ModBlocks;

public class ModItems {

//    Item

    public static final Item TRAP_CONCEALER = registerItem("trap_concealer",
            new Item(new FabricItemSettings()));

//    BlockItem

    public static final Item CHANGING_ITEM = Registry.register(Registries.ITEM,
            new Identifier(ArcaneSteppingStones.MOD_ID, "changing_item"),
            new BlockItem(ModBlocks.CHANGING_BLOCK, new FabricItemSettings()));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArcaneSteppingStones.MOD_ID, name), item);
    }

    public static void registerModItems()   {
        ArcaneSteppingStones.LOGGER.info("Registering Mod Items for " + ArcaneSteppingStones.MOD_ID);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ArcaneSteppingStones.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}