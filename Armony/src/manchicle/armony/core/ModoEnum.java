package manchicle.armony.core;

public enum ModoEnum {
	
	Jonico(FuncionEnum.major),
	Dorico(FuncionEnum.menor),
	Frigio(FuncionEnum.menor),
	Lidio(FuncionEnum.major),
	Mixolidio(FuncionEnum.maj7m),
	Eolico(FuncionEnum.menor),
	Locrio(FuncionEnum.mDism),
	;
	
	protected FuncionEnum funcion;
	
	private ModoEnum(FuncionEnum funcion) {
		
		this.funcion = funcion;
		
	}

}
