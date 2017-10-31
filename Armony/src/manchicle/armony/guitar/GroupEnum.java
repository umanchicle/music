package manchicle.armony.guitar;

public enum GroupEnum {
	
	Group1(new GuitarStringEnum[]{GuitarStringEnum.sexta,GuitarStringEnum.quinta,GuitarStringEnum.cuarta,GuitarStringEnum.tercera}),
	Group2(new GuitarStringEnum[]{GuitarStringEnum.quinta,GuitarStringEnum.cuarta,GuitarStringEnum.tercera, GuitarStringEnum.segunda}),
	Group3(new GuitarStringEnum[]{GuitarStringEnum.cuarta,GuitarStringEnum.tercera,GuitarStringEnum.segunda, GuitarStringEnum.primera}),
	Group4(new GuitarStringEnum[]{GuitarStringEnum.sexta,GuitarStringEnum.cuarta,GuitarStringEnum.tercera,GuitarStringEnum.segunda,}),
	Group5(new GuitarStringEnum[]{GuitarStringEnum.sexta,GuitarStringEnum.tercera,GuitarStringEnum.segunda, GuitarStringEnum.primera}),
	Group6(new GuitarStringEnum[]{GuitarStringEnum.quinta,GuitarStringEnum.tercera,GuitarStringEnum.segunda, GuitarStringEnum.primera}),
	Group7(new GuitarStringEnum[]{GuitarStringEnum.tercera,GuitarStringEnum.segunda, GuitarStringEnum.primera});

	protected GuitarStringEnum[] strings;
	
	private GroupEnum(GuitarStringEnum[] strings) {
		
		this.strings = strings;
		
	}
	
}
