package manchicle.armony.core;

import java.util.List;

public interface IFuncion {

	public NotaEnum getTonalidad();
	
	public FuncionEnum getFuncion();

	public NotaEnum[] getEscala();
	
	public NotaEnum[] getEscala(NotaEnum[] escala, TonoEnum intervalo);
	
	public NotaEnum[] getEscala(TonoEnum intervalo);

	public NotaEnum[] getEscala(TonoEnum intervalo, int maxtonos);

	public List<NotaEnum[]> getEscalas();

	public int getType();
	
}
