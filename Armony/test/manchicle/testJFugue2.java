package manchicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.jfugue.player.Player;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
import org.jfugue.theory.Note;

import manchicle.armony.core.Cadencia;
import manchicle.armony.core.F7;
import manchicle.armony.core.FDisminuida;
import manchicle.armony.core.FMaj6;
import manchicle.armony.core.FMajor;
import manchicle.armony.core.FMen11b13;
import manchicle.armony.core.IFuncion;
import manchicle.armony.core.Modo;
import manchicle.armony.core.NotaEnum;
import manchicle.armony.core.TonoEnum;

public class testJFugue2 {

	public static void main(String[] args) {
		Player player = new Player();
		
		Cadencia cadencia = new Cadencia();
		
		cadencia.add(new FMajor(NotaEnum.C));
		
		Iterator<Modo> iter = cadencia.iterator();
		
		ArrayList<String> a = new ArrayList<>();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			for (Object o : modo.getFunciones()) {

				IFuncion funcion = (IFuncion)o;
				
				Object[] escala = funcion.getEscala();
				
				String auxEscala = "";
				
				System.out.println(Arrays.asList(escala));
				
				for (int i = 0; i < escala.length; i++) {
					auxEscala = auxEscala + ((NotaEnum)escala[i]).name() + "5w | ";
					
					
				}

				a.add(auxEscala + ((NotaEnum)escala[0]).getEnarmonico()+ "6w ");
			}
			
			player.play("T[Vivace] I[Rock_Organ] Db4minH C5majW C4maj^^");

			Chord[] chords = new ChordProgression("I IV V II").setKey("Cmaj").getChords();

					for (Chord chord : chords) {
					   Note[] n = chord.getNotes();
					   
					   System.out.println(Arrays.asList(n));
					}
					
					
			
			//				System.out.println("T1 V0 L[Flute] " + string);
//				player.play("T280 V0 I[Flute] " + string );
//				
//			}

			//player.play("Dbw");

		}
	}
}
