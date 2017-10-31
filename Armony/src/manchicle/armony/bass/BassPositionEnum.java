package manchicle.armony.bass;

public enum BassPositionEnum {
	posicion1(new BassSpaceEnum[]{BassSpaceEnum.primer, BassSpaceEnum.segundo, BassSpaceEnum.tercer, BassSpaceEnum.cuarto, BassSpaceEnum.quinto})
	,posicion2(new BassSpaceEnum[]{BassSpaceEnum.tercer, BassSpaceEnum.cuarto, BassSpaceEnum.quinto, BassSpaceEnum.sexto, BassSpaceEnum.septimo})
	,posicion3(new BassSpaceEnum[]{BassSpaceEnum.cuarto, BassSpaceEnum.quinto, BassSpaceEnum.sexto, BassSpaceEnum.septimo, BassSpaceEnum.octavo})
	,posicion4(new BassSpaceEnum[]{BassSpaceEnum.sexto, BassSpaceEnum.septimo, BassSpaceEnum.octavo, BassSpaceEnum.noveno, BassSpaceEnum.decimo})
	,posicion5(new BassSpaceEnum[]{BassSpaceEnum.octavo, BassSpaceEnum.noveno, BassSpaceEnum.decimo, BassSpaceEnum.decimoPrimer, BassSpaceEnum.decimoSegundo})
	,posicion6(new BassSpaceEnum[]{BassSpaceEnum.decimo, BassSpaceEnum.decimoPrimer, BassSpaceEnum.decimoSegundo, BassSpaceEnum.decimoTercer, BassSpaceEnum.decimoCuarto})
	,posicion7(new BassSpaceEnum[]{BassSpaceEnum.decimoPrimer, BassSpaceEnum.decimoSegundo, BassSpaceEnum.decimoTercer, BassSpaceEnum.decimoCuarto, BassSpaceEnum.decimoQuinto})
	;
	
	public BassSpaceEnum[] spaces;
	
	
	private BassPositionEnum(BassSpaceEnum[] espacios) {
		this.spaces = espacios;
	}
	
	public BassSpaceEnum[] getSpaces() {
		return spaces;
	}
}
