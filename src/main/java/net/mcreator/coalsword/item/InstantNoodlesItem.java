
package net.mcreator.coalsword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.coalsword.CoalswordElements;

@CoalswordElements.ModElement.Tag
public class InstantNoodlesItem extends CoalswordElements.ModElement {
	@ObjectHolder("coalsword:instantnoodles")
	public static final Item block = null;
	public InstantNoodlesItem(CoalswordElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("instantnoodles");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
