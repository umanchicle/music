package manchicle.armony.core;

import java.util.Arrays;
import java.util.List;

public class FMajor extends Major implements IFuncion{
	
	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}

	
	private FMajor() {
		
		alteracionNatural = new String[]{"", ""};
		
		funcion.add(FuncionEnum.major);
		
	}
	
	public FMajor(NotaEnum tonalidad){
	
		this();
		
		setEscalas(tonalidad);

	}

	public FMajor(NotaEnum tonalidad, int type){
		
		this();
		
		setEscalas(tonalidad, type);

	}

	public static void main(String[] args) {
		
		FMajor f = new FMajor(NotaEnum.C);
		
		List<NotaEnum[]> listaNotas = f.getEscalas();
		
		System.out.println(listaNotas.get(0)[0].nota+f.getFuncion().nomenclatura);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i] + " ");
				
				//System.out.print(notaEnums[i].getIntervalo(notaEnums, TonoEnum.m) + "\n");
			}
			
			System.out.println("");
		}

		
	}


	
}
