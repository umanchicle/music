package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		String[] elementos = { "h", "w","m","M", "c", "C", "Q", "x", "X", "s", "S", "O"};

		test3.generarPermutacionSust(elementos, "", 3);
		
		boolean bGsos = false;
		
		for (String string : test3.lista) {
			
				if (string.contains("MM") ) {
					bGsos = true;
				} else bGsos = false;

				String[] terceras = string.split("");
				
				NotaEnum tonica = NotaEnum.C;
				NotaEnum tercera = tonica.getIntervalo(TonoEnum.getByName(terceras[1]));
				NotaEnum quinta = tercera.getIntervalo(TonoEnum.getByName(terceras[2]));
				NotaEnum septima = quinta.getIntervalo(TonoEnum.getByName(terceras[3]));
				
				System.out.print(TonoEnum.getByName(terceras[1]));
				System.out.print(TonoEnum.getByName(terceras[2]));
				System.out.print(TonoEnum.getByName(terceras[3]));
				
				if (bGsos) {
					System.out.println(" " + tonica.enarmonico + (tercera.equals(NotaEnum.Gsos) ? tercera.nota : tercera.enarmonico) +
							(quinta.equals(NotaEnum.Gsos) ? quinta.nota : quinta.enarmonico) +
							(septima.equals(NotaEnum.Gsos) ? septima.nota : septima.enarmonico)) ;
				}else{
				
				System.out.println(" " + tonica.enarmonico + tercera.enarmonico + quinta.enarmonico + septima.enarmonico);
				//System.out.println(string);
				}
		}
		
		System.out.println(test3.lista.size());
	}

}
