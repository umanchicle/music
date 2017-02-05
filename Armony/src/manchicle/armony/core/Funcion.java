package manchicle.armony.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Funcion {
	
	private FuncionEnum funcionType;
	
	private Patron[] patrones = new Patron[30];
	
	private int numero = 0;
	
	public Funcion() {
	}
	
	protected FuncionEnum getFuncionType() {
		
		return funcionType;
	}

	public void add(FuncionEnum function ){
		
		this.funcionType = function;
		
		Patron p = new Patron(function);
		
		patrones[numero++] = p;
	}
	
	public FuncionIterator iterator(){
		return new FuncionIterator(patrones);
	}

	
	public static void main(String[] args) {
		Funcion f = new Funcion();

		f.add(FuncionEnum.maj7m);
		
		Iterator<Patron> iter = f.iterator();
		
		while (iter.hasNext()) {
			Patron patron = (Patron) iter.next();
			
			System.out.println(patron.getFunction().name() 
					+ " " +patron.getFunction().caption);
			
			List<TonoEnum[]> listPatrones = patron.getPatrones();
			
			for (TonoEnum[] tonos : listPatrones) {
				System.out.println(Arrays.asList(tonos));
			}
			
			System.out.println(listPatrones.size());
			
		}
		
		System.out.println("total funciones : " + f.numero);
	}
	
}
