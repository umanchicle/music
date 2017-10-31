package manchicle.armony.bass;

import manchicle.armony.core.NotaEnum;

public class BassPosturaTo {
	
	private NotaEnum note;
	
	private Object string;
	
	private BassSpaceEnum espacio;
	
	public BassSpaceEnum getEspacio() {
		return espacio;
	}
	
	public void setEspacio(BassSpaceEnum espacio) {
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
