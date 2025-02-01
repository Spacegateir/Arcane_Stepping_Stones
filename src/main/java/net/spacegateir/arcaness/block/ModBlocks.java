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
import net.spacegateir.arcaness.block.custom.ArcaneBlocks.AbsorptionBlock;
import net.spacegateir.arcaness.block.custom.PowerPrecisionBlock;

public class ModBlocks {

    public static final Block TEST_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(ArcaneSteppingStones.MOD_ID, "test_block"),
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F))
    );
    public static final Block POWER_PRECISION_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(ArcaneSteppingStones.MOD_ID, "power_precision_block_0"),
            new PowerPrecisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F))
    );


    public static final Block ABSORPTION_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(ArcaneSteppingStones.MOD_ID, "absorption"),
            new AbsorptionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F))
    );




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
