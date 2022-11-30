
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unrealworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.unrealworld.client.model.Modelcustom_model;
import net.mcreator.unrealworld.client.model.ModelSkyHelmet_Converted;
import net.mcreator.unrealworld.client.model.ModelNagrudnik;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UnrealWorldModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSkyHelmet_Converted.LAYER_LOCATION, ModelSkyHelmet_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelNagrudnik.LAYER_LOCATION, ModelNagrudnik::createBodyLayer);
	}
}
