package manchicle.armony.core;

import java.util.Iterator;

public class CadenciaIterator implements Iterator<Modo>{
	
	private Modo[] modos;
	
	private int location = 0;
	 
	public CadenciaIterator(Modo[] modos) {
		
		this.modos = modos;
	}


	@Override
	public boolean hasNext() {
		
		if (location < modos.length && modos[location] != null) {
			
			return true;
			
		} else {
			
			return false;
		}
	}

	@Override
	public Modo next() {

		return this.modos[location++];
	}
}
