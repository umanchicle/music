package manchicle.armony.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Funcion {
	
	private Object funcionType;
	
	private Patron[] patrones = new Patron[30];
	
	private int numero = 0;
	
	public Funcion() {
	}
	
	public Object getFuncionType() {
		
		return funcionType;
	}

	public void add(Object function ){
		
		this.funcionType = function;
		
		Patron p = Patron.getInstance(function);
		
		p.setFunction(function);
		p.setPatrones(p.getCombinatoria());
		
		patrones[numero++] = p;
	}
	
	public FuncionIterator iterator(){
		return new FuncionIterator(patrones);
	}

	
	public static void main(String[] args) {
		Funcion f = new Funcion();

		f.add(FuncionEnumExt.FMaj);
		
		Iterator<Patron> iter = f.iterator();
		
		while (iter.hasNext()) {
			Patron patron = (Patron) iter.next();
			
			System.out.println(((FuncionEnumExt)patron.getFunction()).name() 
					+ " " +((FuncionEnumExt)patron.getFunction()).caption);
			
			List<TonoEnum[]> listPatrones = patron.getPatrones();
			
			for (TonoEnum[] tonos : listPatrones) {
				System.out.println(Arrays.asList(tonos));
			}
			
			System.out.println(listPatrones.size());
			
		}
		
		System.out.println("total funciones : " + f.numero);
	}
	
}
