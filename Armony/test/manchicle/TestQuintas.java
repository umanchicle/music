package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.Escala;
import manchicle.armony.core.FDefault;
import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPositionEnum;
import manchicle.armony.guitar.GuitarPosition;

public class TestQuintas {

	public static void main(String[] args) {
	
		IFuncion funcion = new FMenor(NotaEnum.C, 16);
		
		Modo modo = new Modo(funcion);
		
		for (GuitarPositionEnum positionEnum : GuitarPositionEnum.values()) {
			
			for (Object o : modo.getFunciones()) {
				
				System.out.println("\n------------o-------------\n");
				
				IFuncion f = (IFuncion) o; 
				
//				NotaEnum[] escala = f.getEscala(TonoEnum.h, 7);
				NotaEnum[] escala = f.getEscala(TonoEnum.Q);
				
				for (NotaEnum nota : escala) {
					
					printChord(nota, f, positionEnum);
				}
			}
		}
	}
	
	public static void printChord(NotaEnum nota, IFuncion f, GuitarPositionEnum positionEnum) {
		
		Guitar guitar = new Guitar();
		
		guitar.setNotas(new NotaEnum[]{nota});

		guitar.add(positionEnum);
		
		guitar.setFuncion(f);
		
		Iterator<GuitarPosition> iterGuitar = guitar.iterator();
		
		while (iterGuitar.hasNext()) {
			
			GuitarPosition posicion = (GuitarPosition) iterGuitar.next();
			
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
