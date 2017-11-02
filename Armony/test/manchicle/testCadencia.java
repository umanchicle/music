package manchicle;

import java.util.Iterator;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.FMajor;
import manchicle.armony.core.FuncionEnumExt;
import manchicle.armony.core.FuncionEnumExt2;
import manchicle.armony.core.Function;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;

public class testCadencia {
	
	public static void main(String[] args) {
		Cadencia cadencia = new Cadencia();
		
		cadencia.add(new Function(new String[]{"",""}, FuncionEnumExt.Fmaj7, NotaEnum.C, 10));
		
		Iterator<Modo> iter = cadencia.iterator();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			for (Object o : modo.getFunciones()) {
				
				IFuncion funcion = (IFuncion)o;
				
				Object[] escala = funcion.getEscala(TonoEnum.m);
				
				for (int i = 0; i < escala.length; i++) {
					System.out.print(((NotaEnum)escala[i]).getEnarmonico());
				}
				
				System.out.println();
				
				Object[] i1 = Modo.invercion(escala);
				for (int i = 0; i < i1.length; i++) {
					System.out.print(((NotaEnum)i1[i]).getEnarmonico());
				}
				System.out.println();
				
				i1 = Modo.invercion(i1);
				for (int i = 0; i < i1.length; i++) {
					System.out.print(((NotaEnum)i1[i]).getEnarmonico());
				}
				System.out.println();
				
				i1 = Modo.invercion(i1);
				for (int i = 0; i < i1.length; i++) {
					System.out.print(((NotaEnum)i1[i]).getEnarmonico());
				}
				System.out.println();
				
				System.out.print("[");
				if (funcion.getFuncion() instanceof FuncionEnumExt) {
					System.out.print(funcion.getEscala()[0].getEnarmonico() + ((FuncionEnumExt)funcion.getFuncion()).getNomenclatura());					
				}else {
					System.out.print(funcion.getEscala()[0].getEnarmonico() + ((FuncionEnumExt2)funcion.getFuncion()).getNomenclatura());	
				}

				System.out.print("] ");

				for (NotaEnum nota : funcion.getEscala()) {
					System.out.print(nota.getEnarmonico()+" ");
				}
				System.out.println("\n");
			}
		}
	}
}
