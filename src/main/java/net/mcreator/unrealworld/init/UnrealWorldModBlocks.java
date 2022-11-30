
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

import net.mcreator.unrealworld.block.StrangeStoneBlock;
import net.mcreator.unrealworld.block.LeaveBlock;
import net.mcreator.unrealworld.block.CloudSlabBlock;
import net.mcreator.unrealworld.block.CloudBlockBlock;
import net.mcreator.unrealworld.block.CabbleStoneBricksBlock;
import net.mcreator.unrealworld.UnrealWorldMod;

public class UnrealWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UnrealWorldMod.MODID);
	public static final RegistryObject<Block> CLOUD_BLOCK = REGISTRY.register("cloud_block", () -> new CloudBlockBlock());
	public static final RegistryObject<Block> CLOUD_SLAB = REGISTRY.register("cloud_slab", () -> new CloudSlabBlock());
	public static final RegistryObject<Block> CABBLE_STONE_BRICKS = REGISTRY.register("cabble_stone_bricks", () -> new CabbleStoneBricksBlock());
	public static final RegistryObject<Block> STRANGE_STONE = REGISTRY.register("strange_stone", () -> new StrangeStoneBlock());
	public static final RegistryObject<Block> LEAVE = REGISTRY.register("leave", () -> new LeaveBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CloudSlabBlock.blockColorLoad(event);
		}
	}
}
