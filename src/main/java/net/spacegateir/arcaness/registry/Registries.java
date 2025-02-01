package net.spacegateir.arcaness.registry;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.entity.BannerPatterns;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.command.argument.ArgumentTypes;
import net.minecraft.command.argument.serialize.ArgumentSerializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.Schedule;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.entity.decoration.painting.PaintingVariants;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.CatVariant;
import net.minecraft.entity.passive.FrogVariant;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Instrument;
import net.minecraft.item.Instruments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.entry.LootPoolEntryType;
import net.minecraft.loot.entry.LootPoolEntryTypes;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.loot.function.LootFunctionTypes;
import net.minecraft.loot.provider.nbt.LootNbtProviderType;
import net.minecraft.loot.provider.nbt.LootNbtProviderTypes;
import net.minecraft.loot.provider.number.LootNumberProviderType;
import net.minecraft.loot.provider.number.LootNumberProviderTypes;
import net.minecraft.loot.provider.score.LootScoreProviderType;
import net.minecraft.loot.provider.score.LootScoreProviderTypes;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.*;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.StatType;
import net.minecraft.stat.Stats;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.structure.pool.StructurePoolElementType;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.structure.rule.PosRuleTestType;
import net.minecraft.structure.rule.RuleTestType;
import net.minecraft.structure.rule.blockentity.RuleBlockEntityModifierType;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.floatprovider.FloatProviderType;
import net.minecraft.util.math.intprovider.IntProviderType;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.biome.source.BiomeSources;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.PositionSourceType;
import net.minecraft.world.gen.blockpredicate.BlockPredicateType;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGenerators;
import net.minecraft.world.gen.chunk.placement.StructurePlacementType;
import net.minecraft.world.gen.densityfunction.DensityFunction;
import net.minecraft.world.gen.densityfunction.DensityFunctionTypes;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.size.FeatureSizeType;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.heightprovider.HeightProviderType;
import net.minecraft.world.gen.placementmodifier.PlacementModifierType;
import net.minecraft.world.gen.root.RootPlacerType;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.minecraft.world.gen.structure.StructureType;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class Registries {
	private static final Logger LOGGER = LogUtils.getLogger();
	private static final Map<Identifier, Supplier<?>> DEFAULT_ENTRIES = Maps.<Identifier, Supplier<?>>newLinkedHashMap();
	public static final Identifier ROOT_KEY = new Identifier("root");
	private static final MutableRegistry<MutableRegistry<?>> ROOT = new SimpleRegistry<>(RegistryKey.ofRegistry(ROOT_KEY), Lifecycle.stable());
	public static final Registry<String> DECORATED_POT_PATTERN = create(RegistryKeys.DECORATED_POT_PATTERN, DecoratedPotPatterns::registerAndGetDefault);

	public static final Registry<? extends Registry<?>> REGISTRIES = ROOT;

	private static <T> Registry<T> create(RegistryKey<? extends Registry<T>> key, Initializer<T> initializer) {
		return create(key, Lifecycle.stable(), initializer);
	}

	private static <T> DefaultedRegistry<T> create(RegistryKey<? extends Registry<T>> key, String defaultId, Initializer<T> initializer) {
		return create(key, defaultId, Lifecycle.stable(), initializer);
	}

	private static <T> DefaultedRegistry<T> createIntrusive(RegistryKey<? extends Registry<T>> key, String defaultId, Initializer<T> initializer) {
		return createIntrusive(key, defaultId, Lifecycle.stable(), initializer);
	}

	private static <T> Registry<T> create(RegistryKey<? extends Registry<T>> key, Lifecycle lifecycle, Initializer<T> initializer) {
		return create(key, new SimpleRegistry<>(key, lifecycle, false), initializer, lifecycle);
	}

	private static <T> DefaultedRegistry<T> create(
		RegistryKey<? extends Registry<T>> key, String defaultId, Lifecycle lifecycle, Initializer<T> initializer
	) {
		return create(key, new SimpleDefaultedRegistry<>(defaultId, key, lifecycle, false), initializer, lifecycle);
	}

	private static <T> DefaultedRegistry<T> createIntrusive(
		RegistryKey<? extends Registry<T>> key, String defaultId, Lifecycle lifecycle, Initializer<T> initializer
	) {
		return create(key, new SimpleDefaultedRegistry<>(defaultId, key, lifecycle, true), initializer, lifecycle);
	}

	private static <T, R extends MutableRegistry<T>> R create(
		RegistryKey<? extends Registry<T>> key, R registry, Initializer<T> initializer, Lifecycle lifecycle
	) {
		Identifier identifier = key.getValue();
		DEFAULT_ENTRIES.put(identifier, (Supplier)() -> initializer.run(registry));
		ROOT.add((RegistryKey<MutableRegistry<?>>)key, registry, lifecycle);
		return registry;
	}

	public static void bootstrap() {
		init();
		freezeRegistries();
		validate(REGISTRIES);
	}

	private static void init() {
		DEFAULT_ENTRIES.forEach((id, initializer) -> {
			if (initializer.get() == null) {
				LOGGER.error("Unable to bootstrap registry '{}'", id);
			}
		});
	}

	private static void freezeRegistries() {
		REGISTRIES.freeze();

		for (Registry<?> registry : REGISTRIES) {
			registry.freeze();
		}
	}

	private static <T extends Registry<?>> void validate(Registry<T> registries) {
		registries.forEach(registry -> {
			if (registry.getIds().isEmpty()) {
				Util.error("Registry '" + registries.getId((T)registry) + "' was empty after loading");
			}

			if (registry instanceof DefaultedRegistry) {
				Identifier identifier = ((DefaultedRegistry)registry).getDefaultId();
				Validate.notNull(registry.get(identifier), "Missing default of DefaultedMappedRegistry: " + identifier);
			}
		});
	}

	@FunctionalInterface
	interface Initializer<T> {
		T run(Registry<T> registry);
	}
}
