package manchicle.armony.bass;

public enum BassStringEnum {
 quinta("5")
	,cuarta("4")
	, tercera("3")
	, segunda("2")
	,primera("1");
	
	protected String string;
	
	private BassStringEnum(String string) {
		this.string = string;
	}
	
}
