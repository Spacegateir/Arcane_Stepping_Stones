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

//                        BlockItem

                        entries.add(ModItems.CHANGING_ITEM);






                    }).build());

    public static void registerItemGroups() {
        ArcaneSteppingStones.LOGGER.info("registering Item Groups for "+ ArcaneSteppingStones.MOD_ID);
    }
}
