
package net.mcreator.unrealworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.unrealworld.procedures.ToxicSubstanceIghrokZakanchivaietIspolzovaniiePriedmietaProcedure;

public class ToxicSubstanceItem extends Item {
	public ToxicSubstanceItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(-1).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ToxicSubstanceIghrokZakanchivaietIspolzovaniiePriedmietaProcedure.execute(entity);
		return retval;
	}
}
