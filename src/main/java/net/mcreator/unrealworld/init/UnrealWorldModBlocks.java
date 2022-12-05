
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unrealworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.unrealworld.block.ToxicWoodBlock;
import net.mcreator.unrealworld.block.ToxicStairsBlock;
import net.mcreator.unrealworld.block.ToxicSlabBlock;
import net.mcreator.unrealworld.block.ToxicPressurePlateBlock;
import net.mcreator.unrealworld.block.ToxicPlanksBlock;
import net.mcreator.unrealworld.block.ToxicLogBlock;
import net.mcreator.unrealworld.block.ToxicLeavesBlock;
import net.mcreator.unrealworld.block.ToxicFenceGateBlock;
import net.mcreator.unrealworld.block.ToxicFenceBlock;
import net.mcreator.unrealworld.block.ToxicButtonBlock;
import net.mcreator.unrealworld.block.StrangeWoodWoodBlock;
import net.mcreator.unrealworld.block.StrangeWoodLogBlock;
import net.mcreator.unrealworld.block.StrangeWoodLeavesBlock;
import net.mcreator.unrealworld.block.FireIngotMaterialsOreBlock;
import net.mcreator.unrealworld.block.FireIngotMaterialsBlockBlock;
import net.mcreator.unrealworld.block.CloudSlabBlock;
import net.mcreator.unrealworld.block.CloudBlockBlock;
import net.mcreator.unrealworld.block.CabbleStoneBricksBlock;
import net.mcreator.unrealworld.UnrealWorldMod;

public class UnrealWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UnrealWorldMod.MODID);
	public static final RegistryObject<Block> CLOUD_BLOCK = REGISTRY.register("cloud_block", () -> new CloudBlockBlock());
	public static final RegistryObject<Block> CLOUD_SLAB = REGISTRY.register("cloud_slab", () -> new CloudSlabBlock());
	public static final RegistryObject<Block> CABBLE_STONE_BRICKS = REGISTRY.register("cabble_stone_bricks", () -> new CabbleStoneBricksBlock());
	public static final RegistryObject<Block> STRANGE_WOOD_WOOD = REGISTRY.register("strange_wood_wood", () -> new StrangeWoodWoodBlock());
	public static final RegistryObject<Block> STRANGE_WOOD_LOG = REGISTRY.register("strange_wood_log", () -> new StrangeWoodLogBlock());
	public static final RegistryObject<Block> STRANGE_WOOD_LEAVES = REGISTRY.register("strange_wood_leaves", () -> new StrangeWoodLeavesBlock());
	public static final RegistryObject<Block> FIRE_INGOT_MATERIALS_ORE = REGISTRY.register("fire_ingot_materials_ore",
			() -> new FireIngotMaterialsOreBlock());
	public static final RegistryObject<Block> FIRE_INGOT_MATERIALS_BLOCK = REGISTRY.register("fire_ingot_materials_block",
			() -> new FireIngotMaterialsBlockBlock());
	public static final RegistryObject<Block> TOXIC_PLANKS = REGISTRY.register("toxic_planks", () -> new ToxicPlanksBlock());
	public static final RegistryObject<Block> TOXIC_LEAVES = REGISTRY.register("toxic_leaves", () -> new ToxicLeavesBlock());
	public static final RegistryObject<Block> TOXIC_STAIRS = REGISTRY.register("toxic_stairs", () -> new ToxicStairsBlock());
	public static final RegistryObject<Block> TOXIC_SLAB = REGISTRY.register("toxic_slab", () -> new ToxicSlabBlock());
	public static final RegistryObject<Block> TOXIC_FENCE = REGISTRY.register("toxic_fence", () -> new ToxicFenceBlock());
	public static final RegistryObject<Block> TOXIC_FENCE_GATE = REGISTRY.register("toxic_fence_gate", () -> new ToxicFenceGateBlock());
	public static final RegistryObject<Block> TOXIC_PRESSURE_PLATE = REGISTRY.register("toxic_pressure_plate", () -> new ToxicPressurePlateBlock());
	public static final RegistryObject<Block> TOXIC_BUTTON = REGISTRY.register("toxic_button", () -> new ToxicButtonBlock());
	public static final RegistryObject<Block> TOXIC_LOG = REGISTRY.register("toxic_log", () -> new ToxicLogBlock());
	public static final RegistryObject<Block> TOXIC_WOOD = REGISTRY.register("toxic_wood", () -> new ToxicWoodBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CloudSlabBlock.blockColorLoad(event);
		}
	}
}
