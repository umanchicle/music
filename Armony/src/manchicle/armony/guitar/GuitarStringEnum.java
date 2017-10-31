package manchicle.armony.guitar;

public enum GuitarStringEnum {
	sexta("6")
	, quinta("5")
	,cuarta("4")
	, tercera("3")
	, segunda("2")
	,primera("1");
	
	protected String string;
	
	private GuitarStringEnum(String string) {
		this.string = string;
	}
	
}
