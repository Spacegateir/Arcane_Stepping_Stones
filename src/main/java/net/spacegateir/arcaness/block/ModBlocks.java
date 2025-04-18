package net.spacegateir.arcaness.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.arcaness.ArcaneSteppingStones;
import net.spacegateir.arcaness.block.arcane.ArcaneAbsorptionBlock;

public class ModBlocks {

//    Block

    public static final Block ARCANE_ABSORPTION_BLOCK = registerBlock("arcane_absorption_block",
            new ArcaneAbsorptionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

//    BlockItem

public static final Block CHANGING_BLOCK = Registry.register(Registries.BLOCK,
        new Identifier(ArcaneSteppingStones.MOD_ID, "changing_block"),
        new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ArcaneSteppingStones.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ArcaneSteppingStones.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ArcaneSteppingStones.LOGGER.info("Registering ModBlocks for " + ArcaneSteppingStones.MOD_ID);
    }
}
