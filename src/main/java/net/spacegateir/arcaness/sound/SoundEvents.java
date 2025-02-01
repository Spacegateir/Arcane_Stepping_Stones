package net.spacegateir.arcaness.sound;

import com.google.common.collect.ImmutableList;
import java.util.stream.IntStream;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundEvents {
	public static final SoundEvent BLOCK_DECORATED_POT_BREAK = register("block.decorated_pot.break");
	public static final SoundEvent BLOCK_DECORATED_POT_FALL = register("block.decorated_pot.fall");
	public static final SoundEvent BLOCK_DECORATED_POT_HIT = register("block.decorated_pot.hit");
	public static final SoundEvent BLOCK_DECORATED_POT_STEP = register("block.decorated_pot.step");
	public static final SoundEvent BLOCK_DECORATED_POT_PLACE = register("block.decorated_pot.place");
	public static final SoundEvent BLOCK_DECORATED_POT_SHATTER = register("block.decorated_pot.shatter");

	private static RegistryEntry<SoundEvent> register(Identifier id, Identifier soundId, float distanceToTravel) {
		return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId, distanceToTravel));
	}

	private static SoundEvent register(String id) {
		return register(new Identifier(id));
	}

	private static SoundEvent register(Identifier id) {
		return register(id, id);
	}

	private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
		return registerReference(new Identifier(id));
	}

	private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
		return registerReference(id, id);
	}

	private static SoundEvent register(Identifier id, Identifier soundId) {
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
	}

	private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
		return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
	}

	private static ImmutableList<RegistryEntry.Reference<SoundEvent>> registerGoatHornSounds() {
		return (ImmutableList<RegistryEntry.Reference<SoundEvent>>)IntStream.range(0, 8)
			.mapToObj(variant -> registerReference("item.goat_horn.sound." + variant))
			.collect(ImmutableList.toImmutableList());
	}
}
