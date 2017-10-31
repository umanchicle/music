package manchicle.armony.bass;

import java.util.HashMap;
import java.util.Map;

import manchicle.armony.core.NotaEnum;

public class BassTo {
	
	Map<BassSpaceEnum, BassPosturaTo[]> estructura = new HashMap<BassSpaceEnum, BassPosturaTo[]>();
	
	NotaEnum[] notas;
	
	NotaEnum[] orderNotas;
	
	String name;
	
	public void setOrderNotas(NotaEnum[] orderNotas) {
		this.orderNotas = orderNotas;
	}
	
	public NotaEnum[] getOrderNotas() {
		return orderNotas;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<BassSpaceEnum, BassPosturaTo[]> getEstructura() {
		return estructura;
	}
	
	public void addEstructura(BassSpaceEnum espacio, BassPosturaTo[] postura) {
		this.estructura.put(espacio, postura);
	}
	
	public void setNotas(NotaEnum[] chord) {
		this.notas = chord;
	}
	
	public NotaEnum[] getNotas() {
		return notas;
	}

	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();

		for (int i = 0; i < estructura.size(); i++) {
			s.append(estructura.get(i));
		}
		
		return s.toString();
		
	}
	
	public static void main(String[] args) {
		
	}

}
