package manchicle.armony.guitar;

import java.util.Iterator;

public class GuitarIterator implements Iterator<Posicion>{
	
	private Posicion[] posiciones;
	
	private int location = 0;
	 
	public GuitarIterator(Posicion[] posiciones) {
		
		this.posiciones = posiciones;
	}


	@Override
	public boolean hasNext() {
		
		if (location < posiciones.length && posiciones[location] != null) {
			
			return true;
			
		} else {
			
			return false;
		}
	}

	@Override
	public Posicion next() {

		return this.posiciones[location++];
	}
}
