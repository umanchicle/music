package manchicle.armony.core;

import java.util.Iterator;

public class FuncionIterator implements Iterator<Patron> {
	
	private Patron[] patron;
	private int location = 0;

	public FuncionIterator(Patron[] p) {
		
		this.patron = p;
		
	}

	@Override
	public Patron next() {
		
		return this.patron[location++];
	}

	@Override
	public boolean hasNext() {
		
		if (location < patron.length && patron[location] != null) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}


}
