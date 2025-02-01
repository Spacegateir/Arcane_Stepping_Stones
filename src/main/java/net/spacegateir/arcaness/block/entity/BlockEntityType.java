package net.spacegateir.arcaness.block.entity;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.arcaness.ArcaneSteppingStones;

public class BlockEntityType {
	public static final net.minecraft.block.entity.BlockEntityType<DecoratedPotBlockEntity> DECORATED_POT =
			Registry.register(
					Registries.BLOCK_ENTITY_TYPE,  // Updated to Registries.BLOCK_ENTITY_TYPE
					new Identifier(ArcaneSteppingStones.MOD_ID, "decorated_pot"),
					net.minecraft.block.entity.BlockEntityType.Builder.create(DecoratedPotBlockEntity::new, Blocks.DECORATED_POT).build(null)
			);

	public static void registerBlockEntities() {
		ArcaneSteppingStones.LOGGER.info("Registering Block Entities for " + ArcaneSteppingStones.MOD_ID);
	}
}
