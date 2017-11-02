package manchicle.armony.core;

import java.util.Arrays;

public class FDisminuida extends Menor implements IFuncion{

	@Override
	public Object getFuncion() {
		
		return funcion.getFuncionType();
	}
	
	private FDisminuida() {
		
		alteracionNatural = new String[]{"b5", "b7"};
		
		funcion.add(FuncionEnum.dism);
	}
	
	public FDisminuida(NotaEnum tonalidad){

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FDisminuida(NotaEnum tonalidad, int value){

		this();
		
		setEscalas(tonalidad, value);
		
	}
	

	public static void main(String[] args) {
		
		FDisminuida dism = new FDisminuida(NotaEnum.C);

		/**
		 * prueba nuevo set escala natural
		 */
		
		
		System.out.println(Arrays.asList(dism.getEscalaNatural()));
		

//		List<NotaEnum[]> listaNotas = dism.getEscala(NotaEnum.Dsos, Escala.NATURAL);
//
//		for (NotaEnum[] notaEnums : listaNotas) {
//			
//			for (int i = 0; i < notaEnums.length; i++) {
//				
//				System.out.print(notaEnums[i].enarmonico + " ");
//			}
//			System.out.println("\n");
//		}
	}


	
}
