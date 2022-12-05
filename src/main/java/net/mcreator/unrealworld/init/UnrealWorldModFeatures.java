
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unrealworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.unrealworld.world.features.ores.FireIngotMaterialsOreFeature;
import net.mcreator.unrealworld.UnrealWorldMod;

@Mod.EventBusSubscriber
public class UnrealWorldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, UnrealWorldMod.MODID);
	public static final RegistryObject<Feature<?>> FIRE_INGOT_MATERIALS_ORE = REGISTRY.register("fire_ingot_materials_ore",
			FireIngotMaterialsOreFeature::feature);
}
