package net.spacegateir.arcaness.creative_tab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spacegateir.arcaness.ArcaneSteppingStones;
import net.spacegateir.arcaness.block.ModBlocks;
import net.spacegateir.arcaness.item.ModItems;

public class ModItemGroups {

    public static final ItemGroup ARCANE_STEPPING_STONES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArcaneSteppingStones.MOD_ID,"arcaness"),
            FabricItemGroup.builder().displayName(Text.translatable("Arcane Stepping Stones"))
                    .icon(() -> new ItemStack(ModItems.TRAP_CONCEALER)).entries((displayContext, entries) -> {

//                        Items

                        entries.add(ModItems.TRAP_CONCEALER);

//                        Blocks

                        entries.add(ModBlocks.ARCANE_ABSORPTION_BLOCK);
                        entries.add(ModBlocks.ARCANE_BAD_OMEN_BLOCK);
                        entries.add(ModBlocks.ARCANE_BLINDNESS_BLOCK);
                        entries.add(ModBlocks.ARCANE_CONDUIT_BLOCK);
                        entries.add(ModBlocks.ARCANE_DARKNESS_BLOCK);
                        entries.add(ModBlocks.ARCANE_DOLPHINS_GRACE_BLOCK);
                        entries.add(ModBlocks.ARCANE_FIRE_RESISTANCE_BLOCK);
                        entries.add(ModBlocks.ARCANE_GLOWING_BLOCK);
                        entries.add(ModBlocks.ARCANE_HASTE_BLOCK);
                        entries.add(ModBlocks.ARCANE_HEALTH_BOOST_BLOCK);
                        entries.add(ModBlocks.ARCANE_HERO_OF_THE_VILLAGE_BLOCK);
                        entries.add(ModBlocks.ARCANE_INSTANT_DAMAGE_BLOCK);
                        entries.add(ModBlocks.ARCANE_INSTANT_HEALTH_BLOCK);
                        entries.add(ModBlocks.ARCANE_INVISIBILITY_BLOCK);
                        entries.add(ModBlocks.ARCANE_JUMP_BOOST_BLOCK);
                        entries.add(ModBlocks.ARCANE_LEVITATION_BLOCK);
                        entries.add(ModBlocks.ARCANE_LUCK_BLOCK);
                        entries.add(ModBlocks.ARCANE_MINING_FATIGUE_BLOCK);
                        entries.add(ModBlocks.ARCANE_NEAUSEA_BLOCK);
                        entries.add(ModBlocks.ARCANE_NIGHT_VISION_BLOCK);
                        entries.add(ModBlocks.ARCANE_POISION_BLOCK);
                        entries.add(ModBlocks.ARCANE_REGENERATION_BLOCK);
                        entries.add(ModBlocks.ARCANE_RESISTANCE_BLOCK);
                        entries.add(ModBlocks.ARCANE_SATUATION_BLOCK);
                        entries.add(ModBlocks.ARCANE_SLOW_FALL_BLOCK);
                        entries.add(ModBlocks.ARCANE_SLOWNESS_BLOCK);
                        entries.add(ModBlocks.ARCANE_SPEED_BLOCK);
                        entries.add(ModBlocks.ARCANE_STARVING_BLOCK);
                        entries.add(ModBlocks.ARCANE_STRENGTH_BLOCK);
                        entries.add(ModBlocks.ARCANE_UNLUCK_BLOCK);
                        entries.add(ModBlocks.ARCANE_WATER_BREATHING_BLOCK);
                        entries.add(ModBlocks.ARCANE_WEAKNESS_BLOCK);
                        entries.add(ModBlocks.ARCANE_WITHER_BLOCK);
                        entries.add(ModBlocks.ARCANE_VOID_BLOCK);
                        entries.add(ModBlocks.ARCANE_CLEAR_NEGATIVE_BLOCK);
                        entries.add(ModBlocks.ARCANE_CLEAR_POSITIVE_BLOCK);
                        entries.add(ModBlocks.ARCANE_CLEAR_NEUTRAL_BLOCK);
                        entries.add(ModBlocks.ARCANE_DISORIENT_BLOCK);
                        entries.add(ModBlocks.ARCANE_STICKY_FEAT_BLOCK);
                        entries.add(ModBlocks.ARCANE_FREAKY_BUNNY_BLOCK);

                        entries.add(ModBlocks.POWER_PRECISION_BLOCK);


//                        BlockItem

                        entries.add(ModItems.CHANGING_ITEM);






                    }).build());

    public static void registerItemGroups() {
        ArcaneSteppingStones.LOGGER.info("registering Item Groups for "+ ArcaneSteppingStones.MOD_ID);
    }
}
