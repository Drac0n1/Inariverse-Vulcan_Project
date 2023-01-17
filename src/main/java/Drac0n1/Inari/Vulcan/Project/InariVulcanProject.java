package Drac0n1.Inari.Vulcan.Project;

import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Drac0n1.Inari.Vulcan.Project.Item.Moditems;

public class InariVulcanProject implements ModInitializer {


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static String vulcan;

	@Override
	public void onInitialize() {

		Moditems.registerModItems();
	}
}
