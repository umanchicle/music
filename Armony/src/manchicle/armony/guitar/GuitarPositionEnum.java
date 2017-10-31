package manchicle.armony.guitar;

public enum GuitarPositionEnum {
	posicion1(new GuitarSpaceEnum[]{GuitarSpaceEnum.primer, GuitarSpaceEnum.segundo, GuitarSpaceEnum.tercer, GuitarSpaceEnum.cuarto, GuitarSpaceEnum.quinto})
	,posicion2(new GuitarSpaceEnum[]{GuitarSpaceEnum.tercer, GuitarSpaceEnum.cuarto, GuitarSpaceEnum.quinto, GuitarSpaceEnum.sexto, GuitarSpaceEnum.septimo})
	,posicion3(new GuitarSpaceEnum[]{GuitarSpaceEnum.cuarto, GuitarSpaceEnum.quinto, GuitarSpaceEnum.sexto, GuitarSpaceEnum.septimo, GuitarSpaceEnum.octavo})
	,posicion4(new GuitarSpaceEnum[]{GuitarSpaceEnum.sexto, GuitarSpaceEnum.septimo, GuitarSpaceEnum.octavo, GuitarSpaceEnum.noveno, GuitarSpaceEnum.decimo})
	,posicion5(new GuitarSpaceEnum[]{GuitarSpaceEnum.octavo, GuitarSpaceEnum.noveno, GuitarSpaceEnum.decimo, GuitarSpaceEnum.decimoPrimer, GuitarSpaceEnum.decimoSegundo})
	,posicion6(new GuitarSpaceEnum[]{GuitarSpaceEnum.decimo, GuitarSpaceEnum.decimoPrimer, GuitarSpaceEnum.decimoSegundo, GuitarSpaceEnum.decimoTercer, GuitarSpaceEnum.decimoCuarto})
	,posicion7(new GuitarSpaceEnum[]{GuitarSpaceEnum.decimoPrimer, GuitarSpaceEnum.decimoSegundo, GuitarSpaceEnum.decimoTercer, GuitarSpaceEnum.decimoCuarto, GuitarSpaceEnum.decimoQuinto})
	;
	
	public GuitarSpaceEnum[] spaces;
	
	
	private GuitarPositionEnum(GuitarSpaceEnum[] espacios) {
		this.spaces = espacios;
	}
	
	public GuitarSpaceEnum[] getSpaces() {
		return spaces;
	}
}
