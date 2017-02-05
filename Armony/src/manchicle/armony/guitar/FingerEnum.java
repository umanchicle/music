package manchicle.armony.guitar;

public enum FingerEnum {
	
	indice(1)
	,medio(2)
	,anular(3)
	,menique(4);
	
	protected int finger;
	
	private FingerEnum(int finger) {
		this.finger = finger;
	}
	

}

