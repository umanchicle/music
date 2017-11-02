package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.Escala;
import manchicle.armony.core.FDefault;
import manchicle.armony.core.FMenor;
import manchicle.armony.core.Funcion;
import manchicle.armony.core.FuncionEnumExt;
import manchicle.armony.core.FuncionEnumExt2;
import manchicle.armony.core.Function;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPositionEnum;
import manchicle.armony.guitar.GuitarPosition;

public class TestTerceraMenorCompleta {
	
	
	public static void main(String[] args) {
		
		
		Cadencia cadencia = new Cadencia();
		
		IFuncion funcion = new Function(FuncionEnumExt.Fmaj711, NotaEnum.C);
		
		cadencia.add(funcion);
		
		Iterator<Modo> iter = cadencia.iterator();
		
		int i = 0;
		while (iter.hasNext() || i == 0) {
		
			Modo modo = (Modo) iter.next();

			for (GuitarPositionEnum positionEnum : GuitarPositionEnum.values()) {
				
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

	public static void printChord(NotaEnum[] nota, IFuncion f, GuitarPositionEnum positionEnum) {
		
		Guitar guitar = new Guitar();
		
		//guitar.setNotas(new NotaEnum[]{nota[0]});
		
		guitar.setNotas(nota);

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
			
				if (f.getFuncion() instanceof FuncionEnumExt) {
					nameNomenclaturaFuncion = f.getEscala()[0].getEnarmonico()+((FuncionEnumExt)f.getFuncion()).getNomenclatura();					
				}else{
					nameNomenclaturaFuncion = f.getEscala()[0].getEnarmonico()+((FuncionEnumExt2)f.getFuncion()).getNomenclatura();	
				}
 
			}

			
			
			System.out.println("\t"+nameNomenclaturaFuncion+"\n");
			
			System.out.println(guitar.toString(posicion));
		}
	}

	
}
