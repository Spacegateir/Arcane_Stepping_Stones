package net.spacegateir.arcaness.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.nbt.NbtCompound;
import net.spacegateir.arcaness.block.arcane.ArcaneAbsorptionBlock;
import net.spacegateir.arcaness.block.custom.*;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class TrapConcealerItem extends Item {

    // List of block classes this item can work on
    private static final List<Class<? extends Block>> TARGET_BLOCK_CLASSES = Arrays.asList(
            ArcaneAbsorptionBlock.class
//            ArcanespeenBlock.class,
//            ArcaneBaterBreathingBlock.class
    );

    // Array of model names (linked to switch_state values)
    private static final String[] MODEL_NAMES = {
            "arcane base block #0",
            "stone #1"
    };

    public TrapConcealerItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.steamcraft.trap_concealer.tooltip.shift_1"));
            tooltip.add(Text.translatable("tooltip.steamcraft.trap_concealer.tooltip.shift_2"));
        } else {
            tooltip.add(Text.translatable("tooltip.steamcraft.trap_concealer.tooltip"));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            NbtCompound nbt = stack.getOrCreateNbt();
            int currentModel = nbt.getInt("SelectedModel");
            int maxModels = MODEL_NAMES.length;

            int next = player.isSneaking() ? (currentModel - 1 + maxModels) % maxModels : (currentModel + 1) % maxModels;

            nbt.putInt("SelectedModel", next);
            stack.setNbt(nbt);

            player.sendMessage(Text.literal(" " + MODEL_NAMES[next]), true);
        }

        return TypedActionResult.success(stack);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        BlockState state = world.getBlockState(pos);
        ItemStack stack = context.getStack();

        Block block = state.getBlock();

        for (Class<? extends Block> targetClass : TARGET_BLOCK_CLASSES) {
            if (targetClass.isInstance(block)) {
                try {
                    // Get SWITCH_STATE from the actual block class (cast necessary)
                    IntProperty switchProperty = (IntProperty) block.getClass().getField("SWITCH_STATE").get(null);

                    NbtCompound nbt = stack.getOrCreateNbt();
                    int selectedModel = nbt.getInt("SelectedModel");

                    if (selectedModel >= MODEL_NAMES.length) selectedModel = 0;

                    BlockState newState = state.with(switchProperty, selectedModel);
                    world.playSound(player, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);

                    if (player instanceof ServerPlayerEntity serverPlayer) {
                        Criteria.ITEM_USED_ON_BLOCK.trigger(serverPlayer, pos, stack);
                        serverPlayer.sendMessage(Text.literal("Applied Model: " + MODEL_NAMES[selectedModel]), true);
                    }

                    world.setBlockState(pos, newState, 11);
                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, newState));

                    stack.damage(1, player, (p) -> p.sendToolBreakStatus(context.getHand()));

                    return ActionResult.success(world.isClient);

                } catch (Exception e) {
                    e.printStackTrace(); // or log it with your logger
                }
            }
        }


        return ActionResult.PASS;
    }
}
