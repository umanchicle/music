package manchicle.armony.core;

public class Function extends Escala implements IFuncion{
	
	public Function(String[] value, FuncionEnum funcionEnum) {
		alteracionNatural = value;
		
		funcion.add(funcionEnum);
	}
	
	public Function(String[] value, FuncionEnum funcionEnum, NotaEnum tonalidad){
		
		this(value, funcionEnum);
		
		setEscalas(tonalidad);
	}
	
	public Function(String[] value, FuncionEnum funcionEnum, NotaEnum tonalidad, int type){
		
		this(value, funcionEnum);
		
		setEscalas(tonalidad, type);
	}

	@Override
	public FuncionEnum getFuncion() {
		return funcion.getFuncionType();
	}

	@Override
	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		return true;
	}

}
