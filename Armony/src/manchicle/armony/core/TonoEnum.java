package manchicle.armony.core;

public enum TonoEnum {

	h("h", 0.5), 
	w("w", 1.0), 
	m("-3", 1.5), 
	M("+3", 2.0), 
	c("4-", 2.5), 
	C("4+", 3.0), 
	Q("5", 3.5),
	x("6-", 4.0),
	X("6+", 4.5),
	s("7-", 5.0), 
	S("7+", 5.5),
	O("8", 0.0);
	
	protected String tono;
	protected Double peso;
	
	private TonoEnum(String tono, Double value) {
			
		this.tono = tono;
		this.peso = value;
		
	}
	
	public static TonoEnum getTono(double peso) {
		
		TonoEnum tono = null;

		int i= 0;
		while (i < TonoEnum.values().length) {
			
			if(TonoEnum.values()[i].peso == peso){
				tono =  TonoEnum.values()[i];
				break;
			}
			i++;
		}
		
		return tono;

	}
	
	public static TonoEnum getByName(String value) {
		
		return TonoEnum.valueOf(value);
	}
	
	public static void main(String[] args) {
		
		TonoEnum tono = TonoEnum.valueOf("w");
		
		System.out.println(tono.name());
		
		//--------test getTono
		
			//System.out.println(TonoEnum.getTono(0) == null ? null : TonoEnum.getTono(0).name());
		
		
		
//		System.out.println(TonoEnum.h.name());
//		System.out.println(TonoEnum.h.peso + "\n-------------------" + "\n");
//		
//		for (TonoEnum tono : TonoEnum.values()) {
//			System.out.println(tono.ordinal() + "="+tono.name());
//		}
//		
//		TonoEnum tono = TonoEnum.valueOf("h");
//		
//		
//		
//		System.out.println(tono.name());
		
		
	}
}
