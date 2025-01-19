
package net.mcreator.floops.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.floops.entity.LaserscorpionEntity;

public class LaserscorpionRenderer extends MobRenderer<LaserscorpionEntity, GhastModel<LaserscorpionEntity>> {
	public LaserscorpionRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LaserscorpionEntity entity) {
		return ResourceLocation.parse("floops:textures/entities/2024_12_18_netherite-trooper-22939824.png");
	}
}
