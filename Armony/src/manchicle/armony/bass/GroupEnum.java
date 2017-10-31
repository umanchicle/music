package manchicle.armony.bass;

public enum GroupEnum {
	
	Group1(new BassStringEnum[]{BassStringEnum.quinta,BassStringEnum.cuarta,BassStringEnum.tercera, BassStringEnum.segunda}),
	Group2(new BassStringEnum[]{BassStringEnum.cuarta,BassStringEnum.tercera,BassStringEnum.segunda, BassStringEnum.primera}),
	Group3(new BassStringEnum[]{BassStringEnum.quinta,BassStringEnum.tercera,BassStringEnum.segunda, BassStringEnum.primera});


	protected BassStringEnum[] strings;
	
	private GroupEnum(BassStringEnum[] strings) {
		
		this.strings = strings;
		
	}
	
}
