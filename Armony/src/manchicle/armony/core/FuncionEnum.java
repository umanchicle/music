package manchicle.armony.core;

public enum FuncionEnum {
	
	//TODO: revisar necesidad de cambiar las funciones con 6 o 11, ya que pueden repetirse acordes
	//TODO: 
	aug("+++", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.M}, "aug", 358)
	, maug("++-", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.m}, "maug7", 350)
	, major("+-+", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.M}, "maj7", 300)
	, maj7m("+--", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.m}, "7", 307)
	, dism("---", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.m}, "o7", 357)
	, mDism("--+", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.M}, "-7(b5)", 350)
	, menor("-+-", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.m}, "-7", 300)
	, menor7M("-++", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.M}, "-(+7)", 307)
	
	, maj7Sos5sus4("A--", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.m}, "maj7(sus4)#5", 450)
	, menM7sos5("-A-", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.m}, "-(+7)#5", 357)
	, menM7b5("--A", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.c}, "-(+7)b5", 357)

	, majMen7sus2b5("D++", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.M}, "7(sus2)b5", 257)
	, majMen7b5("+D+", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.M}, "7(b5)", 357)
	, majMen7sos5("++D", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.w}, "7(#5)", 357)

	, maj6sus2b5("D+-", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.m}, "6(sus2)b5", 250)
	, maj6b5("+D-", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.m}, "6(b5)", 350)
	, maj6("+-D", new TonoEnum[]{TonoEnum.M, TonoEnum.m, TonoEnum.w}, "6", 300)
	
	, maj611sus2("D-+", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.M}, "6(sus2)11", 240)
	, m611("-D+", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.M}, "-6(11)", 340)
	, m6("-+D", new TonoEnum[]{TonoEnum.m, TonoEnum.M, TonoEnum.w}, "-6", 300)
	
	, majMen7sus4("AD-", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.m}, "7sus4", 407)
	, majMen7sus2("DA-", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.m}, "7sus2", 207)
	, majMen7sus211("D-A", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.c}, "7(sus2)11", 247)
	
	, majMen7sus4Sos5("A-D", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.w}, "7(sus4)#5", 457)
	, men7Sos5("-AD", new TonoEnum[]{TonoEnum.m, TonoEnum.c, TonoEnum.w}, "-7(#5)", 350)
	, men711("-DA", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.c}, "-7(11)", 340)
	
	, maj7sus4("AD+", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.M}, "maj7(sus4)", 400) 
	, maj7sus2("DA+", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.M}, "maj7(sus2)", 200)
	, maj7sus2b5("D+A", new TonoEnum[]{TonoEnum.w, TonoEnum.M, TonoEnum.c}, "maj7(sus2)b5", 250)     

	, maj713sus4("A+D", new TonoEnum[]{TonoEnum.c, TonoEnum.M, TonoEnum.w}, "maj7(sus4)13", 460) 
	, maj713("+AD", new TonoEnum[]{TonoEnum.M, TonoEnum.c, TonoEnum.w}, "maj7(13)", 300)
	, maj7b5("+DA", new TonoEnum[]{TonoEnum.M, TonoEnum.w, TonoEnum.c}, "maj7(b5)", 350)    
	
	//TODO: completar lista de Funciones agregar clases Fx.java
	, maj6sus2("DAD", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.w}, "6(sus2)", 200)
	, maj6sus4("ADD", new TonoEnum[]{TonoEnum.c, TonoEnum.w, TonoEnum.w}, "6(sus4)", 400)
	, maj69("DDA", new TonoEnum[]{TonoEnum.w, TonoEnum.w, TonoEnum.c}, "6(9)", 309)
	
	, men11sus2b13("D--", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.m}, "-11(sus2)b13", 240)
	, men11b13("-D-", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.m}, "-11(b13)", 340)
	, menb5b13("--D", new TonoEnum[]{TonoEnum.m, TonoEnum.m, TonoEnum.w}, "-(b5,b13)", 356)

	, maj611("+h+", new TonoEnum[]{TonoEnum.M, TonoEnum.h, TonoEnum.M}, "6(11)", 340)
	
	, menM711("-DC", new TonoEnum[]{TonoEnum.m, TonoEnum.w, TonoEnum.C}, "-(+7)11", 347)
	, maj7sus2Sos5("DC-", new TonoEnum[]{TonoEnum.w, TonoEnum.C, TonoEnum.m}, "maj7(sus2)#5", 257)
	, maj7susSos413("C-D", new TonoEnum[]{TonoEnum.C, TonoEnum.m, TonoEnum.w}, "maj7(sus#4)13", 460)

	, menM713("-CD", new TonoEnum[]{TonoEnum.m, TonoEnum.C, TonoEnum.w}, "-(+7)13", 367)
	, maj7susSos4Sos5("CD-", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.m}, "maj7(sus#4)#5", 457)
	, maj79sus4("D-C", new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.C}, "maj79(sus4)", 240)

	, majsus4Sos5("A-+", new TonoEnum[]{TonoEnum.c, TonoEnum.m, TonoEnum.M}, "maj(sus4)#5", 450)
	;
	
	protected String caption;
	protected TonoEnum[] tonos;
	protected String nomenclatura;
	protected int representativa; 
	
	public int getRepresentativa() {
		return representativa;
	}
	
	public String getNomenclatura() {
		return nomenclatura;
	}
	
	private FuncionEnum(String value, TonoEnum[] tono, String name, int representativa) {
		
		this.caption = value;
		
		this.tonos = tono;
		
		this.nomenclatura = name;
		
		this.representativa = representativa;
	}
	
	public boolean isFunction(TonoEnum[] tonos) {

		boolean out = true;
		
		for (int i = 0; i < tonos.length; i++) {
			if (!this.tonos[i].equals(tonos[i])){
				out = false;
			}
		}
		
		return out;
	}

	public static boolean isFunction(FuncionEnum function, TonoEnum[] tonos) {

		boolean out = true;
		
		for (int i = 0; i < tonos.length; i++) {
			if (!function.tonos[i].equals(tonos[i])){
				out = false;
			}
		}
		
		return out;
	}

	public static FuncionEnum getFunction(TonoEnum[] tonos) {

		boolean out = true;
		
		FuncionEnum outFuncion;
		
		int j = 0;
		while (j < FuncionEnum.values().length) {
			out = true;
			outFuncion = FuncionEnum.values()[j]; 
			
			for (int i = 0; i < tonos.length; i++) {
					
				if (tonos[i] != null) {
				
					if (!outFuncion.tonos[i].equals(tonos[i]) ){
						out = false;
					}
					
				}else {
					if (String.valueOf(outFuncion.getRepresentativa()).split("")[i].equals("0") )
						continue;
					else out = false;
				}
				
			}
			
			if (out) return outFuncion;
			
			j++;
		}
		
		return null;
	}

	
	public static void main(String[] args) {

		TonoEnum[] tonos = new TonoEnum[]{TonoEnum.w, TonoEnum.m, TonoEnum.C};
		
		/*
		 * Test getFuncion
		 */
		
		System.out.println(FuncionEnum.getFunction(tonos).name());
		

		/**
		 * dado  3 tonos obtener funcion que corresponde
		 */
		
		
//		for (int i = 0; i < FuncionEnum.values().length; i++) {
//			
//			if (FuncionEnum.values()[i].isFunction(tonos)) {
//				System.out.println(FuncionEnum.values()[i].name());
//				break;
//			}
//			
//		}
		
		
		/**
		 * evaluacion si es funcion de
		 */
		
		
//		if (FuncionEnum.menor.isFunction(tonos)){
//			System.out.println(true);
//			
//		}else{
//			System.out.println(false);
//			
//		}
		
		/* 30/05/2016
		
		List<TonoEnum> tonos = Arrays.asList(FuncionEnum.major.tonos);
		
		System.out.println(FuncionEnum.major.caption + ":" + tonos );
		
		for (TonoEnum tono : tonos) {
			
			System.out.println(tono.peso + tono.name());
			
		}
		
		FuncionEnum function = FuncionEnum.valueOf("major");
		
		System.out.println(function.caption + function.name());
		
		*/
		
	}



}
