package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.FMajor;
import manchicle.armony.core.FMenor;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.GroupEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.GuitarPosition;
import manchicle.armony.guitar.GuitarPositionEnum;
import manchicle.armony.guitar.GuitarTo;

public class TestInversionChord {
	
	public static void main(String[] args) {
		
		IFuncion f = new FMenor(NotaEnum.F);
		
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
		
		guitar.setRepresentativa(f.getFuncion().getRepresentativa());
		
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
