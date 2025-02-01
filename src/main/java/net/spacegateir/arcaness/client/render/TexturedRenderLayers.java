package net.spacegateir.arcaness.client.render;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class TexturedRenderLayers {
	public static final Identifier DECORATED_POT_ATLAS_TEXTURE = new Identifier("textures/atlas/decorated_pot.png");
	public static final Map<RegistryKey<String>, SpriteIdentifier> DECORATED_POT_PATTERN_TEXTURES = (Map<RegistryKey<String>, SpriteIdentifier>)Registries.DECORATED_POT_PATTERN
		.getKeys()
		.stream()
		.collect(Collectors.toMap(Function.identity(), TexturedRenderLayers::createDecoratedPotPatternTextureId));

	private static SpriteIdentifier createDecoratedPotPatternTextureId(RegistryKey<String> potPatternKey) {
		return new SpriteIdentifier(DECORATED_POT_ATLAS_TEXTURE, DecoratedPotPatterns.getTextureId(potPatternKey));
	}

	@Nullable
	public static SpriteIdentifier getDecoratedPotPatternTextureId(@Nullable RegistryKey<String> potPatternKey) {
		return potPatternKey == null ? null : (SpriteIdentifier)DECORATED_POT_PATTERN_TEXTURES.get(potPatternKey);
	}

}
