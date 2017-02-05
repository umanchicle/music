package manchicle.armony.core;

public enum ModoSequence {
	
	nn1(new int[]{2,5,1}),
	nn2(new int[]{4,5,1}),
	nn3(new int[]{6,2,5,1}),
	nn4(new int[]{6,4,5,1});

	protected int[] sequence;
	
	private ModoSequence(int[] s) {
		
		this.sequence = s;
	}
	
	public int[] getSequence() {
		return sequence;
	}
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		
		for (int i = 0; i < sequence.length; i++) {
			s.append(sequence[i]);
		}
		
		return s.toString();
		
	}
	
}
