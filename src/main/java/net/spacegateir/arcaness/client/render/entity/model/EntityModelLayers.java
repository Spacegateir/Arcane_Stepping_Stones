package net.spacegateir.arcaness.client.render.entity.model;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.WoodType;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EntityModelLayers {
	private static final String MAIN = "main";
	private static final Set<EntityModelLayer> LAYERS = Sets.<EntityModelLayer>newHashSet();
	public static final EntityModelLayer DECORATED_POT_BASE = registerMain("decorated_pot_base");
	public static final EntityModelLayer DECORATED_POT_SIDES = registerMain("decorated_pot_sides");

	private static EntityModelLayer registerMain(String id) {
		return register(id, "main");
	}

	private static EntityModelLayer register(String id, String layer) {
		EntityModelLayer entityModelLayer = create(id, layer);
		if (!LAYERS.add(entityModelLayer)) {
			throw new IllegalStateException("Duplicate registration for " + entityModelLayer);
		} else {
			return entityModelLayer;
		}
	}

	private static EntityModelLayer create(String id, String layer) {
		return new EntityModelLayer(new Identifier("minecraft", id), layer);
	}

	public static Stream<EntityModelLayer> getLayers() {
		return LAYERS.stream();
	}
}
