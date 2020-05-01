
package net.mcreator.coalsword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.coalsword.CoalswordElements;

@CoalswordElements.ModElement.Tag
public class TrufaWaveItem extends CoalswordElements.ModElement {
	@ObjectHolder("coalsword:trufawave")
	public static final Item block = null;
	public TrufaWaveItem(CoalswordElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CoalswordElements.sounds.get(new ResourceLocation("coalsword:trufa_wave")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("trufawave");
		}
	}
}
