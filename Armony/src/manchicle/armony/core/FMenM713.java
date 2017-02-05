package manchicle.armony.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FMenM713 extends Menor implements IFuncion{

	private FMenM713() {
		
		alteracionNatural = new String[]{"",""};
		
		funcion.add(FuncionEnum.menM713);
		
	}

	public FMenM713(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FMenM713(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		FMenM713 mensmaj = new FMenM713();

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
		// TODO Auto-generated method stub
		return funcion.getFuncionType();
	}
	
	@Override
	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		return true;
	}
	
}
