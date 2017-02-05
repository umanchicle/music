package manchicle.armony.core;

public class FDefault extends Escala implements IFuncion{
	
	public FDefault(NotaEnum tonalidad) {
		this.tonalidad = tonalidad;
	}
	
	
	
	@Override
	public void setType(NotaEnum[] a) {
		// TODO Auto-generated method stub
		super.setType(a);
	}



	public FDefault(NotaEnum tonalidad, NotaEnum[] escala) {
		this(tonalidad);
		this.escala= escala;
	}
	
	@Override
	public NotaEnum[] getEscala() {
		// TODO Auto-generated method stub
		return this.escala;
	}
	
	
	@Override
	public FuncionEnum getFuncion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		// TODO Auto-generated method stub
		return false;
	}

}
