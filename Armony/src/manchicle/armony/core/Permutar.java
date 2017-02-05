package manchicle.armony.core;

import java.util.ArrayList;
import java.util.List;

public class Permutar {
	
	protected List<String> lista = new ArrayList<String>();

	
	public void addLista(Object[] value) {
		
		for (int i = 0; i < value.length; i++) {
			
			this.lista.add((String)value[i]);
			
		}
		
	}
	
	// Permutaciones con sustitución
	
	public List<String> getLista() {
		return lista;
	}
	
	public void generarPermutacionSust(Object[] elementos, String actual, int cantidad) {

		if (cantidad == 0) {
			
			
			lista.add(actual);

		} else {

			for (int i = 0; i < elementos.length; i++) {

				generarPermutacionSust(elementos, actual + (String)elementos[i], cantidad - 1);

			}
		}
	}
	
	public void cleanList() {
		
		this.lista = new ArrayList<String>();
		
	}

	public static void main(String[] args) {

		Permutar test3 = new Permutar();
		
		//String[] elementos = { "hm", "hw", "ww", "wh", "mh"};
		
		String[] elementos = { "1", "2", "3"};

		test3.generarPermutacionSust(elementos, "", 3);
		
		for (String string : test3.lista) {
			
				System.out.println(string);
		}
		
		System.out.println(test3.lista.size());
	}

}
