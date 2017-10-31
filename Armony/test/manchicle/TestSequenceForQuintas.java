package manchicle;

import java.util.Iterator;

import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPositionEnum;
import manchicle.armony.guitar.GuitarPosition;

public class TestSequenceForQuintas {
	
	public static void main(String[] args) {
		
		IFuncion fm = new FMenor(NotaEnum.C);
		
		Modo modo = new Modo(fm);
		
		IFuncion f = null;
		
		printTonalidad(fm, "1)");

		int i = 0;
		while(i <= 6){
			
			for (Object o : modo.getFunciones()) {
				
				f = (IFuncion)o;
				
				System.out.println("*"+f.getTonalidad().getEnarmonico() + f.getFuncion().getNomenclatura());
				
				printChord(f);					
			}
			
			System.out.println();

			NotaEnum[] escala = convert(Modo.invercion(f.getEscala()));
				
			modo = new Modo(escala);
			
			printTonalidad((IFuncion)modo.getFunciones()[2], String.valueOf(++i+1 + ")"));

		}
	}

	public static void printChord(IFuncion f) {
		Guitar guitar = new Guitar();
		
		guitar.setNotas(f.getEscala(TonoEnum.m, 3));

		guitar.add(GuitarPositionEnum.posicion1);
//		guitar.add(PositionEnum.posicion7);
//		guitar.add(PositionEnum.posicion3);
//		guitar.add(PositionEnum.posicion4);
//		guitar.add(PositionEnum.posicion5);
//		guitar.add(PositionEnum.posicion6);
//		guitar.add(PositionEnum.posicion7);
		
		Iterator<GuitarPosition> iterGuitar = guitar.iterator();
		
		while (iterGuitar.hasNext()) {
			
			GuitarPosition posicion = (GuitarPosition) iterGuitar.next();
			System.out.println(posicion.getPosicion());
			getEscala(f);
			getArpegio(f);
			System.out.println(guitar.toString(posicion));
		}
	}
	
	private static void getArpegio(IFuncion f) {
		
		StringBuffer sb = new StringBuffer();
		
		for (NotaEnum nota: f.getEscala(TonoEnum.m, 3 )) {
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

	public static void printTonalidad(IFuncion fm, String ordinal) {
		System.out.println("------------");
		System.out.println(ordinal + " " +fm.getTonalidad().getEnarmonico()+fm.getFuncion().getNomenclatura());
		System.out.println("------------");
	}

	private static NotaEnum[] convert(Object[] invercion) {
		
		NotaEnum[] out = new NotaEnum[invercion.length];
		
		int i=0;
		for (Object object : invercion) {
			out[i++] = (NotaEnum)object;
		}
		
		return out;
	}

}
