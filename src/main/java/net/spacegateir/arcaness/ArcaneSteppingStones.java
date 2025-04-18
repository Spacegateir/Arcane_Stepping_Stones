package net.spacegateir.arcaness;

import net.fabricmc.api.ModInitializer;

import net.spacegateir.arcaness.block.ModBlocks;
import net.spacegateir.arcaness.creative_tab.ModItemGroups;
import net.spacegateir.arcaness.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneSteppingStones implements ModInitializer {

	public static final String MOD_ID = "arcane_stepping_stones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();


		LOGGER.info("Hello Fabric world!");
	}
}