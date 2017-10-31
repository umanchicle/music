package manchicle.armony.bass;

import java.util.Iterator;

public class BassIterator implements Iterator<BassPosition>{
	
	private BassPosition[] posiciones;
	
	private int location = 0;
	 
	public BassIterator(BassPosition[] posiciones) {
		
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
	public BassPosition next() {

		return this.posiciones[location++];
	}


	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
