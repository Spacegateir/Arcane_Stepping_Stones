package net.spacegateir.arcaness.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BlockSoundGroup {

	public static final BlockSoundGroup DECORATED_POT = new BlockSoundGroup(
		1.0F,
		1.0F,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_BREAK,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_STEP,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_PLACE,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_HIT,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_FALL
	);
	public static final BlockSoundGroup DECORATED_POT_SHATTER = new BlockSoundGroup(
		1.0F,
		1.0F,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_SHATTER,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_STEP,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_PLACE,
		net.minecraft.sound.SoundEvents.BLOCK_DECORATED_POT_HIT,
		SoundEvents.BLOCK_DECORATED_POT_FALL
	);
	public final float volume;
	public final float pitch;
	private final SoundEvent breakSound;
	private final SoundEvent stepSound;
	private final SoundEvent placeSound;
	private final SoundEvent hitSound;
	private final SoundEvent fallSound;

	public BlockSoundGroup(
		float volume, float pitch, SoundEvent breakSound, SoundEvent stepSound, SoundEvent placeSound, SoundEvent hitSound, SoundEvent fallSound
	) {
		this.volume = volume;
		this.pitch = pitch;
		this.breakSound = breakSound;
		this.stepSound = stepSound;
		this.placeSound = placeSound;
		this.hitSound = hitSound;
		this.fallSound = fallSound;
	}

	public float getVolume() {
		return this.volume;
	}

	public float getPitch() {
		return this.pitch;
	}

	public SoundEvent getBreakSound() {
		return this.breakSound;
	}

	public SoundEvent getStepSound() {
		return this.stepSound;
	}

	public SoundEvent getPlaceSound() {
		return this.placeSound;
	}

	public SoundEvent getHitSound() {
		return this.hitSound;
	}

	public SoundEvent getFallSound() {
		return this.fallSound;
	}
}
