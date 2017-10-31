package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.FMaj6;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.ModoSequence;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPosition;
import manchicle.armony.guitar.GuitarPositionEnum;

public class TestGuitar {

	public static void main(String[] args) {
		
		Cadencia cadencia = new Cadencia();
		
		FMaj6 fmaj6 = new FMaj6(NotaEnum.F);
		
		cadencia.add(fmaj6 );
		//cadencia.add(new F7Dominante(NotaEnum.A), SequenceModo.jazz);
		System.out.println("Tonalidad de: " + fmaj6.getTonalidad() + fmaj6.getFuncion());
		
		NotaEnum[] escala = fmaj6.getEscala();
		System.out.println("Escala: " + Arrays.asList(escala));
		System.out.println("Cadencia tipo: " + Arrays.asList(ModoSequence.nn1.toString()));
		
		Iterator<Modo> iter = cadencia.iterator();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			for (Object o : modo.getFunciones()) {
				
				IFuncion funcion = (IFuncion)o;

				
				Guitar guitar = new Guitar();
				
				guitar.setNotas(funcion.getEscala(TonoEnum.m));

				guitar.add(GuitarPositionEnum.posicion1);
//				guitar.add(PositionEnum.posicion2);
//				guitar.add(PositionEnum.posicion3);
//				guitar.add(PositionEnum.posicion4);
//				guitar.add(PositionEnum.posicion5);
//				guitar.add(PositionEnum.posicion6);
//				guitar.add(PositionEnum.posicion7);
				
				Iterator<GuitarPosition> iterGuitar = guitar.iterator();
				
				while (iterGuitar.hasNext()) {
					
					GuitarPosition posicion = (GuitarPosition) iterGuitar.next();
					System.out.println(funcion.getTonalidad().getEnarmonico()+funcion.getFuncion().getNomenclatura());
					System.out.println(posicion.getPosicion());
					getEscala(funcion);
					getArpegio(funcion);
					System.out.println(guitar.toString(posicion));
				}				
			}
		}
	}
	
	private static void getArpegio(IFuncion f) {
		
		StringBuffer sb = new StringBuffer();
		
		for (NotaEnum nota: f.getEscala(TonoEnum.m)) {
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
