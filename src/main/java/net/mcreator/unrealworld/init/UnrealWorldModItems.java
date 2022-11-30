
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unrealworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.unrealworld.item.WindRuneItem;
import net.mcreator.unrealworld.item.WaterRuneItem;
import net.mcreator.unrealworld.item.ToxicSubstanceItem;
import net.mcreator.unrealworld.item.StarIngotItem;
import net.mcreator.unrealworld.item.SkySwordItem;
import net.mcreator.unrealworld.item.SkyHekmetItem;
import net.mcreator.unrealworld.item.PieceOfCloudItem;
import net.mcreator.unrealworld.item.IfritCoalItem;
import net.mcreator.unrealworld.item.FireRuneItem;
import net.mcreator.unrealworld.item.EnderSteakItem;
import net.mcreator.unrealworld.item.EarthRuneItem;
import net.mcreator.unrealworld.item.CoinItem;
import net.mcreator.unrealworld.UnrealWorldMod;

public class UnrealWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnrealWorldMod.MODID);
	public static final RegistryObject<Item> CLOUD_BLOCK = block(UnrealWorldModBlocks.CLOUD_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CLOUD_SLAB = block(UnrealWorldModBlocks.CLOUD_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIECE_OF_CLOUD = REGISTRY.register("piece_of_cloud", () -> new PieceOfCloudItem());
	public static final RegistryObject<Item> FIRE_RUNE = REGISTRY.register("fire_rune", () -> new FireRuneItem());
	public static final RegistryObject<Item> WATER_RUNE = REGISTRY.register("water_rune", () -> new WaterRuneItem());
	public static final RegistryObject<Item> WIND_RUNE = REGISTRY.register("wind_rune", () -> new WindRuneItem());
	public static final RegistryObject<Item> EARTH_RUNE = REGISTRY.register("earth_rune", () -> new EarthRuneItem());
	public static final RegistryObject<Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
	public static final RegistryObject<Item> CABBLE_STONE_BRICKS = block(UnrealWorldModBlocks.CABBLE_STONE_BRICKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENDER_STEAK = REGISTRY.register("ender_steak", () -> new EnderSteakItem());
	public static final RegistryObject<Item> STRANGE_STONE = block(UnrealWorldModBlocks.STRANGE_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EBAKA = REGISTRY.register("ebaka_spawn_egg",
			() -> new ForgeSpawnEggItem(UnrealWorldModEntities.EBAKA, -6750208, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TOXIC_SUBSTANCE = REGISTRY.register("toxic_substance", () -> new ToxicSubstanceItem());
	public static final RegistryObject<Item> SKY_SWORD = REGISTRY.register("sky_sword", () -> new SkySwordItem());
	public static final RegistryObject<Item> SKY_HEKMET_HELMET = REGISTRY.register("sky_hekmet_helmet", () -> new SkyHekmetItem.Helmet());
	public static final RegistryObject<Item> SKY_HEKMET_CHESTPLATE = REGISTRY.register("sky_hekmet_chestplate", () -> new SkyHekmetItem.Chestplate());
	public static final RegistryObject<Item> SKY_HEKMET_LEGGINGS = REGISTRY.register("sky_hekmet_leggings", () -> new SkyHekmetItem.Leggings());
	public static final RegistryObject<Item> SKY_HEKMET_BOOTS = REGISTRY.register("sky_hekmet_boots", () -> new SkyHekmetItem.Boots());
	public static final RegistryObject<Item> LEAVE = block(UnrealWorldModBlocks.LEAVE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STAR_INGOT = REGISTRY.register("star_ingot", () -> new StarIngotItem());
	public static final RegistryObject<Item> IFRIT_COAL = REGISTRY.register("ifrit_coal", () -> new IfritCoalItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
