package manchicle.armony.guitar;

public enum PositionEnum {
	posicion1(new EspacioEnum[]{EspacioEnum.primer, EspacioEnum.segundo, EspacioEnum.tercer, EspacioEnum.cuarto, EspacioEnum.quinto})
	,posicion2(new EspacioEnum[]{EspacioEnum.tercer, EspacioEnum.cuarto, EspacioEnum.quinto, EspacioEnum.sexto, EspacioEnum.septimo})
	,posicion3(new EspacioEnum[]{EspacioEnum.cuarto, EspacioEnum.quinto, EspacioEnum.sexto, EspacioEnum.septimo, EspacioEnum.octavo})
	,posicion4(new EspacioEnum[]{EspacioEnum.sexto, EspacioEnum.septimo, EspacioEnum.octavo, EspacioEnum.noveno, EspacioEnum.decimo})
	,posicion5(new EspacioEnum[]{EspacioEnum.octavo, EspacioEnum.noveno, EspacioEnum.decimo, EspacioEnum.decimoPrimer, EspacioEnum.decimoSegundo})
	,posicion6(new EspacioEnum[]{EspacioEnum.decimo, EspacioEnum.decimoPrimer, EspacioEnum.decimoSegundo, EspacioEnum.decimoTercer, EspacioEnum.decimoCuarto})
	,posicion7(new EspacioEnum[]{EspacioEnum.decimoPrimer, EspacioEnum.decimoSegundo, EspacioEnum.decimoTercer, EspacioEnum.decimoCuarto, EspacioEnum.decimoQuinto})
	;
	
	protected EspacioEnum[] spaces;
	
	
	private PositionEnum(EspacioEnum[] espacios) {
		this.spaces = espacios;
	}
	
	public EspacioEnum[] getSpaces() {
		return spaces;
	}
}
