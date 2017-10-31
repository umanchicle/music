package manchicle.armony.guitar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.Escala;
import manchicle.armony.core.FDefault;
import manchicle.armony.core.FMen11b13;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.Permutar;
import manchicle.armony.core.TonoEnum;

public class Guitar {
	
	private GroupEnum[] grupos = null; 
	
	private GuitarPosition[] posiciones = new GuitarPosition[50];
	
	private int numero = 0;

	private NotaEnum[] notas; 
	
	private GuitarPositionEnum posicion;
	
	private int representativa;
	
	private IFuncion funcion;
	
	public void setFuncion(IFuncion funcion) {
		this.funcion = funcion;
	}
	
	public IFuncion getFuncion() {
		return funcion;
	}

	public void setGrupos(GroupEnum[] grupos) {
		this.grupos = grupos;
	}
	
	public GroupEnum[] getGrupos() {
		return grupos;
	}

	Permutar permutacion = new Permutar();

	
	public Guitar() {
		
		String[] elementos = { "0", "1", "2", "3"};

		permutacion.generarPermutacionSust(elementos, "", 4);
	}
	
	public NotaEnum[] getNotas() {
		
		return notas;
	}
	
	public GuitarIterator iterator(){
		
		return new GuitarIterator(posiciones);
	}
	
	public void add(GuitarPositionEnum pos){
		
		GuitarTo diapasonTo = new GuitarTo();
		
		GuitarPosition posicion = new GuitarPosition();
		
		posicion.setPosicion(pos);
		
		for (GuitarSpaceEnum espacioEnum : pos.spaces) {
			
			GuitarPosturaTo[] listPosturas = getOcurrens(espacioEnum);
			
			diapasonTo.addEstructura(espacioEnum, listPosturas);

		}
		posicion.setDiapasonArpegio(diapasonTo);
		
		posiciones[numero++] = posicion;
	}

	
	public GuitarPositionEnum getPosicion() {
		
		return posicion;
	}
	
	public void setNotas(NotaEnum[] notas) {
		
		this.notas = notas;
	}
	
	private GuitarPosturaTo[] getOcurrens(GuitarSpaceEnum espacio) {
		
		int totalStrings = espacio.notas.length;
		
		GuitarPosturaTo[] outPosturas = new GuitarPosturaTo[totalStrings];;

		int countString = totalStrings;
		
		int countPosturas = 0;
		
		for (NotaEnum notaEnum : espacio.notas) {
			
			if (getNote(notaEnum) != null)
			{
				//TODO: verificar cambio de espacio
				
				GuitarPosturaTo postura = new GuitarPosturaTo();
				
				postura.setNote(notaEnum);
				
				postura.setString(GuitarStringEnum.values()[totalStrings - countString]);
				
				postura.setEspacio(espacio);
				
				outPosturas[totalStrings - countString] = postura;
				
				countPosturas++;
			}
			
			countString--;
		}
		
		return countPosturas > 0 ? outPosturas : null ;
	}

	private NotaEnum getNote(NotaEnum nota) {
		
		for (NotaEnum notaEnum : notas) {
			
			if (notaEnum.equals(nota)) {
				
				return nota;
			}
		}
		return null;
	}


public String toString2(GuitarPosition pos) {
		
		String aux[] = {"   ","   ","   ","   ","   ","   "};

		aux[0] = "6  ";
		aux[1] = "5  ";
		aux[2] = "4  ";
		aux[3] = "3  ";
		aux[4] = "2  ";
		aux[5] = "1  ";
		
		StringBuffer stringBuffer = new StringBuffer();
		
		Arrays.asList(aux, '|').toString();
		
		stringBuffer.append("    6   5   4   3   2   1"+ "\n\n");
		
		for (int i = 0; i < pos.getPosicion().getSpaces().length; i++) {

			GuitarSpaceEnum currentSpace = pos.getPosicion().getSpaces()[i];
			
			GuitarPosturaTo[] posturas = pos.getGuitarTo().getEstructura().get(currentSpace); 
			
			if ( posturas != null){
			
				stringBuffer.append(String.valueOf(currentSpace.pos)  +putNotas(posturas)+ "\n\n");
				
				
			}else{
				stringBuffer.append(String.valueOf(currentSpace.pos) + "   |   |   |   |   |   |" + "\n\n");
			}
		}
		
		return stringBuffer.toString();
	}

	public String toString(GuitarPosition pos) {
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("    6   5   4   3   2   1"+ "\n\n");
		
		for (int i = 0; i < pos.getPosicion().getSpaces().length; i++) {

			GuitarSpaceEnum currentSpace = pos.getPosicion().getSpaces()[i];
			
			GuitarPosturaTo[] posturas = pos.getGuitarTo().getEstructura().get(currentSpace); 
			
			if ( posturas != null){
			
				stringBuffer.append(String.valueOf(currentSpace.pos)  +putNotas(posturas)+ "\n\n");
				
				
			}else{
				stringBuffer.append(String.valueOf(currentSpace.pos) + "   |   |   |   |   |   |" + "\n\n");
			}
		}
		
		return stringBuffer.toString();
	}
	
	
	private String putNotas(GuitarPosturaTo[] posturas) {
		
		StringBuffer s = new StringBuffer();
		
		for (GuitarPosturaTo GuitarPosturaTo : posturas) {
			
			if (GuitarPosturaTo != null) {
				
				relleno(s, "   ", " ");
				
				s.append(GuitarPosturaTo.getNote().getEnarmonico());	
				
			} else {
				relleno(s, "   |", "  |");
			}
		}
		
		return s.toString();
	}

	public void relleno(StringBuffer s, String value1, String value2) {
		
		String aux = s.toString().length() > 1 ? s.toString().substring(s.toString().length()-2) : s.toString(); 
		
		if (aux.trim().equals("") || aux.trim().equals("|") || aux.trim().length()==1) {
			
			s.append(value1);
			
		}else{
			
			s.append(value2);
		}
	}
	
	private void cleanPosiciones() {
		
		this.posiciones = new GuitarPosition[50];
		
		numero = 0;
	}


	/**
	 * Agrega conjunto de acordes comenzando en tonica en 3 ultimas cuerdas y en cuarta cuerda
	 * @param pos
	 */
	public void generateChords(GuitarPosition pos) {
		
		addChords(pos, 0); 
		
		addChords(pos, 2);
	}
	
	/**
	 * Genera Lista de acordes
	 * retorna una lista con todos los acordes para una posicion dada
	 * @param pos 
	 * @param inicio 0 si comienza la tonica en el 6to 5to espacio y 2 para el comienzo de la tonica en la 4ta cuerda
	 * @return 
	 */
	
	/**
	 * evalua restricciones en combinatoria de acordes
	 * total notas
	 * representativas
	 * Tonica
	 * grupos de cuerdas
	 * */
	private void addChords(GuitarPosition pos, int inicio) {
		
		GuitarTo guitarTo = new GuitarTo();
		
		GuitarStringEnum tonica = null;
		
		for (String list : permutacion.getLista()) {
			
			Map<GuitarStringEnum, Integer> mapString = new HashMap<GuitarStringEnum, Integer>();
			
			NotaEnum[] notas = addNotas(list);
			
			tonica = obtainTonica(pos, inicio, tonica, mapString, notas);
			
			if(mapString.size() < 4) continue;

			if(!containsRepresentativas(notas)) continue;
			
			if(!notas[0].equals(this.notas[0])) continue;
			
			if(getGrupos() != null) if (!existsGroup(mapString)) continue;
			
			guitarTo = generateGuitarTo(pos, mapString, notas, tonica);
			
			guitarTo.setNotas(notas);
			
			guitarTo.setOrderNotas(notas[0].getOrderByNote(notas));
			
			IFuncion funcion = Modo.getFuncion(guitarTo.getOrderNotas());

			double distanciaOrderNotas = sumaDistancias(guitarTo.getOrderNotas()); 
			
			String nameChord = obteinNameChord(guitarTo, funcion, distanciaOrderNotas);

			guitarTo.setName(nameChord);
			
			pos.setDiapasonAcordes(guitarTo); 
		}
	}

	private String obteinNameChord(GuitarTo guitarTo, IFuncion funcion,	double distanciaOrderNotas) {
		
		double distanciaNotas;
		
		String nameChord  = "";
		
		String nameNomenclaturaFuncion = "";
		
		if(funcion instanceof FDefault){
			
			nameNomenclaturaFuncion = this.notas[0].getEnarmonico()+this.funcion.getFuncion().getNomenclatura();
			
			distanciaNotas = sumaDistancias(this.notas);

			StringBuffer s = new StringBuffer();
			
			for (double d : Escala.getDistancias(guitarTo.getOrderNotas())) {
				
				s.append(d + ",");
			}
			nameChord  = nameNomenclaturaFuncion + "*" + s.toString();
			
		} else {
			
			nameNomenclaturaFuncion = this.notas[0].getEnarmonico()+funcion.getFuncion().getNomenclatura();
			
			distanciaNotas = sumaDistancias(funcion.getEscala(TonoEnum.m));
			
			StringBuffer s = new StringBuffer();
			
			for (double d : Escala.getDistancias(guitarTo.getOrderNotas())) {
				
				s.append(d + ",");
			}
			
			nameChord  = evaluateName(distanciaOrderNotas, distanciaNotas, nameNomenclaturaFuncion )+ " " + s.toString();
		}
		return nameChord;
	}

	private GuitarStringEnum obtainTonica(GuitarPosition pos, int inicio, GuitarStringEnum tonica,
			Map<GuitarStringEnum, Integer> mapString, NotaEnum[] notas) {
		int i = inicio;
		
		int cont=0;
		
		for (NotaEnum nota : notas) {
			
			GuitarStringEnum cuerda = getCuerda(pos.getPosicion(), nota, i);
			
			if(i == inicio) tonica = cuerda; 

			if(cuerda == null) break;

			if (mapString.get(cuerda) == null ) mapString.put(cuerda, cont++);

			i = cuerda.ordinal() + 1;
		}
		return tonica;
	}
	
	public String evaluateName(double distanciaOrderNotas, double distanciaNotasFuncion, String nameNomenclatura) {
		
		System.out.println(distanciaNotasFuncion + ":" + distanciaOrderNotas);
		
		String aux;
		
		if(distanciaOrderNotas == distanciaNotasFuncion){
			
			return nameNomenclatura; 
			
		}else if(distanciaOrderNotas < distanciaNotasFuncion ){
			
			aux = nameNomenclatura.replace("7", "").replace("6", "");
			
			return aux.contains("maj") ? aux.replace("maj", "") : aux;
		}
		
		return null;
	}

	public double sumaDistancias(NotaEnum[] notas) {
		double suma = 0d;
		
		for (double d : Escala.getDistancias(notas) ) {
			
			suma = suma + d; 
		}
		
		return suma;
	}

	public boolean existsGroup(Map<GuitarStringEnum, Integer> mapString) {
		
		boolean isFound = false;
		
		for (GroupEnum group : grupos) {
			
			isFound = isFoundGroup(group.strings, mapString); 
			
			if (isFound) break; else continue;
		}
		return isFound;
	}

	private boolean isFoundGroup(GuitarStringEnum[] group, Map<GuitarStringEnum, Integer> mapString) {
		
		for (GuitarStringEnum stringEnum : group) {
			
			if(mapString.get(stringEnum) == null) return false;
		}
		
		return true;
	}

	private boolean containsRepresentativas(NotaEnum[] notas) {

		boolean out = false;
		
		for (String r : String.valueOf(this.representativa).split("")) {
			
			int indice = (r == null || r.equals("")) ? 0 : searchIndiceRepr(Integer.parseInt(r));

			if(indice == 0) continue;

			int i = 0;
			for (NotaEnum notaEnum : notas) {
				
				if(this.notas[indice].equals(notaEnum)){
					out = true;
					
					break;
				}
				
				i++;
			}
			
			if (i== notas.length) out = false;
			
			if(out) continue; else break;
		}
		return out;
	}

	private int searchIndiceRepr(int r) {
		
		if (r == 2 || r == 3)
			return 1;
		else if (r == 4 || r == 5)
			return 2;
		else if (r == 6 || r == 7)
			return 3;
		else
			return 0;
	}

	private GuitarTo generateGuitarTo(GuitarPosition pos, Map<GuitarStringEnum, Integer> mapString, NotaEnum[] notas, GuitarStringEnum sBajo) {
		
		GuitarTo out = new GuitarTo();
		
		for (GuitarSpaceEnum espacioEnum : pos.getPosicion().getSpaces()) {
			
			GuitarPosturaTo[] newPosturas = null;
			
			GuitarPosturaTo[] posturas = pos.getGuitarTo().getEstructura().get(espacioEnum);
			
			if(posturas == null) continue;
			
			newPosturas = getPosturas(posturas, espacioEnum, notas, mapString, sBajo);
			
			out.addEstructura(espacioEnum, newPosturas);
		}
		
		return out;
	}

	private GuitarPosturaTo[] getPosturas(GuitarPosturaTo[] posturas, GuitarSpaceEnum espacio, NotaEnum[] notas, Map<GuitarStringEnum, Integer> maplist, GuitarStringEnum sBajo) {

		GuitarPosturaTo[] out = new GuitarPosturaTo[posturas.length];
		
		GuitarPosturaTo newPostura;

		if(posturas[sBajo.ordinal()] != null)

			if (posturas[sBajo.ordinal()].getNote().equals(notas[0])) {
				
				newPostura = new GuitarPosturaTo();
				
				newPostura.setEspacio(espacio);
				
				newPostura.setNote(notas[0] );
				
				newPostura.setString(posturas[sBajo.ordinal()].getString());
				
				out[sBajo.ordinal()] = newPostura;

				maplist.remove(sBajo);
			}
		
		for (int i = sBajo.ordinal() + 1; i < posturas.length; i++) {
			
			if(posturas[i] == null) continue;

			if(maplist.get(posturas[i].getString()) == null) continue;
			
			int j = maplist.get(posturas[i].getString());
			
			if(!posturas[i].getNote().equals(notas[j])) continue;
			
			newPostura = new GuitarPosturaTo();
			
			newPostura.setEspacio(espacio);
			
			newPostura.setNote(notas[j]);
			
			newPostura.setString(posturas[i].getString());
			
			out[i] = newPostura;

			maplist.remove(posturas[i].getString());
		}
		
		return out;
	}

	public GuitarStringEnum getCuerda(GuitarPositionEnum pos, NotaEnum nota, int init) {

		for ( int i = init; i < GuitarStringEnum.values().length; i++) {
			
			GuitarStringEnum string = GuitarStringEnum.values()[i];
			
			for (GuitarSpaceEnum espacio : pos.getSpaces()) {
				
				if(espacio == null) continue;
				
				if (espacio.notas[i].equals(nota) ) return string; 
			}
		}
		
		return null;
	}

	private NotaEnum[] addNotas(String list) {
		
		NotaEnum notas[] = new NotaEnum[4];
		
		notas[0] = this.notas[Integer.valueOf(list.substring(0, 1)).intValue()];
		
		notas[1] = this.notas[Integer.valueOf(list.substring(1, 2)).intValue()];
	
		notas[2] = this.notas[Integer.valueOf(list.substring(2, 3)).intValue()];

		notas[3] = this.notas[Integer.valueOf(list.substring(3, 4)).intValue()];
		
		return notas;
	}
	
	public void setRepresentativa(int representativa) {
		
		this.representativa = representativa;
	}

	public static void main(String[] args) {

		Guitar guitar = new Guitar();
		
		Cadencia cadencia = new Cadencia();
		
//		cadencia.add(new FMen6(NotaEnum.C)/*, ModoSequence.nn1*/);
		
		cadencia.add(new FMen11b13(NotaEnum.C));
//		cadencia.add(new F7Dominante(NotaEnum.A), SequenceModo.jazz);
		
		Iterator<Modo> iter = cadencia.iterator();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			System.out.println("Tonalida de : " );
			
			for (Object o : modo.getFunciones()) {
				
				IFuncion f = (IFuncion)o;
				
				if (f instanceof FDefault){
					double[] distancias = Escala.getDistancias(f.getEscala());
					
					StringBuffer s = new StringBuffer();
					
					s.append("[");
					s.append(distancias[0]+distancias[1]+",");
					s.append(distancias[2]+distancias[3]+",");
					s.append(distancias[4]+distancias[5]);
					s.append("]");
					
					System.out.println(s.toString());
				}else{
				
					System.out.println(f.getEscala()[0].getEnarmonico()+f.getFuncion().getNomenclatura());
				}
			}
			
			System.out.println("\n");
			
			for (Object o : modo.getFunciones()) {

				guitar.cleanPosiciones();
				
				IFuncion f = (IFuncion)o;
				
				TonoEnum tono = TonoEnum.m;
				
				guitar.setNotas(f.getEscala(tono));
				
				if (!(f instanceof FDefault))
				guitar.setRepresentativa(f.getFuncion().getRepresentativa());
				
				guitar.setFuncion(f);
				
				guitar.add(GuitarPositionEnum.posicion1);
//				guitar.add(PositionEnum.posicion2);
//				guitar.add(PositionEnum.posicion3);
//				guitar.add(PositionEnum.posicion4);
//				guitar.add(PositionEnum.posicion5);
//				guitar.add(PositionEnum.posicion6);
//				guitar.add(PositionEnum.posicion7);
				
				guitar.setGrupos(new GroupEnum[]{
						GroupEnum.Group1,
						GroupEnum.Group2, 
						GroupEnum.Group3, 
						/*GroupEnum.Group4, 
						GroupEnum.Group5, 
						GroupEnum.Group6*/});
				
				Iterator<GuitarPosition> iterGuitar = guitar.iterator();
				
				while (iterGuitar.hasNext()) {
				
					GuitarPosition posicion = (GuitarPosition) iterGuitar.next();
					
					System.out.println(posicion.getPosicion());
					
					getEscala(f);
					
					getArpegio(f, tono);
					
					String nameNomenclaturaFuncion = "";
					
					if (f instanceof FDefault){
						double[] distancias = Escala.getDistancias(f.getEscala());
						
						StringBuffer s = new StringBuffer();
						
						s.append("[");
						s.append(distancias[0]+distancias[1]+",");
						s.append(distancias[2]+distancias[3]+",");
						s.append(distancias[4]+distancias[5]);
						s.append("]");
						nameNomenclaturaFuncion = s.toString();
					}else{
					
					 nameNomenclaturaFuncion = f.getEscala()[0].getEnarmonico()+f.getFuncion().getNomenclatura();
					}
					
					System.out.println("\t"+nameNomenclaturaFuncion+"\n");
					
					System.out.println(guitar.toString(posicion));
					
					GuitarPosition posChord = new GuitarPosition();
					
					posChord.setPosicion(posicion.getPosicion());
					
					guitar.generateChords(posicion);
					
					for (GuitarTo guitarTo : posicion.getDiapasonAcordes()) {
						
						System.out.println(guitarTo.getName());
						
						posChord.setDiapasonArpegio(guitarTo);
						
						System.out.println(guitar.toString(posChord));
					}
				}
			}
		}
	}

	private static void getArpegio(IFuncion f, TonoEnum tono) {
		
		StringBuffer sb = new StringBuffer();
		
		for (NotaEnum nota: f.getEscala(tono)) {
			sb.append(nota.getEnarmonico() + " ");
		}
		
		System.out.println(sb.toString());
		
	}

	private static void getEscala(IFuncion f) {
		
		StringBuffer sb = new StringBuffer();
		
		for (NotaEnum nota: f.getEscala()) {
			sb.append(nota.getEnarmonico() + " ");
		}
		
		System.out.println(sb.toString());
	}
}
