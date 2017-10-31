package manchicle.armony.guitar;

import manchicle.armony.core.NotaEnum;
import manchicle.armony.guitar.GuitarSpaceEnum;

public class GuitarPosturaTo {
	
	private NotaEnum note;
	
	private Object string;
	
	private GuitarSpaceEnum espacio;
	
	public GuitarSpaceEnum getEspacio() {
		return espacio;
	}
	
	public void setEspacio(GuitarSpaceEnum espacio) {
		this.espacio = espacio;
	}

	public NotaEnum getNote() {
		return note;
	}

	public void setNote(NotaEnum note) {
		this.note = note;
	}

	public Object getString() {
		return string;
	}

	public void setString(Object string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		
		s.append(note);
		s.append(string);
		
		return s.toString();
	}
}
