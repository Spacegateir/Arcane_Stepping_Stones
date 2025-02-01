package net.spacegateir.arcaness.block;

import java.util.function.ToIntFunction;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Blocks {

	public static final Block DECORATED_POT = register(
		"decorated_pot",
		new DecoratedPotBlock(
			AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED).strength(0.0F, 0.0F).pistonBehavior(PistonBehavior.DESTROY).nonOpaque()
		)
	);

	public static Block register(String id, Block block) {
		return Registry.register(Registries.BLOCK, id, block);
	}

	public static void refreshShapeCache() {
		Block.STATE_IDS.forEach(AbstractBlock.AbstractBlockState::initShapeCache);
	}

	static {
		for (Block block : Registries.BLOCK) {
			for (BlockState blockState : block.getStateManager().getStates()) {
				Block.STATE_IDS.add(blockState);
				blockState.initShapeCache();
			}

			block.getLootTableId();
		}
	}
}
