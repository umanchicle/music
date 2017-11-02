package manchicle.armony.core;

import java.util.List;

public class FMedAumentada extends Major implements IFuncion{

	@Override
	public Object getFuncion() {
		
		return funcion.getFuncionType();
	}
	
	private FMedAumentada() {
		
		alteracionNatural = new String[]{"#5", ""};
		
		funcion.add(FuncionEnum.maug);
		
	}

	public FMedAumentada(NotaEnum tonalidad) {
		
		this();
		
		setEscalas(tonalidad);
	}
	
	public FMedAumentada(NotaEnum tonalidad, int type) {
		
		this();
		
		setEscalas(tonalidad,type);
	}
	
	public static void main(String[] args) {
		
		FMedAumentada medaug = new FMedAumentada();

		List<NotaEnum[]> listaNotas = medaug.getEscalas(NotaEnum.C);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].nota + " ");
			}
			System.out.println("\n");
		}
		
		
	}


}
