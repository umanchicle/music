package manchicle.armony.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FMaj7susSos413 extends Menor implements IFuncion{

	private FMaj7susSos413() {
		
		alteracionNatural = new String[]{"",""};
		
		funcion.add(FuncionEnum.maj7susSos413);
		
	}

	public FMaj7susSos413(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FMaj7susSos413(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		FMaj7susSos413 mensmaj = new FMaj7susSos413();

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
