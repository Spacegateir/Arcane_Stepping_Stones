package net.spacegateir.arcaness.registry.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ItemTags {
	public static final TagKey<Item> DECORATED_POT_SHERDS = of("decorated_pot_sherds");
	public static final TagKey<Item> DECORATED_POT_INGREDIENTS = of("decorated_pot_ingredients");
	public static final TagKey<Item> BREAKS_DECORATED_POTS = of("breaks_decorated_pots");

	private ItemTags() {
	}

	private static TagKey<Item> of(String id) {
		return TagKey.of(RegistryKeys.ITEM, new Identifier(id));
	}
}
