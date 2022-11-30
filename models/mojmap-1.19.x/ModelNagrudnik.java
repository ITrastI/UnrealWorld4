// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNagrudnik<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nagrudnik"), "main");
	private final ModelPart osnova;
	private final ModelPart right;
	private final ModelPart left;

	public ModelNagrudnik(ModelPart root) {
		this.osnova = root.getChild("osnova");
		this.right = root.getChild("right");
		this.left = root.getChild("left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition osnova = partdefinition.addOrReplaceChild("osnova", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = osnova.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 93).mirror()
				.addBox(3.0F, 5.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 45)
				.mirror().addBox(2.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 93).mirror().addBox(3.0F, 5.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(4, 91).addBox(-4.0F, 5.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 91).addBox(-4.0F, 5.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
				.addBox(-4.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 89)
				.addBox(-2.0F, 1.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 89)
				.addBox(-3.0F, 2.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
				.addBox(-4.0F, 3.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 62)
				.addBox(-4.0F, 4.85F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 89)
				.addBox(1.0F, 1.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 89)
				.addBox(2.0F, 2.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 89)
				.addBox(3.0F, 3.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
				.addBox(1.0F, 4.85F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 89)
				.addBox(2.0F, 0.85F, -3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 89)
				.addBox(-3.0F, 0.85F, -3.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 77)
				.addBox(-4.0F, 1.85F, -3.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 77)
				.addBox(3.0F, 1.85F, -3.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 95)
				.addBox(3.0F, -0.15F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 95)
				.addBox(-4.0F, -0.15F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 95)
				.addBox(-4.0F, -1.15F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 95)
				.addBox(-4.0F, 0.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
				.addBox(-3.0F, -0.15F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 97)
				.addBox(2.0F, -0.15F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 97)
				.addBox(3.0F, -1.15F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 97)
				.addBox(3.0F, 0.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 97)
				.addBox(1.0F, 1.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 97)
				.addBox(1.0F, 3.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 97)
				.addBox(2.0F, 2.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 97)
				.addBox(-3.0F, 2.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 97)
				.addBox(-2.0F, 1.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 81)
				.addBox(-1.0F, 4.85F, -3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 97)
				.addBox(-2.0F, 3.85F, -3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 81)
				.addBox(-1.0F, 0.85F, -3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 81)
				.addBox(-3.0F, 4.85F, -3.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 83)
				.addBox(1.0F, 4.85F, -3.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 97)
				.addBox(1.0F, 2.85F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 67)
				.addBox(-1.0F, 1.85F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 97)
				.addBox(-2.0F, 2.85F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 83)
				.addBox(3.0F, -2.15F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 83)
				.addBox(-4.0F, -2.15F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 83)
				.addBox(-3.0F, -4.15F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
				.addBox(-2.0F, -5.15F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
				.addBox(2.0F, -4.15F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 95)
				.addBox(-3.0F, -7.15F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 95)
				.addBox(2.0F, -7.15F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
				.addBox(-1.0F, -3.15F, 3.0F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
				.addBox(-2.0F, -4.15F, 2.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 58)
				.addBox(-2.0F, -5.15F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
				.addBox(-2.0F, -5.35F, 2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 89)
				.addBox(-4.0F, -2.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 89)
				.addBox(-3.0F, -4.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 89)
				.addBox(2.0F, -4.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 89)
				.addBox(3.0F, -2.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 93)
				.addBox(3.0F, -6.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 93)
				.addBox(-4.0F, -6.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 86)
				.addBox(-3.0F, -0.35F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 86)
				.addBox(2.0F, -0.35F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 86)
				.addBox(3.0F, -1.35F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 86)
				.addBox(-4.0F, -1.35F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
				.addBox(-3.0F, -7.35F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 95)
				.addBox(1.0F, -6.15F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 95)
				.addBox(-2.0F, -6.15F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 60)
				.addBox(-2.0F, -7.15F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 56)
				.addBox(3.2F, 0.85F, -3.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 56)
				.addBox(-4.2F, 0.85F, -3.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 93)
				.addBox(2.2F, -7.15F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
				.addBox(-3.8F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
				.addBox(-2.8F, -0.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 95)
				.addBox(3.2F, -6.15F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 91)
				.addBox(1.2F, -5.15F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 83)
				.addBox(2.2F, -4.15F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 83)
				.addBox(3.2F, -2.15F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 86)
				.addBox(3.2F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 72)
				.addBox(3.2F, -4.15F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 86)
				.addBox(2.8F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 86)
				.addBox(1.8F, -0.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-4.2F, -6.15F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 83)
				.addBox(-4.2F, -2.15F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 83)
				.addBox(-3.2F, -4.15F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 89)
				.addBox(-2.2F, -5.15F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 95)
				.addBox(-3.2F, -7.15F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 86)
				.addBox(-4.2F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 72)
				.addBox(-4.2F, -4.15F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
				.addBox(3.5F, -0.15F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
				.addBox(-4.5F, -0.15F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 83)
				.addBox(-1.0F, -6.15F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 50)
				.addBox(-3.0F, -7.15F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 56)
				.addBox(-2.0F, -5.15F, 2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 32)
				.addBox(-3.0F, -4.15F, 2.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 16)
				.addBox(-4.0F, -2.15F, 2.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 89)
				.addBox(-4.0F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 89)
				.addBox(3.0F, -1.15F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
				.addBox(2.0F, -0.15F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 77)
				.addBox(-4.0F, -0.15F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
				.addBox(-4.0F, 0.85F, -3.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
				.addBox(-4.0F, -6.15F, -2.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r2 = osnova.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 95)
						.addBox(1.8149F, -3.15F, -3.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 69)
						.addBox(-0.1851F, -2.15F, -3.9577F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 81)
						.addBox(0.8149F, -4.15F, -3.9577F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 95)
						.addBox(-0.1851F, -6.15F, -3.9577F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, -0.3923F, -3.1235F));

		PartDefinition cube_r3 = osnova.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 95)
						.addBox(-2.8149F, -3.15F, -3.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 67)
						.addBox(-2.8149F, -2.15F, -3.9577F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 81)
						.addBox(-2.8149F, -4.15F, -3.9577F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 95)
						.addBox(-2.8149F, -6.15F, -3.9577F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.3923F, 3.1235F));

		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create(),
				PartPose.offset(5.2143F, 2.8405F, 0.5F));

		PartDefinition cube_r4 = right.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 107).mirror()
				.addBox(-9.0F, -7.15F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 105).mirror().addBox(-9.0F, -6.15F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(28, 32).mirror()
				.addBox(-10.0F, 1.85F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 50)
				.mirror().addBox(-9.0F, 4.85F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 72).mirror().addBox(-6.0F, 3.85F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(18, 83).mirror()
				.addBox(-8.0F, 1.85F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 72)
				.mirror().addBox(-9.0F, 1.85F, 2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 62).mirror().addBox(-8.0F, 2.85F, 2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(40, 93).mirror()
				.addBox(-5.0F, 5.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 93)
				.mirror().addBox(-5.0F, 4.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 81).mirror().addBox(-6.0F, 3.85F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(6, 81).mirror()
				.addBox(-6.0F, 3.35F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 93)
				.mirror().addBox(-10.0F, 1.85F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 93).mirror().addBox(-9.5F, 1.85F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 93).mirror()
				.addBox(-7.0F, 2.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 67)
				.mirror().addBox(-9.0F, 1.85F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 81).mirror().addBox(-8.0F, 1.35F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 93).mirror()
				.addBox(-10.0F, 1.35F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 97)
				.mirror().addBox(-9.0F, 0.85F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 72).mirror().addBox(-10.0F, 0.85F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(52, 97).mirror()
				.addBox(-9.0F, 0.85F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 81)
				.mirror().addBox(-6.0F, 3.35F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 86).mirror().addBox(-6.5F, 1.85F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 86).mirror()
				.addBox(-6.5F, 1.85F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 81)
				.mirror().addBox(-8.0F, 1.35F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 93).mirror().addBox(-10.0F, 1.35F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 67).mirror()
				.addBox(-10.5F, 2.85F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 50)
				.mirror().addBox(-10.5F, 1.85F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 93).mirror().addBox(-10.0F, 1.85F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(28, 93).mirror()
				.addBox(-9.5F, 1.85F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 69)
				.mirror().addBox(-9.0F, 1.85F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 93).mirror().addBox(-7.0F, 2.85F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(36, 81).mirror()
				.addBox(-6.0F, 3.85F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 40)
				.mirror().addBox(-8.0F, 6.35F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 93).mirror().addBox(-5.0F, 5.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(12, 93).mirror()
				.addBox(-5.0F, 4.85F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 83)
				.mirror().addBox(-8.0F, 1.85F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 45).mirror().addBox(-6.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(38, 72).mirror()
				.addBox(-6.0F, 3.85F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 62)
				.mirror().addBox(-8.0F, 2.85F, -2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 72).mirror().addBox(-9.0F, 1.85F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(24, 40).mirror()
				.addBox(-8.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.2143F, 3.1595F, -0.5F, 0.0F, 0.0F, 3.1416F));

		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(),
				PartPose.offset(-5.2143F, 2.8405F, 0.5F));

		PartDefinition cube_r5 = left.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(21, 107)
						.addBox(7.0F, -7.15F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 105)
						.addBox(8.0F, -6.15F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 32)
						.addBox(9.0F, 1.85F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 50)
						.addBox(8.0F, 4.85F, -1.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 72)
						.addBox(4.0F, 3.85F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 83)
						.addBox(6.0F, 1.85F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 72)
						.addBox(8.0F, 1.85F, 2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 62)
						.addBox(6.0F, 2.85F, 2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 93)
						.addBox(4.0F, 5.35F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 93)
						.addBox(4.0F, 4.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 81)
						.addBox(4.0F, 3.85F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 81)
						.addBox(4.0F, 3.35F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 93)
						.addBox(9.0F, 1.85F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 93)
						.addBox(8.5F, 1.85F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 93)
						.addBox(6.0F, 2.85F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 67)
						.addBox(6.0F, 1.85F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 81)
						.addBox(6.0F, 1.35F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 93)
						.addBox(9.0F, 1.35F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 97)
						.addBox(8.0F, 0.85F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 72)
						.addBox(9.0F, 0.85F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 97)
						.addBox(8.0F, 0.85F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 81)
						.addBox(4.0F, 3.35F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 86)
						.addBox(5.5F, 1.85F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 86)
						.addBox(5.5F, 1.85F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 81)
						.addBox(6.0F, 1.35F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 93)
						.addBox(9.0F, 1.35F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(9.5F, 2.85F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 50)
						.addBox(9.5F, 1.85F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 93)
						.addBox(9.0F, 1.85F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 93)
						.addBox(8.5F, 1.85F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 69)
						.addBox(6.0F, 1.85F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 93)
						.addBox(6.0F, 2.85F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 81)
						.addBox(4.0F, 3.85F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(6.0F, 6.35F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(4.0F, 5.35F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 93)
						.addBox(4.0F, 4.85F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 83)
						.addBox(6.0F, 1.85F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 45)
						.addBox(4.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 72)
						.addBox(4.0F, 3.85F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 62)
						.addBox(6.0F, 2.85F, -2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 72)
						.addBox(8.0F, 1.85F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(6.0F, 5.85F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2143F, 3.1595F, -0.5F, 0.0F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		osnova.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}