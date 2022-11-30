// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSkyHelmet_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "skyhelmet_converted"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelSkyHelmet_Converted(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(54, 28)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 33)
						.addBox(-4.0F, -8.0F, 4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 57)
						.addBox(1.0F, -10.0F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 36)
						.addBox(-2.0F, -10.0F, -4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(53, 50)
						.addBox(-1.0F, -11.0F, -4.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(-1.0F, -10.0F, -5.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(1.0F, -4.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-2.0F, -4.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(2.0F, -3.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(-5.0F, -8.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 33)
						.addBox(-3.0F, -3.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 30)
						.addBox(-1.0F, 0.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
						.addBox(-1.0F, -4.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 39)
						.addBox(-1.0F, -7.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(-1.0F, -8.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 26)
						.addBox(-4.0F, -7.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 2)
						.addBox(-4.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 30)
						.addBox(1.0F, -7.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-2.0F, -6.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(1.0F, -6.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(2.0F, -5.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 10)
						.addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-4.0F, -9.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(2.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 38)
						.addBox(2.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(-3.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 35)
						.addBox(-3.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 28)
						.addBox(3.0F, -9.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(1.0F, -9.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(1.0F, -8.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(0.0F, -8.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(0.0F, -8.0F, 6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.0F, 6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 17)
						.addBox(-1.0F, -8.0F, 5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 32)
						.addBox(-2.0F, -8.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 48)
						.addBox(2.0F, -10.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-3.0F, -10.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(-2.0F, -9.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}