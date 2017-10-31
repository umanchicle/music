package manchicle.armony.bass;

import java.util.ArrayList;
import java.util.List;


public class BassPosition {
	
	private BassPositionEnum posicion; 

	private BassTo diapasonArpegio = new BassTo();
	
	private List<BassTo> diapasonAcordes = new ArrayList<BassTo>();
	
	public void setDiapasonAcordes(BassTo diapasonAcorde) {
		
		this.diapasonAcordes.add(diapasonAcorde);
	}
	
	public List<BassTo> getDiapasonAcordes() {
		return diapasonAcordes;
	}
	
	public BassPosition() {
	}

	public BassTo getGuitarTo() {
		return diapasonArpegio;
	}

	public void setDiapasonArpegio(BassTo guitarTo) {
		this.diapasonArpegio = guitarTo;
	}
	
	public BassPositionEnum getPosicion() {
		return posicion;
	}
	
	public void setPosicion(BassPositionEnum posicion) {
		this.posicion = posicion;
	}

}
