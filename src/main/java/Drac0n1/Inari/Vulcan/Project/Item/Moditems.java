package Drac0n1.Inari.Vulcan.Project.Item;

import Drac0n1.Inari.Vulcan.Project.InariVulcanProject;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Moditems {

    public static final Item TEST_WEAPON = registerItem("test_weapon",
    new Item(new FabricItemSettings().group(ModItemGroup.VULCAN)));
    
    public static final Item WEAPON = registerItem("weapon",
    new Item(new FabricItemSettings().group(ModItemGroup.VULCAN)));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(InariVulcanProject.vulcan, name), item);
    }

    public static void registerModItems() {
        
        InariVulcanProject.LOGGER.debug("Registering Mod Items for " + InariVulcanProject.vulcan);

    }
}