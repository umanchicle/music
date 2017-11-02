package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Patron {
	
	private static Patron instance = null;
	
	   public static Patron getInstance(Object function) {
	      if(instance == null) {
	         instance = new Patron(function);
	      }
	      return instance;
	   }
	
	
	private Object function;
	
	public void setFunction(Object function) {
		this.function = function;
	}


	private List<TonoEnum[]> patrones = new ArrayList<TonoEnum[]>();

	public void setPatrones(List<TonoEnum[]> patrones) {
		this.patrones = new ArrayList<TonoEnum[]>();
		this.patrones = patrones;
	}


	private List<String> listPermutacion;
	
	public List<String> getPermutacion() {
		return listPermutacion;
	}

	public Patron(Object function) {
		
		this.function = function;
		
		if (listPermutacion == null)
			setPermutacion();
		
		//this.patrones = getCombinatoria();
	}
	
	private void setPermutacion() {
		Permutar permutar = new Permutar();
		
		Object[] elementos = getElementsTonos(); 

		this.listPermutacion = permutarPatrones(permutar, elementos).lista;//permuta elementos encontrados
	}

	public List<TonoEnum[]> getCombinatoria() {
		
		List<TonoEnum[]> list = new ArrayList<TonoEnum[]>();
				
		for (String p : listPermutacion) {
			
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

		if (this.function instanceof FuncionEnum) {
			if (((FuncionEnum)this.function).isFunction(tonos)){
				
				list.add(tonoEnums);
			}
		}else if (this.function instanceof FuncionEnumExt) {
			
			if (((FuncionEnumExt)this.function).isFunction(tonos)){
				
				list.add(tonoEnums);
			}
			
		}else if (this.function instanceof FuncionEnumExt2) {
			if (((FuncionEnumExt2)this.function).isFunction(tonos)){
				
				list.add(tonoEnums);
			}
		}
		

	}

	private Permutar permutarPatrones(Permutar permutar, Object[] elementos) {
		
		permutar.generarPermutacionSust(elementos, "", 2);
		
		elementos = permutar.lista.toArray();
		
		//elementos = addElementsOctave(elementos);
		
		permutar = new Permutar();
		
		permutar.generarPermutacionSust(elementos, "", 3);
		
		return permutar;
	}

	private Object[] addElementsOctave(Object[] elementos) {
		
		String[] out = new String[elementos.length + 12];

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
		out[i++] =  "Ox";
		out[i++] =  "OX";
		out[i++] =  "Os";
		out[i++] =  "OS";
		out[i++] =  "OO";
		// TODO Auto-generated method stub
		return out;
	}

	private String[] getElementsTonos() {
		
		int limit = 12;

		String[] elem = new String[12];
		
		for (int i = 0; i < limit; i++) {
			
			elem[i] = String.valueOf(TonoEnum.values()[i].name());
		}
		
		//elem[3] = String.valueOf(TonoEnum.O.name());
		
		return elem; 
	}

	public List<TonoEnum[]> getPatrones() {
		
		return patrones;
	}

	public Object getFunction() {
		
		return function;
	}

	public static void main(String[] args) {
		Patron patron = Patron.getInstance(FuncionEnumExt.F11);
		
		List<TonoEnum[]> list = patron.getPatrones();

		
		System.out.println(((FuncionEnumExt)patron.getFunction()).caption);
		
		for (TonoEnum[] tonos : list ) {
			
			System.out.println(Arrays.asList(tonos));
			
		}
		
		System.out.println(list.size());

		
	}

}
