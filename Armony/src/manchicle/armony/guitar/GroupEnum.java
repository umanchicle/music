package manchicle.armony.guitar;

public enum GroupEnum {
	
	Group1(new StringEnum[]{StringEnum.sexta,StringEnum.quinta,StringEnum.cuarta,StringEnum.tercera}),
	Group2(new StringEnum[]{StringEnum.quinta,StringEnum.cuarta,StringEnum.tercera, StringEnum.segunda}),
	Group3(new StringEnum[]{StringEnum.cuarta,StringEnum.tercera,StringEnum.segunda, StringEnum.primera}),
	Group4(new StringEnum[]{StringEnum.sexta,StringEnum.cuarta,StringEnum.tercera,StringEnum.segunda,}),
	Group5(new StringEnum[]{StringEnum.sexta,StringEnum.tercera,StringEnum.segunda, StringEnum.primera}),
	Group6(new StringEnum[]{StringEnum.quinta,StringEnum.tercera,StringEnum.segunda, StringEnum.primera});

	protected StringEnum[] strings;
	
	private GroupEnum(StringEnum[] strings) {
		
		this.strings = strings;
		
	}
	
}
