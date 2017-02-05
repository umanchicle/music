package manchicle;

import java.util.Iterator;

import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.ModoSequence;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.Posicion;
import manchicle.armony.guitar.PositionEnum;

public class TestSequence {
	
	public static void main(String[] args) {
		
		FMenor fm = new FMenor(NotaEnum.C, 9);
		
		Modo modo = new Modo(fm,ModoSequence.nn1);
		
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
				
			modo = new Modo(escala, ModoSequence.nn1);

			printTonalidad((IFuncion)modo.getFunciones()[2], String.valueOf(++i+1 + ")"));

		}
	}

	public static void printChord(IFuncion f) {
		Guitar guitar = new Guitar();
		
		guitar.setNotas(f.getEscala(TonoEnum.m));

		guitar.add(PositionEnum.posicion1);
//		guitar.add(PositionEnum.posicion7);
//		guitar.add(PositionEnum.posicion3);
//		guitar.add(PositionEnum.posicion4);
//		guitar.add(PositionEnum.posicion5);
//		guitar.add(PositionEnum.posicion6);
//		guitar.add(PositionEnum.posicion7);
		
		Iterator<Posicion> iterGuitar = guitar.iterator();
		
		while (iterGuitar.hasNext()) {
			
			Posicion posicion = (Posicion) iterGuitar.next();
			
			System.out.println(posicion.getPosicion());
			
			getEscala(f);
			
			getArpegio(f);
			
			System.out.println(guitar.toString(posicion));
		}
	}
	
	private static void getArpegio(IFuncion f) {
		
		StringBuffer sb = new StringBuffer();
		
		for (NotaEnum nota: f.getEscala(TonoEnum.m )) {
			
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
