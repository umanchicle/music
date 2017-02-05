package manchicle.armony.core;

import java.util.List;

public class F7Dominante extends Major implements IFuncion{

	private F7Dominante() {
		
		alteracionNatural = new String[]{"", "b7"};
		
		funcion.add(FuncionEnum.maj7m);
	}
	
	public F7Dominante(NotaEnum tonalidad){
		
		this();
		
		setEscalas(tonalidad);

	}
	
	public F7Dominante(NotaEnum tonalidad, int type){
		
		this();
		
		setEscalas(tonalidad, type);

	}
	
	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}

	public static void main(String[] args) {
		
		F7Dominante majsmen = new F7Dominante();

		List<NotaEnum[]> listaNotas = majsmen.getEscala(NotaEnum.Dsos, Escala.NATURAL);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i] + " ");
			}
			System.out.println("\n");
		}
		
		
	}


	
}
