package manchicle.armony.core;

import java.util.List;

public class F7 extends Major implements IFuncion{

	private F7() {
		
		alteracionNatural = new String[]{"", "b7"};
		
		funcion.add(FuncionEnum.maj7m);
	}
	
	public F7(NotaEnum tonalidad){
		
		this();
		
		setEscalas(tonalidad);

	}
	
	public F7(NotaEnum tonalidad, int type){
		
		this();
		
		setEscalas(tonalidad, type);

	}
	
	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}

	public static void main(String[] args) {
		
		F7 majsmen = new F7();

		List<NotaEnum[]> listaNotas = majsmen.getEscala(NotaEnum.Dsos, Escala.NATURAL);

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i] + " ");
			}
			System.out.println("\n");
		}
		
		
	}


	
}
