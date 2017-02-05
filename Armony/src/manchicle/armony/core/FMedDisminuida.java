package manchicle.armony.core;

import java.util.List;

public class FMedDisminuida extends Menor implements IFuncion{

	private FMedDisminuida() {
		
		alteracionNatural = new String[]{"b5", ""};
		
		funcion.add(FuncionEnum.mDism);
		
	}
	
	public FMedDisminuida(NotaEnum tonalidad) {
		
		this();

		setEscalas(tonalidad);
	}
	
	public FMedDisminuida(NotaEnum tonalidad, int type) {
		
		this();

		setEscalas(tonalidad, type);
	}


	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}

	public static void main(String[] args) {
		
		FMedDisminuida mdism = new FMedDisminuida();

		List<NotaEnum[]> listaNotas = mdism.getEscala(NotaEnum.Dsos, Escala.NATURAL);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].enarmonico + " ");
			}
			System.out.println("\n");
		}
		
		
	}

	
}
