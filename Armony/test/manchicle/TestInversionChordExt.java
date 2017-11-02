package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.FuncionEnumExt;
import manchicle.armony.core.FuncionEnumExt2;
import manchicle.armony.core.Function;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.GroupEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPosition;
import manchicle.armony.guitar.GuitarPositionEnum;
import manchicle.armony.guitar.GuitarTo;

public class TestInversionChordExt {
	
	public static void main(String[] args) {
		
		IFuncion f = new Function(new String[]{"", ""}, FuncionEnumExt.FMaj, NotaEnum.C, 21);
		//IFuncion f = new Function(new String[]{"", ""}, FuncionEnumExt.FMin, NotaEnum.C, 25);
		
		NotaEnum[] auxNotas = f.getEscala(TonoEnum.m);
		
		printChords(auxNotas, f );
		
		for (int i = 0; i < auxNotas.length - 1; i++) {
			
			auxNotas = Modo.invercion(auxNotas);
			
			printChords(auxNotas, f);
		}
	}

	public static void printChords(NotaEnum[] notas, IFuncion f) {
		
		Guitar guitar = new Guitar();
		
		guitar.setNotas(notas);
		
		if (f.getFuncion() instanceof FuncionEnumExt) {
			guitar.setRepresentativa(((FuncionEnumExt)f.getFuncion()).getRepresentativa());
			
		}else
			guitar.setRepresentativa(((FuncionEnumExt2)f.getFuncion()).getRepresentativa());
		
		
		guitar.setGrupos(new GroupEnum[]{GroupEnum.Group1, GroupEnum.Group2, GroupEnum.Group3});
		
		guitar.add(GuitarPositionEnum.posicion1);
		guitar.add(GuitarPositionEnum.posicion2);
		guitar.add(GuitarPositionEnum.posicion3);
		guitar.add(GuitarPositionEnum.posicion4);
		guitar.add(GuitarPositionEnum.posicion5);
		guitar.add(GuitarPositionEnum.posicion6);
		guitar.add(GuitarPositionEnum.posicion7);
		
		guitar.setFuncion(f);
		
		Iterator<GuitarPosition> iterGuitar = guitar.iterator();
		
		while (iterGuitar.hasNext()) {
		
			GuitarPosition posicion = (GuitarPosition) iterGuitar.next();
			
			GuitarPosition posChord = new GuitarPosition();
			
			posChord.setPosicion(posicion.getPosicion());
			
			guitar.generateChords(posicion);
			
			for (GuitarTo guitarTo : posicion.getDiapasonAcordes()) {

				System.out.println(posicion.getPosicion());

				System.out.println(guitarTo.getName());
				
				System.out.println(Arrays.asList(guitarTo.getNotas()));
				
				posChord.setDiapasonArpegio(guitarTo);
				
				System.out.println(guitar.toString(posChord));
			}
		}
	}

}
