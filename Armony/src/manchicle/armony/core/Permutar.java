package manchicle.armony.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
		
		Random random = new Random();
		
		//String[] elementos = { "hm", "hw", "ww", "wh", "mh"};
		
		String[] elementos = { "h", "w","m","M", "c", "C", "Q", "x", "X", "s", "S", "O"};

		test3.generarPermutacionSust(elementos, "", 3);
		
		Map<String, Integer> listName = new HashMap<>();
	
		Integer chordOcurrense = 0;
		
		for (String string : test3.lista) {
			
				String[] terceras = string.split("");
				
				NotaEnum tonica = NotaEnum.C;
				NotaEnum tercera = tonica.getIntervalo(TonoEnum.getByName(terceras[1]));
				NotaEnum quinta = tercera.getIntervalo(TonoEnum.getByName(terceras[2]));
				NotaEnum septima = quinta.getIntervalo(TonoEnum.getByName(terceras[3]));
				
				ArrayList<NotaEnum> notas = new ArrayList<NotaEnum>();
				
				notas.add(tonica);
				notas.add(tercera);
				notas.add(quinta);
				notas.add(septima);
				
				final String name = FuncionEnum.getName(notas);
				
				final String name2 = name.replace("C", "F").
						replace("(sus", "Sus").
						replace("(omm", "Omm").
						replace("(add", "add").
						replace(")", "").
						replace("-", "Min").
						replace("+", "Maj").
						replace("#", "Sos");
				
				String nameFinal;
				
				if (name2.equals("F")) {
					
					nameFinal  = name2.replace("F", "FMaj");
				} else
					
					nameFinal = name2;
				
				chordOcurrense = listName.get(nameFinal);
				
				final String nameFuncion;
				
				if ( chordOcurrense != null) {
					
					nameFuncion = nameFinal + "_"+chordOcurrense.toString();
					
					listName.put(nameFinal, chordOcurrense + 1);
					
				} else{
					
					nameFuncion= nameFinal;
					
					listName.put(nameFuncion, 1 );
				}
				
				System.out.println( nameFuncion + "(\"" + 
						TonoEnum.getByName(terceras[1]) + 
						TonoEnum.getByName(terceras[2]) + 
						TonoEnum.getByName(terceras[3]) + 
						"\", new TonoEnum[]{TonoEnum." + TonoEnum.getByName(terceras[1]) + 
						", TonoEnum." + TonoEnum.getByName(terceras[ 2]) + 
						", TonoEnum." + TonoEnum.getByName(terceras[3]) +
						"}, \"" + name.replace("C", "") + "\", 357, \""+ tonica.enarmonico+tercera.enarmonico+quinta.enarmonico+septima.enarmonico +"\")");
		}
		
		System.out.println(test3.lista.size());
	}

}
