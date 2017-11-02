package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Escala{
	
	protected int type;
	
	protected NotaEnum tonalidad;

	protected NotaEnum[] escalaNatural;

	protected NotaEnum[] escala;

	protected List<NotaEnum[]> escalas = new ArrayList<NotaEnum[]>();
	
	protected String[] alteracionNatural;

	public static final int NATURAL = -1;
	
	public static final int ALL = -2;
	
	protected Funcion funcion = new Funcion();
	
	protected TonoEnum septima;
	
	public int getType(){
		
		return type;
	}
	
	public void setType(NotaEnum[] a){
		
		int i = 0;
		
		for (NotaEnum[] b : escalas) {
			
			boolean r = true;
			
			for (int j = 0; j < a.length; j++) {
				if (!a[j].equals(b[j])){
					r = false;
					break ;
				}
			}
			
			if (r) {
				type = i;
				return;
			}
			
			i++;
		}
		type = -3;
	}
	
	public List<NotaEnum[]> getEscalas() {
		return escalas;
	}

	//TODO revisar llamada a getEscala con type = -3
	public NotaEnum[] getEscala() {
		
		//TODO cambio momentaneo se obtiene 1era escala de tonalidad
		return type != -3 ? getEscala(tonalidad,type).get(0) : getEscala(tonalidad,0).get(0);
//		return type != -3 ? getEscala(tonalidad,type).get(0) : null;
	}

	public NotaEnum[] getEscalaNatural() {
		return escalaNatural;
	}

	public void setEscalas(NotaEnum tonalidad) {
		
		this.tonalidad = tonalidad;
		
		escalas = getEscalas(tonalidad); 
		
		List<NotaEnum[]> escala2 = getEscala(tonalidad, Escala.NATURAL);
		
		escalaNatural = escala2.size() == 0 ? null : escala2.get(0);
		
		escala = escalaNatural;
		
		type = Escala.NATURAL;
		
	}

	public void setEscalas(NotaEnum tonalidad, int type) {
		
		setEscalas(tonalidad);
		
		escala = getEscala(tonalidad, type).get(0);
		
		this.type = type; 
	}

	
	public NotaEnum getTonalidad() {
		
		return tonalidad;
	}
	
	public NotaEnum[] getEscala(NotaEnum[] escala, TonoEnum intervalo) {
		
		NotaEnum[] outIntervalo = new NotaEnum[4];
		
		outIntervalo[0] =  escala[0];
		
		for (int i = 1; i < 4; i++) {
			
			outIntervalo[i] = outIntervalo[i-1].getIntervalo(escala, intervalo);
			
		}
		
		return outIntervalo;
	}

	public NotaEnum[] getEscala(TonoEnum intervalo, int size) {
		
		NotaEnum[] outIntervalo = new NotaEnum[size];
		
		outIntervalo[0] =  this.escala[0];
		
		for (int i = 1; i < size; i++) {
			
			outIntervalo[i] = outIntervalo[i-1].getIntervalo(this.escala, intervalo);
			
		}
		
		return outIntervalo;
	}

	public NotaEnum[] getEscala(TonoEnum intervalo) {
		
		NotaEnum[] outIntervalo = new NotaEnum[4];
		
		outIntervalo[0] =  this.escala[0];
		
		for (int i = 1; i < 4; i++) {
			
			outIntervalo[i] = outIntervalo[i-1].getIntervalo(this.escala, intervalo);
			
		}
		
		return outIntervalo;
	}


	protected List<NotaEnum[]> getEscalas(NotaEnum tonalidad) {
		
		Iterator<Patron> iter = funcion.iterator();
		
		List<NotaEnum[]> listOut = new ArrayList<NotaEnum[]>();
		
		while (iter.hasNext()) {
			
			Patron patron = (Patron) iter.next();

			List<TonoEnum[]> listPatrones = patron.getPatrones();
			
			for (TonoEnum[] tonosPatron : listPatrones) {
				
				NotaEnum[] notas = escalador(tonosPatron, tonalidad);
				
				listOut.add(notas);
			}
		}
		
		return listOut;
	}
	
	private NotaEnum[] escalador(TonoEnum[] patron, NotaEnum tonalidad) {
		
		NotaEnum[] notas = new NotaEnum[7];
		
		notas[0] = tonalidad;
		
		for (int i = 0; i < patron.length; i++) {
			
			notas[i+1] = notas[i].getIntervalo(patron[i]); 
		}
		
		return notas;
	}
	
	protected NotaEnum[] obtainPatron(NotaEnum[] escala) {
		
		double[] distancias = new double[6];
		
		for (int i = 0; i < escala.length - 1; i++) {
			
			distancias[i] = escala[i].getDistancia((NotaEnum)escala[i+1]);
		}
		
		return null;
	}	
	
	public List<NotaEnum[]> getEscala(NotaEnum tonalidad, int typeEscala) {

		if (typeEscala == ALL){
			
			return getEscalas(tonalidad);
			
		} else if (typeEscala == NATURAL){
			
			return getEscalaNatural(tonalidad); 
			
		} else {
			
			return getSpecificEscala(tonalidad, typeEscala);
		}
	}

	private List<NotaEnum[]> getEscalaNatural(NotaEnum tonalidad) {
		
		List<NotaEnum[]> out  = new ArrayList<NotaEnum[]>();

		for (NotaEnum[] escala : escalas) {
			
			if (isNatural(escala, tonalidad.name())){
				
				out.add(escala);
				
				return out;
			}
		}
		return out;
	}
	
	private List<NotaEnum[]> getSpecificEscala(NotaEnum tonalidad, int i) {
		
		List<NotaEnum[]> out  = new ArrayList<NotaEnum[]>();

		if (i > escalas.size()) {
			out.add(escalas.get(0));
			return out;
		}
		
		out.add(escalas.get(i));
		
		return out;
	}
	
	protected abstract boolean isNatural(NotaEnum[] escala, String tonalidad);
	
	protected String[] applyAlteraciones(String[] escala, String[] alteraciones) {
		
		String[] out = new String[escala.length];

		for (int i = 0; i < escala.length; i++) {
			
			if (i == 4) {
				out[i] = alteraciones[0];
				
			}else if (i == 6) {
				out[i] = alteraciones[1];
				
			}else{
				out[i] = escala[i];
			}
		}
		
		return out;
	}

	protected String[] getAlteraciones(String t) {
		
		String[] out = new String[alteracionNatural.length];
		
		for (int i = 0; i < alteracionNatural.length; i++) {
			
			double pesoAlteracion;
			
			TonoEnum intervaloTonal = null;
			
			if (alteracionNatural[i].equals("")) {
				
				pesoAlteracion = 0;
				
				if (i == 0) intervaloTonal = TonoEnum.Q;
				
				else intervaloTonal = septima;
				
			}else {
			
				pesoAlteracion = alteracionNatural[i].charAt(0) == 'b' ? -1 :  1;
				
				intervaloTonal = alteracionNatural[i].charAt(1) == '7' ? septima : TonoEnum.Q;
			}
			
			int pos = NotaEnum.valueOf(t).getIntervalo(intervaloTonal).ordinal() + (int)pesoAlteracion;
			
			if ( pos < 0) {
				
				pos = pos + 12;
				
			}else if (pos > 11){
				
				pos = pos - 12;
			}
		
			out[i] = NotaEnum.values()[pos].name();
			
		}
		return out;
	}
	
	public static double[] getDistancias(Object[] escala) {
		
		double[] distancias = new double[escala.length];
		
		for (int i = 0; i < escala.length - 1; i++) {
			
			distancias[i] = ((NotaEnum)escala[i]).getDistancia((NotaEnum)escala[i+1]);
		}
		
		return distancias;
	}

	
	public static void main(String[] args) {
		Escala escala = new Escala() {
			@Override
			protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
				// TODO Auto-generated method stub
				return true;
			}
		};
		
		escala.funcion.add(FuncionEnumExt.FMin7);
		
		
		Iterator<Patron> iter = escala.funcion.iterator();
		
		while (iter.hasNext()) {
			
			Patron patron = (Patron) iter.next();

			List<TonoEnum[]> listPatrones = patron.getPatrones();
			
			for (TonoEnum[] tonosPatron : listPatrones) {
				
				NotaEnum[] notas = escala.escalador(tonosPatron, NotaEnum.D);
				
				System.out.println(Arrays.asList(notas));
			}
		}

		
	}

}
