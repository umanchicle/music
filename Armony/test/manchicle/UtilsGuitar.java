package manchicle;

import java.util.Arrays;
import java.util.Iterator;

import manchicle.armony.core.IFuncion;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;
import manchicle.armony.guitar.GuitarTo;
import manchicle.armony.guitar.GroupEnum;
import manchicle.armony.guitar.Guitar;
import manchicle.armony.guitar.Posicion;
import manchicle.armony.guitar.PositionEnum;

public final class UtilsGuitar {

	public static NotaEnum[] convertNotas(Object[] invercion) {

		NotaEnum[] out = new NotaEnum[invercion.length];

		for (int i = 0; i < out.length; i++) {

			out[i] = (NotaEnum) invercion[i];
		}

		return out;
	}

	public static void printChords(IFuncion f) {

		Guitar guitar = new Guitar();

		//guitar.setNotas(f.getEscala(intervalTono, maxTonos));
		
		guitar.setNotas(f.getEscala(TonoEnum.Q, 1));

		guitar.setRepresentativa(f.getFuncion().getRepresentativa());

		guitar.setGrupos(new GroupEnum[] { GroupEnum.Group1, GroupEnum.Group2,
				GroupEnum.Group3 });

		guitar.add(PositionEnum.posicion1);

		guitar.setFuncion(f);

		Iterator<Posicion> iterGuitar = guitar.iterator();

		while (iterGuitar.hasNext()) {

			Posicion posicion = (Posicion) iterGuitar.next();

			Posicion posChord = new Posicion();

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
