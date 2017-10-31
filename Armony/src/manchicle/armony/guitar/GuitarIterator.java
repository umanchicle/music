package manchicle.armony.guitar;

import java.util.Iterator;

public class GuitarIterator implements Iterator<GuitarPosition>{
	
	private GuitarPosition[] posiciones;
	
	private int location = 0;
	 
	public GuitarIterator(GuitarPosition[] posiciones) {
		
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
	public GuitarPosition next() {

		return this.posiciones[location++];
	}


	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
