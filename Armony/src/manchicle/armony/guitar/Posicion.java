package manchicle.armony.guitar;

import java.util.ArrayList;
import java.util.List;


public class Posicion {
	
	private PositionEnum posicion; 

	private GuitarTo diapasonArpegio = new GuitarTo();
	
	private List<GuitarTo> diapasonAcordes = new ArrayList<GuitarTo>();
	
	public void setDiapasonAcordes(GuitarTo diapasonAcorde) {
		
		this.diapasonAcordes.add(diapasonAcorde);
	}
	
	public List<GuitarTo> getDiapasonAcordes() {
		return diapasonAcordes;
	}
	
	public Posicion() {
	}

	public GuitarTo getGuitarTo() {
		return diapasonArpegio;
	}

	public void setDiapasonArpegio(GuitarTo guitarTo) {
		this.diapasonArpegio = guitarTo;
	}
	
	public PositionEnum getPosicion() {
		return posicion;
	}
	
	public void setPosicion(PositionEnum posicion) {
		this.posicion = posicion;
	}

}
