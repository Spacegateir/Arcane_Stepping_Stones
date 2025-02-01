package net.spacegateir.arcaness.creative_tab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
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
    public static final ItemGroup ARCANE_SS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArcaneSteppingStones.MOD_ID,"power_precision_block_0"),
            FabricItemGroup.builder().displayName(Text.translatable("Arcane Stepping Stones"))
                    .icon(() -> new ItemStack(ModItems.POWER_PRECISION)).entries((displayContext, entries) -> {


                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModItems.POWER_PRECISION);

                        entries.add(ModItems.ABSORPTION_ITEM);



                    }).build());

    public static void registerItemGroups() {
        ArcaneSteppingStones.LOGGER.info("registering Item Groups for "+ArcaneSteppingStones.MOD_ID);
    }
}