
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

import net.mcreator.unrealworld.item.ZabivuchkaItem;
import net.mcreator.unrealworld.item.WindRuneItem;
import net.mcreator.unrealworld.item.WaterRuneItem;
import net.mcreator.unrealworld.item.ToxicSubstanceItem;
import net.mcreator.unrealworld.item.StarIngotItem;
import net.mcreator.unrealworld.item.SkySwordItem;
import net.mcreator.unrealworld.item.SkyHekmetItem;
import net.mcreator.unrealworld.item.PieceOfCloudItem;
import net.mcreator.unrealworld.item.ObsidianWandItem;
import net.mcreator.unrealworld.item.IfritCoalItem;
import net.mcreator.unrealworld.item.FireRuneItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsSwordItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsShovelItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsPickaxeItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsIngotItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsHoeItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsAxeItem;
import net.mcreator.unrealworld.item.FireIngotMaterialsArmorItem;
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
	public static final RegistryObject<Item> EBAKA = REGISTRY.register("ebaka_spawn_egg",
			() -> new ForgeSpawnEggItem(UnrealWorldModEntities.EBAKA, -6750208, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TOXIC_SUBSTANCE = REGISTRY.register("toxic_substance", () -> new ToxicSubstanceItem());
	public static final RegistryObject<Item> SKY_SWORD = REGISTRY.register("sky_sword", () -> new SkySwordItem());
	public static final RegistryObject<Item> SKY_HEKMET_HELMET = REGISTRY.register("sky_hekmet_helmet", () -> new SkyHekmetItem.Helmet());
	public static final RegistryObject<Item> SKY_HEKMET_CHESTPLATE = REGISTRY.register("sky_hekmet_chestplate", () -> new SkyHekmetItem.Chestplate());
	public static final RegistryObject<Item> SKY_HEKMET_LEGGINGS = REGISTRY.register("sky_hekmet_leggings", () -> new SkyHekmetItem.Leggings());
	public static final RegistryObject<Item> SKY_HEKMET_BOOTS = REGISTRY.register("sky_hekmet_boots", () -> new SkyHekmetItem.Boots());
	public static final RegistryObject<Item> STAR_INGOT = REGISTRY.register("star_ingot", () -> new StarIngotItem());
	public static final RegistryObject<Item> IFRIT_COAL = REGISTRY.register("ifrit_coal", () -> new IfritCoalItem());
	public static final RegistryObject<Item> STRANGE_WOOD_WOOD = block(UnrealWorldModBlocks.STRANGE_WOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRANGE_WOOD_LOG = block(UnrealWorldModBlocks.STRANGE_WOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STRANGE_WOOD_LEAVES = block(UnrealWorldModBlocks.STRANGE_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_INGOT = REGISTRY.register("fire_ingot_materials_ingot",
			() -> new FireIngotMaterialsIngotItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_ORE = block(UnrealWorldModBlocks.FIRE_INGOT_MATERIALS_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_BLOCK = block(UnrealWorldModBlocks.FIRE_INGOT_MATERIALS_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_PICKAXE = REGISTRY.register("fire_ingot_materials_pickaxe",
			() -> new FireIngotMaterialsPickaxeItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_AXE = REGISTRY.register("fire_ingot_materials_axe",
			() -> new FireIngotMaterialsAxeItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_SWORD = REGISTRY.register("fire_ingot_materials_sword",
			() -> new FireIngotMaterialsSwordItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_SHOVEL = REGISTRY.register("fire_ingot_materials_shovel",
			() -> new FireIngotMaterialsShovelItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_HOE = REGISTRY.register("fire_ingot_materials_hoe",
			() -> new FireIngotMaterialsHoeItem());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_ARMOR_HELMET = REGISTRY.register("fire_ingot_materials_armor_helmet",
			() -> new FireIngotMaterialsArmorItem.Helmet());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_ARMOR_CHESTPLATE = REGISTRY.register("fire_ingot_materials_armor_chestplate",
			() -> new FireIngotMaterialsArmorItem.Chestplate());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_ARMOR_LEGGINGS = REGISTRY.register("fire_ingot_materials_armor_leggings",
			() -> new FireIngotMaterialsArmorItem.Leggings());
	public static final RegistryObject<Item> FIRE_INGOT_MATERIALS_ARMOR_BOOTS = REGISTRY.register("fire_ingot_materials_armor_boots",
			() -> new FireIngotMaterialsArmorItem.Boots());
	public static final RegistryObject<Item> TOXIC_PLANKS = block(UnrealWorldModBlocks.TOXIC_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOXIC_LEAVES = block(UnrealWorldModBlocks.TOXIC_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TOXIC_STAIRS = block(UnrealWorldModBlocks.TOXIC_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOXIC_SLAB = block(UnrealWorldModBlocks.TOXIC_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOXIC_FENCE = block(UnrealWorldModBlocks.TOXIC_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TOXIC_FENCE_GATE = block(UnrealWorldModBlocks.TOXIC_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TOXIC_PRESSURE_PLATE = block(UnrealWorldModBlocks.TOXIC_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TOXIC_BUTTON = block(UnrealWorldModBlocks.TOXIC_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOXIC_LOG = block(UnrealWorldModBlocks.TOXIC_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOXIC_WOOD = block(UnrealWorldModBlocks.TOXIC_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OBSIDIAN_WAND = REGISTRY.register("obsidian_wand", () -> new ObsidianWandItem());
	public static final RegistryObject<Item> ZABIVUCHKA = REGISTRY.register("zabivuchka", () -> new ZabivuchkaItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
