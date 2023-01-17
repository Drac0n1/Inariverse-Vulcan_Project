package Drac0n1.Inari.Vulcan.Project.Item;
import Drac0n1.Inari.Vulcan.Project.InariVulcanProject;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;



public class ModItemGroup {
    public static final ItemGroup VULCAN = FabricItemGroupBuilder.build(
        new Identifier(InariVulcanProject.vulcan, "vulcan"), () -> new ItemStack(Moditems.TEST_WEAPON));
}