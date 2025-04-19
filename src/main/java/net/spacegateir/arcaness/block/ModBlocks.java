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
import net.spacegateir.arcaness.block.arcane.*;
import net.spacegateir.arcaness.block.arcane_specal.*;
import net.spacegateir.arcaness.block.custom.BrasierBlock;
import net.spacegateir.arcaness.block.custom.PowerPrecisionBlock;
import net.spacegateir.arcaness.block.traps.*;

public class ModBlocks {

//    Block

    public static final Block POWER_PRECISION_BLOCK = registerBlock("power_precision_block_0",
            new PowerPrecisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F)));



    public static final Block ARCANE_ABSORPTION_BLOCK = registerBlock("arcane_absorption_block",
            new ArcaneAbsorptionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_BAD_OMEN_BLOCK = registerBlock("arcane_bad_omen_block",
            new ArcaneBadOmenBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_BLINDNESS_BLOCK = registerBlock("arcane_blindness_block",
            new ArcaneBlindnessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_CONDUIT_BLOCK = registerBlock("arcane_conduit_block",
            new ArcaneConduitBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_DARKNESS_BLOCK = registerBlock("arcane_darkness_block",
            new ArcaneDarknessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_DOLPHINS_GRACE_BLOCK = registerBlock("arcane_dolphins_grace_block",
            new ArcaneDolphinsGraceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_FIRE_RESISTANCE_BLOCK = registerBlock("arcane_fire_resistance_block",
            new ArcaneFireResistanceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_GLOWING_BLOCK = registerBlock("arcane_glowing_block",
            new ArcaneGlowingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_HASTE_BLOCK = registerBlock("arcane_haste_block",
            new ArcaneHasteBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_HEALTH_BOOST_BLOCK = registerBlock("arcane_health_boost_block",
            new ArcaneHealthBoostBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_HERO_OF_THE_VILLAGE_BLOCK = registerBlock("arcane_hero_of_the_village_block",
            new ArcaneHeroOfTheVillageBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_INSTANT_DAMAGE_BLOCK = registerBlock("arcane_instant_damage_block",
            new ArcaneInstantDamageBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_INSTANT_HEALTH_BLOCK = registerBlock("arcane_instant_health_block",
            new ArcaneInstantHealthBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_INVISIBILITY_BLOCK = registerBlock("arcane_invisibility_block",
            new ArcaneInvisibilityBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_JUMP_BOOST_BLOCK = registerBlock("arcane_jump_boost_block",
            new ArcaneJumpBoostBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_LEVITATION_BLOCK = registerBlock("arcane_levitation_block",
            new ArcaneLevitationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_LUCK_BLOCK = registerBlock("arcane_luck_block",
            new ArcaneLuckBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_MINING_FATIGUE_BLOCK = registerBlock("arcane_mining_fatigue_block",
            new ArcaneMiningFatigueBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_NEAUSEA_BLOCK = registerBlock("arcane_neausea_block",
            new ArcaneNeauseaBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_NIGHT_VISION_BLOCK = registerBlock("arcane_night_vision_block",
            new ArcaneNightVisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_POISION_BLOCK = registerBlock("arcane_poision_block",
            new ArcanePoisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_REGENERATION_BLOCK = registerBlock("arcane_regeneration_block",
            new ArcaneRegenerationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_RESISTANCE_BLOCK = registerBlock("arcane_resistance_block",
            new ArcaneResistanceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_SATUATION_BLOCK = registerBlock("arcane_satuation_block",
            new ArcaneSatuationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_SLOW_FALL_BLOCK = registerBlock("arcane_slow_fall_block",
            new ArcaneSlowFallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_SLOWNESS_BLOCK = registerBlock("arcane_slowness_block",
            new ArcaneSlownessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_SPEED_BLOCK = registerBlock("arcane_speed_block",
            new ArcaneSpeedBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_STARVING_BLOCK = registerBlock("arcane_starving_block",
            new ArcaneStarvingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_STRENGTH_BLOCK = registerBlock("arcane_strength_block",
            new ArcaneStrengthBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_UNLUCK_BLOCK = registerBlock("arcane_unluck_block",
            new ArcaneUnluckBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_WATER_BREATHING_BLOCK = registerBlock("arcane_water_breathing_block",
            new ArcaneWaterBreathingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_WEAKNESS_BLOCK = registerBlock("arcane_weakness_block",
            new ArcaneWeaknessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_WITHER_BLOCK = registerBlock("arcane_wither_block",
            new ArcaneWitherBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));



    public static final Block ARCANE_VOID_BLOCK = registerBlock("arcane_void_block",
            new ArcaneVoidBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_CLEAR_NEGATIVE_BLOCK = registerBlock("arcane_clear_negative_block",
            new ArcaneClearNegativeBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_CLEAR_POSITIVE_BLOCK = registerBlock("arcane_clear_positive_block",
            new ArcaneClearPositiveBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_CLEAR_NEUTRAL_BLOCK = registerBlock("arcane_clear_neutral_block",
            new ArcaneClearNeutralBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_DISORIENT_BLOCK = registerBlock("arcane_disorient_block",
            new ArcaneDisorientBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_STICKY_FEAT_BLOCK = registerBlock("arcane_sticky_feat_block",
            new ArcaneStickyFeatBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block ARCANE_FREAKY_BUNNY_BLOCK = registerBlock("arcane_freaky_bunny_block",
            new ArcanFreakyBunnyBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

//    public static final Block ARCANE__BLOCK = registerBlock("arcane__block",
//            new ArcaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));




    public static final Block CURSED_BLOCK = registerBlock("cursed_block",
            new CursedBlock(FabricBlockSettings.copyOf(Blocks.SCULK).resistance(50.0F).hardness(50.0F)));

    public static final Block COURSE_DIRT_TRAP_BLOCK = registerBlock("course_dirt_trap_block",
            new CourseDirtTrapBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block COURSE_DIRT_TRAP_BLOCK_SPIKES = registerBlock("course_dirt_trap_block_spikes",
            new CourseDirtTrapBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block STONE_TRAP_BLOCK = registerBlock("stone_trap_block",
            new StoneTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STONE_TRAP_BLOCK_SPIKES = registerBlock("stone_trap_block_spikes",
            new StoneTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block DEEPSLATE_TRAP_BLOCK = registerBlock("deepslate_trap_block",
            new DeepslateTrapBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block DEEPSLATE_TRAP_BLOCK_SPIKES = registerBlock("deepslate_trap_block_spikes",
            new DeepslateTrapBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block SAND_QUICKSAND = registerBlock("sand_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block RED_SAND_QUICKSAND = registerBlock("red_sand_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block GRAVEL_SINKSTONE = registerBlock("gravel_sinkstone",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block MUD_SINKING_SLUDGE = registerBlock("mud_sinking_sludge",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.MUD).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block SOUL_SAND_PHANTOM_QUICKSAND = registerBlock("soul_sand_phantom_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));

    public static final Block FLAREFORGE_BLOCK = registerBlock("flareforge",
            new FlareforgeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block NETHER_STEAM_VENT = registerBlock("nether_steam_vent",
            new FlareforgeBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_TOTEM_BLOCK = registerBlock("cursed_totem_block",
            new WonderingTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).nonOpaque().resistance(50.0F).hardness(50.0F)));
    public static final Block TELEPORT_TRAP_BLOCK = registerBlock("teleport_trap_block",
            new TeleportTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block FROST_BITE_TRAP_BLOCK = registerBlock("frost_bite_trap_block",
            new FrostBitTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_NAUSEA_TRAP_BLOCK = registerBlock("cursed_nausea_trap_block",
            new CursedNauseaTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_POISON_SPORE_TRAP_BLOCK = registerBlock("cursed_poison_spore_trap_block",
            new CursedPoisonSporeTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).nonOpaque().allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_BRASIER_TRAP_BLOCK = registerBlock("cursed_brasier_trap_block",
            new HungerZoneTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).nonOpaque().allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block EMPTY_BRASIER = registerBlock("empty_brasier",
            new BrasierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque().luminance(15)));


    public static final Block SPIRIT_JUMP_TRAP = registerBlock("spirit_jump_trap",
            new SpiritJumpTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block SPIRIT_JUMP_TRAP_BLOCK = registerBlock("spirit_jump_trap_block",
            new SpiritJumpTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));







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
