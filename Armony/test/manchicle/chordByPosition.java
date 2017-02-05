package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.Escala;
import manchicle.armony.core.FDefault;
import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.Posicion;
import manchicle.armony.guitar.PositionEnum;

public class chordByPosition {
	
	
	public static void main(String[] args) {
		
		
		Cadencia cadencia = new Cadencia();
		
		IFuncion funcion = new FMenor(NotaEnum.C);
		
		cadencia.add(funcion);
		
		Iterator<Modo> iter = cadencia.iterator();
		
		int i = 0;
		while (iter.hasNext() || i == 0) {
		
			Modo modo = (Modo) iter.next();

			for (PositionEnum positionEnum : PositionEnum.values()) {
				
				System.out.println("\n------------o-------------\n");

				for (Object o : modo.getFunciones()) {
					
					IFuncion f = (IFuncion) o; 
					
					NotaEnum[] escala = f.getEscala(TonoEnum.m);
					
					printChord(escala, f, positionEnum);
					
//					for (NotaEnum nota : escala) {
//						
//						printChord(nota, f, positionEnum);
//					}
				}
			}
			
			i++;
			
		}		
		
	}

	public static void printChord(NotaEnum[] nota, IFuncion f, PositionEnum positionEnum) {
		
		Guitar guitar = new Guitar();
		
		//guitar.setNotas(new NotaEnum[]{nota[0]});
		
		guitar.setNotas(nota);

		guitar.add(positionEnum);
		
		guitar.setFuncion(f);
		
		Iterator<Posicion> iterGuitar = guitar.iterator();
		
		while (iterGuitar.hasNext()) {
			
			Posicion posicion = (Posicion) iterGuitar.next();
			
			System.out.println(Arrays.asList(f.getEscala()));
			
			System.out.println(posicion.getPosicion());
			
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
		}
	}

	
}
