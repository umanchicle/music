package manchicle.armony.core;

import java.util.List;

public class FAumentada extends Major implements IFuncion{

	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}
	
	private FAumentada() {
		
		alteracionNatural = new String[]{"#5", "#7"};
		
		funcion.add(FuncionEnum.aug);
		
	}

	public FAumentada(NotaEnum tonalidad) {
		
		this();
		
		setEscalas(tonalidad);
	}
	
	public FAumentada(NotaEnum tonalidad, int type) {
		
		this();
		
		setEscalas(tonalidad,type);
	}
	
	public static void main(String[] args) {
		
		FAumentada medaug = new FAumentada();

		List<NotaEnum[]> listaNotas = medaug.getEscalas(NotaEnum.C);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].nota + " ");
			}
			System.out.println("\n");
		}
		
		
	}


}
