// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart Leftarmor;
	private final ModelPart Leftarmor2;
	private final ModelPart Grud;
	private final ModelPart osnova;

	public Modelcustom_model(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.Leftarmor = root.getChild("Leftarmor");
		this.Leftarmor2 = root.getChild("Leftarmor2");
		this.Grud = root.getChild("Grud");
		this.osnova = root.getChild("osnova");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Leftarmor = partdefinition.addOrReplaceChild("Leftarmor",
				CubeListBuilder.create().texOffs(24, 40)
						.addBox(2.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 72)
						.addBox(4.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 62)
						.addBox(2.0F, -3.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 72)
						.addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 45)
						.addBox(0.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 83)
						.addBox(2.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 93)
						.addBox(0.0F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(0.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(2.0F, -3.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 81)
						.addBox(0.0F, -1.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 93)
						.addBox(2.0F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 69)
						.addBox(2.0F, 1.0F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 93)
						.addBox(4.5F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 93)
						.addBox(5.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 50)
						.addBox(5.5F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(5.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 93)
						.addBox(5.0F, 1.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 81)
						.addBox(2.0F, 1.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 86)
						.addBox(1.5F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 86)
						.addBox(1.5F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 81)
						.addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 97)
						.addBox(4.0F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 72)
						.addBox(5.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 97)
						.addBox(4.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 93)
						.addBox(5.0F, 1.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 81)
						.addBox(2.0F, 1.5F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 67)
						.addBox(2.0F, 1.0F, 2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 93)
						.addBox(2.0F, 0.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 93)
						.addBox(4.5F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 93)
						.addBox(5.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 81)
						.addBox(0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 81)
						.addBox(0.0F, -1.0F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 93)
						.addBox(0.0F, -2.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 93)
						.addBox(0.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 93)
						.addBox(-2.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 45)
						.addBox(-2.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(-2.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 93)
						.addBox(-2.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 45)
						.addBox(-2.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(-2.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 62)
						.addBox(2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 72)
						.addBox(4.0F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 83)
						.addBox(2.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 72)
						.addBox(0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 50)
						.addBox(4.0F, -3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 32)
						.addBox(5.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 105)
						.addBox(4.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 107)
						.addBox(3.0F, 10.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition Leftarmor2 = partdefinition.addOrReplaceChild("Leftarmor2",
				CubeListBuilder.create().texOffs(0, 45)
						.addBox(2.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(4.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 62)
						.addBox(2.0F, -3.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 67)
						.addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(0.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(2.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 91)
						.addBox(0.0F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 91)
						.addBox(0.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 35)
						.addBox(2.0F, -3.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 77)
						.addBox(0.0F, -1.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(-3.0F, -2.0F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 89)
						.addBox(-1.0F, -1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 89)
						.addBox(-2.0F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 89)
						.addBox(-3.0F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 89)
						.addBox(-6.0F, 1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 89)
						.addBox(-7.0F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-8.0F, -1.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 62)
						.addBox(-8.0F, -2.0F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 91)
						.addBox(2.0F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 62)
						.addBox(2.0F, 1.0F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 91)
						.addBox(4.5F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 91)
						.addBox(5.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 50)
						.addBox(5.5F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 62)
						.addBox(5.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 91)
						.addBox(5.0F, 1.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 79)
						.addBox(2.0F, 1.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 86)
						.addBox(1.5F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 86)
						.addBox(1.5F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 77)
						.addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 91)
						.addBox(4.0F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 67)
						.addBox(5.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 91)
						.addBox(4.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 91)
						.addBox(5.0F, 1.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 79)
						.addBox(2.0F, 1.5F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 62)
						.addBox(2.0F, 1.0F, 2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 91)
						.addBox(2.0F, 0.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 91)
						.addBox(4.5F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 91)
						.addBox(5.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 77)
						.addBox(0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 79)
						.addBox(0.0F, -1.0F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 91)
						.addBox(0.0F, -2.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 91)
						.addBox(0.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 91)
						.addBox(-2.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 91)
						.addBox(-2.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 91)
						.addBox(0.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 91)
						.addBox(0.0F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(0.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 67)
						.addBox(4.0F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 77)
						.addBox(2.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 67)
						.addBox(0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(4.0F, -3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 32)
						.addBox(5.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 107)
						.addBox(3.0F, 10.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 105)
						.addBox(4.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Grud = partdefinition.addOrReplaceChild("Grud",
				CubeListBuilder.create().texOffs(44, 97)
						.addBox(-2.0F, -1.46F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 67)
						.addBox(-1.0F, -2.46F, -0.692F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 97)
						.addBox(1.0F, -1.46F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 83)
						.addBox(1.0F, -3.46F, -0.592F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 81)
						.addBox(-3.0F, -3.46F, -0.592F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 81)
						.addBox(-1.0F, 0.54F, -0.392F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 97)
						.addBox(-2.0F, -2.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 81)
						.addBox(-1.0F, -3.46F, -0.392F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 97)
						.addBox(-2.0F, -0.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 97)
						.addBox(-3.0F, -1.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 97)
						.addBox(2.0F, -1.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 97)
						.addBox(1.0F, -2.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 97)
						.addBox(1.0F, -0.46F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 97)
						.addBox(3.0F, 0.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 97)
						.addBox(3.0F, 2.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 97)
						.addBox(2.0F, 1.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
						.addBox(-3.0F, 1.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 95)
						.addBox(-4.0F, 0.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 95)
						.addBox(-4.0F, 2.54F, -0.392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 95)
						.addBox(-4.0F, 1.54F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 95)
						.addBox(3.0F, 1.54F, -0.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 77)
						.addBox(3.0F, -2.46F, -0.592F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 77)
						.addBox(-4.0F, -2.46F, -0.592F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 89)
						.addBox(-3.0F, 0.54F, -0.592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 89)
						.addBox(2.0F, 0.54F, -0.592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.46F, -3.808F));

		PartDefinition osnova = partdefinition.addOrReplaceChild("osnova",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.0F, -24.0F, -4.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 77)
						.addBox(-4.0F, -19.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
						.addBox(2.0F, -19.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 89)
						.addBox(3.0F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 89)
						.addBox(-4.0F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 16)
						.addBox(-4.0F, -24.0F, 2.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 32)
						.addBox(-3.0F, -16.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 56)
						.addBox(-2.0F, -14.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 50)
						.addBox(-3.0F, -12.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 83)
						.addBox(-1.0F, -13.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
						.addBox(-4.5F, -19.0F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
						.addBox(3.5F, -19.0F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 72)
						.addBox(-4.2F, -18.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 86)
						.addBox(-4.2F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 95)
						.addBox(-3.2F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 89)
						.addBox(-2.2F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 83)
						.addBox(-3.2F, -16.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 83)
						.addBox(-4.2F, -18.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(-4.2F, -13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 86)
						.addBox(1.8F, -19.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 86)
						.addBox(2.8F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 72)
						.addBox(3.2F, -18.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 86)
						.addBox(3.2F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 83)
						.addBox(3.2F, -18.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 83)
						.addBox(2.2F, -16.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 91)
						.addBox(1.2F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 95)
						.addBox(3.2F, -13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
						.addBox(-2.8F, -19.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
						.addBox(-3.8F, -18.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 93)
						.addBox(2.2F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 56)
						.addBox(-4.2F, -23.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 56)
						.addBox(3.2F, -23.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 60)
						.addBox(-2.0F, -12.0F, -3.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 95)
						.addBox(-2.0F, -13.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 95)
						.addBox(1.0F, -13.0F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
						.addBox(-3.0F, -11.8F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 86)
						.addBox(-4.0F, -17.8F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 86)
						.addBox(3.0F, -17.8F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 86)
						.addBox(2.0F, -18.8F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 86)
						.addBox(-3.0F, -18.8F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 93)
						.addBox(-4.0F, -12.8F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 93)
						.addBox(3.0F, -12.8F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 89)
						.addBox(3.0F, -16.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 89)
						.addBox(2.0F, -14.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 89)
						.addBox(-3.0F, -14.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 89)
						.addBox(-4.0F, -16.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-2.0F, -13.8F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 58)
						.addBox(-2.0F, -14.0F, -3.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-2.0F, -15.0F, 2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-1.0F, -24.0F, 2.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 95)
						.addBox(2.0F, -12.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 95)
						.addBox(-3.0F, -12.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(2.0F, -16.0F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-2.0F, -14.0F, 2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 83)
						.addBox(-3.0F, -16.0F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 83)
						.addBox(-4.0F, -18.0F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 83)
						.addBox(3.0F, -18.0F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = osnova.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 95)
						.addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 69)
						.addBox(-2.0F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 81)
						.addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 95)
						.addBox(-2.0F, 2.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -15.5F, -3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = osnova.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 95)
						.addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 67)
						.addBox(-1.0F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 81)
						.addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 95)
						.addBox(-1.0F, 2.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -15.5F, -3.0F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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
		Leftarmor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftarmor2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Grud.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		osnova.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}