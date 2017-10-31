package manchicle.armony.guitar;

import java.util.ArrayList;
import java.util.List;


public class GuitarPosition {
	
	private GuitarPositionEnum posicion; 

	private GuitarTo diapasonArpegio = new GuitarTo();
	
	private List<GuitarTo> diapasonAcordes = new ArrayList<GuitarTo>();
	
	public void setDiapasonAcordes(GuitarTo diapasonAcorde) {
		
		this.diapasonAcordes.add(diapasonAcorde);
	}
	
	public List<GuitarTo> getDiapasonAcordes() {
		return diapasonAcordes;
	}
	
	public GuitarPosition() {
	}

	public GuitarTo getGuitarTo() {
		return diapasonArpegio;
	}

	public void setDiapasonArpegio(GuitarTo guitarTo) {
		this.diapasonArpegio = guitarTo;
	}
	
	public GuitarPositionEnum getPosicion() {
		return posicion;
	}
	
	public void setPosicion(GuitarPositionEnum posicion) {
		this.posicion = posicion;
	}

}
