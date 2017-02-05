package manchicle.armony.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FMenMaj7 extends Menor implements IFuncion{

	private FMenMaj7() {
		
		alteracionNatural = new String[]{"","#7"};
		
		funcion.add(FuncionEnum.menor7M);
		
	}

	public FMenMaj7(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FMenMaj7(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		FMenMaj7 mensmaj = new FMenMaj7();

		List<NotaEnum[]> listaNotas = mensmaj.getEscalas(NotaEnum.C);

		for (Iterator<Patron> iterator = mensmaj.funcion.iterator(); iterator.hasNext();) {
			Patron patron = (Patron) iterator.next();
			
			for (TonoEnum[] notaEnums : patron.getPatrones()) {
				
				System.out.println(Arrays.asList(notaEnums));
				
				
			}
			
			
		}
		
		
		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].enarmonico + " ");
			}
			System.out.println("\n");
		}
		
		
	}

	@Override
	public FuncionEnum getFuncion() {
		
		return funcion.getFuncionType();
	}
	
}
