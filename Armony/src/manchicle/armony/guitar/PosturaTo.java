package manchicle.armony.guitar;

import manchicle.armony.core.NotaEnum;

public class PosturaTo {
	
	private NotaEnum note;
	
	private StringEnum string;
	
	private EspacioEnum espacio;
	
	public EspacioEnum getEspacio() {
		return espacio;
	}
	
	public void setEspacio(EspacioEnum espacio) {
		this.espacio = espacio;
	}

	public NotaEnum getNote() {
		return note;
	}

	public void setNote(NotaEnum note) {
		this.note = note;
	}

	public StringEnum getString() {
		return string;
	}

	public void setString(StringEnum string) {
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
