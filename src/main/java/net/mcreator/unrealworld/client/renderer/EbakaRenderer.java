
package net.mcreator.unrealworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.unrealworld.entity.EbakaEntity;
import net.mcreator.unrealworld.client.model.Modelcustom_model;

public class EbakaRenderer extends MobRenderer<EbakaEntity, Modelcustom_model<EbakaEntity>> {
	public EbakaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(EbakaEntity entity) {
		return new ResourceLocation("unreal_world:textures/entities/ebaka.png");
	}
}
