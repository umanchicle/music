package manchicle.armony.core;

import java.util.List;

public class FMenor extends Menor implements IFuncion{

	private FMenor() {
		
		alteracionNatural = new String[]{"", ""};
		
		funcion.add(FuncionEnum.menor);
		
	}

	public FMenor(NotaEnum tonalidad){
		
		this();
		
		setEscalas(tonalidad);
	}
	
	public FMenor(NotaEnum tonalidad, int type){
		
		this();
		
		setEscalas(tonalidad, type);
	}
	
	public static void main(String[] args) {
		
		FMenor menor = new FMenor(NotaEnum.C);

		/**
		 * Prueba intervalos
		 */
		
		List<NotaEnum[]> listaNotas = menor.getEscalas();

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].enarmonico + " ");
				
				//System.out.print(notaEnums[i].getIntervalo(notaEnums, TonoEnum.m) + "\n");
			}
			
			System.out.println("\n");
		}

		NotaEnum[] arpegio = menor.getEscala(TonoEnum.m);
		
		for (int i = 0; i < arpegio.length; i++) {
			System.out.print("["+arpegio[i].enarmonico+"]");
			
		}
		
		
	}

	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}
	
}
