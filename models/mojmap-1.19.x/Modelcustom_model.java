// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RigtArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart HeadRight;
	private final ModelPart HeadLeft;

	public Modelcustom_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RigtArm = root.getChild("RigtArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.HeadRight = root.getChild("HeadRight");
		this.HeadLeft = root.getChild("HeadLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(100, 17).addBox(-2.2824F, -6.4453F, 13.0573F, 6.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7176F, -18.6009F, -0.3315F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 35)
				.addBox(1.7176F, 6.1021F, 1.1571F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 96)
				.addBox(-5.2824F, 6.1021F, 1.1571F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 66)
				.addBox(-6.2824F, 2.1021F, 1.1571F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 62)
				.addBox(1.7176F, 2.1021F, 1.1571F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 81)
				.addBox(-15.2824F, -7.8979F, 1.1571F, 15.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
				.addBox(1.7176F, -7.8979F, 1.1571F, 15.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
				.addBox(3.7176F, -9.8979F, 14.1571F, 4.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 117)
				.addBox(-6.2824F, -9.8979F, 14.1571F, 4.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
				.addBox(-2.2824F, -11.8979F, 2.1571F, 6.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
				.addBox(-2.2824F, -11.8979F, 14.1571F, 6.0F, 29.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-8.2824F, -9.8979F, 2.1571F, 18.0F, 27.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
				.addBox(-17.2824F, -9.8979F, 2.1571F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7176F, -18.6009F, -0.3315F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 42)
				.addBox(-0.2824F, -19.5161F, 2.8912F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 91)
				.addBox(-0.2824F, -15.5161F, 7.8912F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-0.2824F, -11.5161F, 12.8912F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.2824F, -5.5161F, 20.8912F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(99, 0)
				.addBox(-0.2824F, -8.5161F, 16.8912F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7176F, -18.6009F, -0.3315F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 91)
				.addBox(11.7176F, -8.8979F, 17.1571F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
				.addBox(10.7176F, -8.8979F, 14.1571F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 54)
				.addBox(9.7176F, -9.8979F, 2.1571F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7176F, -18.6009F, -0.3315F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(3.0F, -2.0F, 10.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 42)
				.addBox(-1.2824F, -12.0454F, 25.8296F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 109)
				.addBox(-1.2824F, -13.0454F, 16.8296F, 4.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7176F, -16.6009F, -10.3315F, -0.48F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(91, 96).addBox(3.0F, -1.0F, -5.0F, 6.0F, 12.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -2.0F, 2.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(32, 11).addBox(-1.5266F, -1.5227F, -3.4982F, 3.0F, 3.0F, 28.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0593F, 3.227F, 11.9012F, -2.2012F, 0.6068F, 2.809F));

		PartDefinition cube_r7 = LeftArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 109)
				.addBox(-0.535F, 1.4997F, 5.5018F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(113, 72)
				.addBox(-0.535F, 1.4997F, -12.4982F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 96)
				.addBox(-0.535F, -3.5003F, 5.5018F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 117)
				.addBox(-0.535F, -3.5003F, -12.4982F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
				.addBox(-0.535F, -4.5003F, -8.4982F, 1.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(97, 64)
				.addBox(-0.535F, 1.4997F, -8.4982F, 1.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0593F, 3.227F, 11.9012F, -2.8567F, 1.0419F, 1.9596F));

		PartDefinition cube_r8 = LeftArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 77)
				.addBox(-2.6434F, 4.2398F, 12.011F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 78)
				.addBox(-2.6434F, 4.2398F, 15.011F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(77, 42)
				.addBox(-2.6434F, 1.2398F, 15.011F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
				.addBox(-2.6434F, 1.2398F, 12.011F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 95)
				.addBox(-2.6434F, 1.2398F, 9.011F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 17)
				.addBox(-2.6434F, 4.2398F, 9.011F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 120)
				.addBox(0.3566F, -0.7602F, 9.011F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 124)
				.addBox(-1.6434F, -11.7602F, 10.011F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6434F, 14.0556F, -16.9324F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = LeftArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(113, 62).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7867F, 19.4109F, -5.8214F, -0.4759F, -0.1395F, 0.5516F));

		PartDefinition cube_r10 = LeftArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 91)
				.addBox(18.7176F, -6.8979F, 2.1571F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(121, 12)
				.addBox(21.7176F, -9.8979F, 2.1571F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(101, 125)
				.addBox(21.7176F, -9.8979F, 11.1571F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.7176F, 6.3991F, -2.3315F, 0.9599F, 0.0F, 0.0F));

		PartDefinition RigtArm = partdefinition.addOrReplaceChild("RigtArm", CubeListBuilder.create().texOffs(61, 96)
				.addBox(-7.0F, 1.0F, -5.0F, 6.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-17.0F, -4.0F, 2.0F));

		PartDefinition cube_r11 = RigtArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 56)
				.addBox(-22.2824F, -0.402F, 1.4039F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(123, 104)
				.addBox(-23.2824F, 10.598F, 0.4039F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 66)
				.addBox(-23.2824F, 15.598F, 6.4039F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 35)
				.addBox(-23.2824F, 15.598F, 3.4039F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 73)
				.addBox(-23.2824F, 15.598F, 0.4039F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.2824F, 8.3991F, -2.3315F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r12 = RigtArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 35)
				.addBox(-26.2824F, -6.8979F, 2.1571F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(123, 44)
				.addBox(-23.2824F, -9.8979F, 2.1571F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(113, 130)
				.addBox(-23.2824F, -9.8979F, 11.1571F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.2824F, 8.3991F, -2.3315F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r13 = RigtArm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(48, 0).addBox(-22.2662F, -1.2668F, -4.6435F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.2824F, 8.3991F, -2.3315F, -0.6981F, 0.0F, -0.5672F));

		PartDefinition Dubina = RigtArm.addOrReplaceChild("Dubina", CubeListBuilder.create(),
				PartPose.offset(-3.8415F, 11.046F, -20.736F));

		PartDefinition cube_r14 = Dubina.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(90, 21).addBox(-14.2409F, 16.9122F, -20.3781F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.7492F, 0.3397F, -0.2639F));

		PartDefinition cube_r15 = Dubina.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 42)
				.addBox(-18.8019F, 16.9122F, -15.6066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 91)
				.addBox(-21.8019F, 11.9122F, -17.6066F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.6981F, 0.0436F, 0.0F));

		PartDefinition cube_r16 = Dubina.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(28, 81).addBox(-8.548F, 16.9122F, -20.9147F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.8178F, 0.4946F, -0.4322F));

		PartDefinition cube_r17 = Dubina.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(24, 81).addBox(-22.9848F, 16.9122F, -5.9736F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.7078F, -0.1566F, 0.1692F));

		PartDefinition cube_r18 = Dubina.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(80, 52).addBox(-22.8019F, 2.969F, -18.9292F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.0873F, 0.0436F, 0.0F));

		PartDefinition cube_r19 = Dubina.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(39, 80).addBox(-22.8019F, 7.0683F, -17.3048F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.1309F, 0.0436F, 0.0F));

		PartDefinition cube_r20 = Dubina.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(75, 78).addBox(-22.8019F, 20.3841F, -2.7357F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.2654F, 0.0436F, 0.0F));

		PartDefinition cube_r21 = Dubina.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(76, 52).addBox(-22.8019F, -2.4052F, -21.3729F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, 0.0873F, 0.0436F, 0.0F));

		PartDefinition cube_r22 = Dubina.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(38, 73).addBox(-22.8019F, 20.7897F, -4.0345F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.309F, 0.0436F, 0.0F));

		PartDefinition cube_r23 = Dubina.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(6, 73).addBox(-22.8019F, 16.5252F, -4.1586F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.1781F, 0.0436F, 0.0F));

		PartDefinition cube_r24 = Dubina.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(72, 52).addBox(-4.167F, 10.9122F, -24.6026F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.8552F, 0.5531F, -0.507F));

		PartDefinition cube_r25 = Dubina.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(72, 13).addBox(-26.1353F, 10.9122F, -4.2977F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.7534F, -0.3521F, 0.3495F));

		PartDefinition cube_r26 = Dubina.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(70, 9).addBox(5.5565F, 10.9122F, -22.1809F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.2397F, 0.8243F, -1.0962F));

		PartDefinition cube_r27 = Dubina.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(7, 10).addBox(-10.1863F, 10.9122F, -22.0618F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.8178F, 0.4946F, -0.4322F));

		PartDefinition cube_r28 = Dubina.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(41, 52).addBox(-23.9407F, 10.9122F, 4.2006F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.8633F, -0.5642F, 0.5954F));

		PartDefinition cube_r29 = Dubina.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(54, 0).addBox(-21.7812F, 10.9122F, 1.8301F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.792F, -0.4459F, 0.4486F));

		PartDefinition cube_r30 = Dubina.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(87, 42).addBox(-25.4203F, 16.9122F, -7.6113F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.7257F, -0.2553F, 0.257F));

		PartDefinition cube_r31 = Dubina.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(30, 95).addBox(-16.8019F, 4.7941F, -22.1548F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.1745F, 0.0436F, 0.0F));

		PartDefinition cube_r32 = Dubina.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(20, 95).addBox(-16.8019F, 19.1514F, -5.1817F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.309F, 0.0436F, 0.0F));

		PartDefinition cube_r33 = Dubina.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(16, 95).addBox(-16.8019F, 8.0059F, -19.704F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.2182F, 0.0436F, 0.0F));

		PartDefinition cube_r34 = Dubina.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(12, 95).addBox(-16.8019F, 16.8133F, -9.4298F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.9599F, 0.0436F, 0.0F));

		PartDefinition cube_r35 = Dubina.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(94, 58).addBox(-16.8019F, 9.6147F, -14.4406F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.4363F, 0.0436F, 0.0F));

		PartDefinition cube_r36 = Dubina.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(94, 21).addBox(-16.8019F, 17.7814F, -5.6655F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -1.0472F, 0.0436F, 0.0F));

		PartDefinition cube_r37 = Dubina.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 42).addBox(-25.3395F, -4.9576F, -18.6066F, 3.0F, 3.0F, 28.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1239F, -2.647F, 18.4045F, -0.5648F, -0.437F, -0.6408F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(112, 32)
				.addBox(1.0F, 10.0F, -6.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 9.0F, 15.0F));

		PartDefinition cube_r38 = LeftLeg.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(69, 117).addBox(4.7176F, 0.3836F, 15.898F, 5.0F, 11.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7176F, -4.6009F, -15.3315F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r39 = LeftLeg.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(66, 13).addBox(3.7176F, -7.0429F, 12.9402F, 7.0F, 12.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7176F, -4.6009F, -15.3315F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(112, 0)
				.addBox(-8.0F, 10.0F, -6.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 9.0F, 15.0F));

		PartDefinition cube_r40 = RightLeg.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 121).addBox(-8.2824F, 0.3836F, 15.898F, 5.0F, 11.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2824F, -4.6009F, -15.3315F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r41 = RightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(112, 108)
				.addBox(10.7176F, -6.0429F, 12.9402F, 1.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(49, 115)
				.addBox(-10.2824F, -6.0429F, 12.9402F, 1.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
				.addBox(-9.2824F, -7.0429F, 12.9402F, 7.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2824F, -4.6009F, -15.3315F, -0.2182F, 0.0F, 0.0F));

		PartDefinition HeadRight = partdefinition.addOrReplaceChild("HeadRight",
				CubeListBuilder.create().texOffs(94, 53)
						.addBox(-6.0F, 5.0F, -12.0F, 11.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-6.0F, -1.0F, -12.0F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(86, 100)
						.addBox(2.0F, 4.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32)
						.addBox(0.0F, 4.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 98)
						.addBox(-2.0F, 4.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 98)
						.addBox(-4.0F, 4.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 104)
						.addBox(-6.0F, 3.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 21)
						.addBox(4.0F, 3.0F, -7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 99)
						.addBox(-6.0F, 2.0F, -12.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
						.addBox(4.0F, 2.0F, -12.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 100)
						.addBox(-6.0F, 3.0F, -10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 13)
						.addBox(4.0F, 3.0F, -10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(-5.0F, -4.0F, -10.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(16, 67)
						.addBox(-4.0F, 1.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 39)
						.addBox(1.0F, 1.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -5.0F, -2.0F));

		PartDefinition cube_r42 = HeadRight.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(98, 21)
				.addBox(-8.7588F, -17.6364F, 2.9363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 53)
				.addBox(-9.7588F, -16.6364F, 2.9363F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2824F, 9.3991F, 1.6685F, 0.2182F, -1.0036F, 0.0F));

		PartDefinition cube_r43 = HeadRight.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 73)
				.addBox(-14.2824F, -15.4643F, -13.9731F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 109)
				.addBox(-12.2824F, -9.4643F, -14.9731F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2824F, 9.3991F, 1.6685F, -0.4363F, 0.0F, 0.0F));

		PartDefinition HeadLeft = partdefinition.addOrReplaceChild("HeadLeft",
				CubeListBuilder.create().texOffs(127, 74)
						.addBox(-3.0F, 3.0F, -13.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 67)
						.addBox(-3.0F, -2.0F, -10.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(2.0F, -1.0F, -10.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 76)
						.addBox(3.0F, 1.0F, -12.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 11)
						.addBox(2.0F, 2.0F, -12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(4.0F, 2.0F, -11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 2.0F, -11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, 2.0F, -12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(0.0F, 2.0F, -12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(-3.0F, 1.0F, -12.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 73)
						.addBox(-4.0F, -4.0F, -10.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -5.0F, -2.0F));

		PartDefinition cube_r44 = HeadLeft.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(97, 81)
				.addBox(12.7176F, -9.4643F, -14.9731F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 42)
				.addBox(6.7176F, -10.4643F, -14.9731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 95)
				.addBox(4.7176F, -10.4643F, -13.9731F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 13)
				.addBox(13.7176F, -15.4643F, -13.9731F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r45 = HeadLeft.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(42, 44).addBox(4.7176F, -11.4643F, -11.9731F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r46 = HeadLeft.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(8, 2).addBox(8.926F, -11.4643F, -12.3505F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.4378F, -0.0791F, 0.037F));

		PartDefinition cube_r47 = HeadLeft.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(8, 6).addBox(8.4809F, -12.4643F, -10.7025F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.4378F, 0.0791F, -0.037F));

		PartDefinition cube_r48 = HeadLeft.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(42, 48).addBox(9.7176F, -9.851F, -13.9226F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r49 = HeadLeft.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(64, 52).addBox(-2.0F, -1.5F, 0.0F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.5F, -10.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r50 = HeadLeft.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 41)
				.addBox(8.2182F, -8.0063F, -21.5001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 44)
				.addBox(7.2182F, -8.0063F, -21.5001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
				.addBox(6.2182F, -7.0063F, -21.5001F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 1)
				.addBox(6.2182F, -6.0063F, -21.5001F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7176F, 9.3991F, 1.6685F, -0.2657F, 0.1685F, -0.0456F));

		PartDefinition cube_r51 = HeadLeft.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(48, 0).addBox(6.2182F, -7.0063F, -22.5001F, 1.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7176F, 9.3991F, 1.6685F, -0.2657F, 0.1685F, -0.0456F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RigtArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HeadLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}