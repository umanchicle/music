package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Patron {
	
	private FuncionEnum function;
	
	private List<TonoEnum[]> patrones = new ArrayList<TonoEnum[]>();
	
	public Patron(FuncionEnum function) {
		
		this.function = function;
		
		this.patrones = getCombinatoria();
	}

	private List<TonoEnum[]> getCombinatoria() {
		
		List<TonoEnum[]> list = new ArrayList<TonoEnum[]>();
				
		Permutar permutar = new Permutar();
		
		Object[] elementos = getElementsTonos(); 

		permutar = permutarPatrones(permutar, elementos);//permuta elementos encontrados
		
		for (String p : permutar.lista) {
			
			if (p.length() < 6) {
				System.out.println(p);
			}

			TonoEnum[] tonoEnums = convertTonal(p); 
			
			//Evalua si cumple con la funcion seteada , si es asi se agrega a la lista si no sedeja afuera
			
			addEvaluationFunction(list, tonoEnums);
		}
		
		return list;
	}


	private TonoEnum[] convertTonal(String p) {
		
		TonoEnum[] tonoEnums = new TonoEnum[6];

		char[] arrayTonos = p.toCharArray();
		
		int i = 0;
		int j = 0;
		
		while (i < arrayTonos.length) {
			
			String value = String.valueOf(arrayTonos[i]);
			
			tonoEnums[j++] = TonoEnum.valueOf(value);
			
			i++;
		}
		return tonoEnums;
	}


	private void addEvaluationFunction(List<TonoEnum[]> list, TonoEnum[] tonoEnums) {
		
		double peso1 = tonoEnums[0].peso + tonoEnums[1].peso;
		
		double peso2 = tonoEnums[2].peso + tonoEnums[3].peso;
		
		double peso3 = tonoEnums[4].peso + tonoEnums[5].peso;
		
		TonoEnum[] tonos = new TonoEnum[]{TonoEnum.getTono(peso1), TonoEnum.getTono(peso2), TonoEnum.getTono(peso3) };

		if (this.function.isFunction(tonos)){
			
			list.add(tonoEnums);
		}
	}

	private Permutar permutarPatrones(Permutar permutar, Object[] elementos) {
		
		permutar.generarPermutacionSust(elementos, "", 2);
		
		elementos = permutar.lista.toArray();
		
		elementos = addElementsOctave(elementos);
		
		permutar = new Permutar();
		
		permutar.generarPermutacionSust(elementos, "", 3);
		
		return permutar;
	}

	private Object[] addElementsOctave(Object[] elementos) {
		
		String[] out = new String[elementos.length + 7];

		int i = 0;
		
		for (; i < elementos.length; i++) {
			
			out[i] = (String)elementos[i];
		}
		
		out[i++] =  "Oh";
		out[i++] =  "Ow";
		out[i++] =  "Om";
		out[i++] =  "OM";
		out[i++] =  "Oc";
		out[i++] =  "OC";
		out[i++] =  "OQ";
		// TODO Auto-generated method stub
		return out;
	}

	private String[] getElementsTonos() {
		
		int limit = 3;

		String[] elem = new String[3];
		
		for (int i = 0; i < limit; i++) {
			
			elem[i] = String.valueOf(TonoEnum.values()[i].name());
		}
		
		//elem[3] = String.valueOf(TonoEnum.O.name());
		
		return elem; 
	}

	public List<TonoEnum[]> getPatrones() {
		
		return patrones;
	}

	public FuncionEnum getFunction() {
		
		return function;
	}

	public static void main(String[] args) {
		Patron patron = new Patron(FuncionEnum.menor);
		
		List<TonoEnum[]> list = patron.getPatrones();

		
		System.out.println(patron.function.caption);
		
		for (TonoEnum[] tonos : list ) {
			
			System.out.println(Arrays.asList(tonos));
			
		}
		
		System.out.println(list.size());

		
	}

}
