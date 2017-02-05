package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.ModoSequence;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;

public class testCadencia {
	
	public static void main(String[] args) {
		Cadencia cadencia = new Cadencia();
		
		cadencia.add(new FMenor(NotaEnum.C), ModoSequence.nn1);
		
		Iterator<Modo> iter = cadencia.iterator();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			for (Object o : modo.getFunciones()) {
				
				IFuncion funcion = (IFuncion)o;
				
				Object[] escala = funcion.getEscala(TonoEnum.m);
				
				System.out.println(Arrays.asList(escala));
				
				Object[] i1 = Modo.invercion(escala);
				System.out.println(Arrays.asList(i1));
				
				i1 = Modo.invercion(i1);
				System.out.println(Arrays.asList(i1));
				
				i1 = Modo.invercion(i1);
				System.out.println(Arrays.asList(i1));
				
				System.out.print("[");
				System.out.print(funcion.getEscala()[0].getEnarmonico() + funcion.getFuncion().getNomenclatura());
				System.out.print("] ");

				for (NotaEnum nota : funcion.getEscala()) {
					System.out.print(nota.getEnarmonico()+" ");
				}
				System.out.println("\n");
			}
		}
	}
}
