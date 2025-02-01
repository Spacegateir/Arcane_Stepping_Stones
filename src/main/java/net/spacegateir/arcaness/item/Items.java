package net.spacegateir.arcaness.item;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.item.trim.ArmorTrimPatterns;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BannerPatternTags;
import net.minecraft.registry.tag.InstrumentTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.Direction;

public class Items {
	public static final Item DECORATED_POT = register(new BlockItem(Blocks.DECORATED_POT, new Item.Settings().maxCount(1)));

	public static final Item ANGLER_POTTERY_SHERD = register("angler_pottery_sherd", new Item(new Item.Settings()));
	public static final Item ARCHER_POTTERY_SHERD = register("archer_pottery_sherd", new Item(new Item.Settings()));
	public static final Item ARMS_UP_POTTERY_SHERD = register("arms_up_pottery_sherd", new Item(new Item.Settings()));
	public static final Item BLADE_POTTERY_SHERD = register("blade_pottery_sherd", new Item(new Item.Settings()));
	public static final Item BREWER_POTTERY_SHERD = register("brewer_pottery_sherd", new Item(new Item.Settings()));
	public static final Item BURN_POTTERY_SHERD = register("burn_pottery_sherd", new Item(new Item.Settings()));
	public static final Item DANGER_POTTERY_SHERD = register("danger_pottery_sherd", new Item(new Item.Settings()));
	public static final Item EXPLORER_POTTERY_SHERD = register("explorer_pottery_sherd", new Item(new Item.Settings()));
	public static final Item FRIEND_POTTERY_SHERD = register("friend_pottery_sherd", new Item(new Item.Settings()));
	public static final Item HEART_POTTERY_SHERD = register("heart_pottery_sherd", new Item(new Item.Settings()));
	public static final Item HEARTBREAK_POTTERY_SHERD = register("heartbreak_pottery_sherd", new Item(new Item.Settings()));
	public static final Item HOWL_POTTERY_SHERD = register("howl_pottery_sherd", new Item(new Item.Settings()));
	public static final Item MINER_POTTERY_SHERD = register("miner_pottery_sherd", new Item(new Item.Settings()));
	public static final Item MOURNER_POTTERY_SHERD = register("mourner_pottery_sherd", new Item(new Item.Settings()));
	public static final Item PLENTY_POTTERY_SHERD = register("plenty_pottery_sherd", new Item(new Item.Settings()));
	public static final Item PRIZE_POTTERY_SHERD = register("prize_pottery_sherd", new Item(new Item.Settings()));
	public static final Item SHEAF_POTTERY_SHERD = register("sheaf_pottery_sherd", new Item(new Item.Settings()));
	public static final Item SHELTER_POTTERY_SHERD = register("shelter_pottery_sherd", new Item(new Item.Settings()));
	public static final Item SKULL_POTTERY_SHERD = register("skull_pottery_sherd", new Item(new Item.Settings()));
	public static final Item SNORT_POTTERY_SHERD = register("snort_pottery_sherd", new Item(new Item.Settings()));

	public static Item register(Block block) {
		return register(new BlockItem(block, new Item.Settings()));
	}

	public static Item register(Block block, Block... blocks) {
		BlockItem blockItem = new BlockItem(block, new Item.Settings());

		for (Block block2 : blocks) {
			Item.BLOCK_ITEMS.put(block2, blockItem);
		}

		return register(blockItem);
	}

	public static Item register(BlockItem item) {
		return register(item.getBlock(), item);
	}

	public static Item register(Block block, Item item) {
		return register(Registries.BLOCK.getId(block), item);
	}

	public static Item register(String id, Item item) {
		return register(new Identifier(id), item);
	}

	public static Item register(Identifier id, Item item) {
		return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
	}

	public static Item register(RegistryKey<Item> key, Item item) {
		if (item instanceof BlockItem) {
			((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
		}

		return Registry.register(Registries.ITEM, key, item);
	}
}
