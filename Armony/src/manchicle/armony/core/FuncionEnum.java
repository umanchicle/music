package manchicle.armony.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public enum FuncionEnum {
	
	//TODO: revisar necesidad de cambiar las funciones con 6 o 11, ya que pueden repetirse acordes
	//TODO: 
	aug("+++", new TonoEnum[]{TonoEnum.M, TonoEnum.M, TonoEnum.M}, "aug7", 358)
	
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
	, maj7sus2("DA+", new TonoEnum[]{TonoEnum.w, TonoEnum.c, TonoEnum.M}, "maj7(sus2)", 300)
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
	
	, majsusSos4b13("Chh", new TonoEnum[]{TonoEnum.C, TonoEnum.h, TonoEnum.h}, "maj(sus#4)b13", 460)
	
	, majMen7susSos4Sos5("Cww", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.w}, "7(sus#4)#5", 457)
	
	, majMen7sus413("Cww", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.w}, "7(sus#4)#5", 457)
	
	//, FncSus1113()
	
	, menMaj7sos5("Cww", new TonoEnum[]{TonoEnum.C, TonoEnum.w, TonoEnum.w}, "7(sus#4)#5", 457)
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
	
	//TODO refactorizar y revisar toda las posibilidades
	public static String getName(ArrayList<NotaEnum> values) {
		
		StringBuffer name = new StringBuffer("C");
		
		NotaEnum auxNota;
			
			if ((auxNota = evaluateTercera(values) )!= null) { 
				
				name.append(auxNota.tono.name);
				
				if ((auxNota = evaluateSeptima(values)) != null) {
					
					name.append(auxNota.tono.name);
					
					if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateQuinta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
						} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
							
							name.append("(add");
							
							name.append(auxNota.tono.name2);
							
							name.append(")");
							
						} 
					}
				}else if ( (auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null   || 	(auxNota = evaluateSexta(values)) != null)  {
					
					name.append(auxNota.tono.name);
					
					if ((auxNota = evaluateQuinta(values)) != null) {
						
						name.append(auxNota.tono.name);
						
					} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
						
						name.append("(add");
						
						name.append(auxNota.tono.name2);
						
						name.append(")");
						
					} 
					
				}else if ((auxNota = evaluateQuinta(values)) != null) {
					
					name.append(auxNota.tono.name);
					
				} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
					
					name.append("(add");
					
					name.append(auxNota.tono.name2);
					
					name.append(")");
					
				} 
				
			}else{
				if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null) {
					
					name.append("(sus");
					
					name.append(auxNota.tono.name);
					
					name.append(")");
					
					if ((auxNota = evaluateSeptima(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
							}
						}
					}else if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
								
							} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
								
								name.append("(add");
								
								name.append(auxNota.tono.name2);
								
								name.append(")");
								
							} 
						}	
				
				}else{
					name.append("(ommit3)");
					
					if ((auxNota = evaluateSeptima(values)) != null) {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateSegunda(values)) != null || (auxNota = evaluateCuarta(values)) != null  || (auxNota = evaluateSexta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
							if ((auxNota = evaluateQuinta(values)) != null) {
								
								name.append(auxNota.tono.name);
								
							} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
								
								name.append("(add");
								
								name.append(auxNota.tono.name2);
								
								name.append(")");
								
							} 
						}
								
					}else if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
						
						name.append(auxNota.tono.name);
						
						if ((auxNota = evaluateQuinta(values)) != null) {
							
							name.append(auxNota.tono.name);
							
						} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
							
							name.append("(add");
							
							name.append(auxNota.tono.name2);
							
							name.append(")");
							
						} 
					}	
				}
			}
			
			if (values.isEmpty()) return name.toString();
				
			
			if ( (auxNota = evaluateSegunda(values)) != null || 	(auxNota = evaluateCuarta(values)) != null   || (auxNota = evaluateSexta(values)) != null)  {
				
				name.append(auxNota.tono.name);
				
				if ((auxNota = evaluateQuinta(values)) != null) {
					
					name.append(auxNota.tono.name);
					
				} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
					
					name.append("(add");
					
					name.append(auxNota.tono.name2);
					
					name.append(")");
					
				}
			}else if ((auxNota = evaluateQuinta(values)) != null) {
				
				name.append(auxNota.tono.name);
				
			} else if ( (auxNota = evaluateTercera(values)) != null || 	(auxNota = evaluateSeptima(values)) != null || (auxNota = evaluateSegunda(values)) != null) {
				
				name.append("(add");
				
				name.append(auxNota.tono.name2);
				
				name.append(")");
				
			} 
		
		return name.toString();
			
	}
	
	private static NotaEnum evaluateQuinta(Collection<NotaEnum> values) {
		
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.G) ){
				values.remove(NotaEnum.G);
				out = NotaEnum.G;
		}
		
		return out;
	}
	
	private static NotaEnum evaluateTercera(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Dsos) ||  values.contains(NotaEnum.E) ){
			if (values.contains(NotaEnum.Dsos)) {
				values.remove(NotaEnum.Dsos);
				out =  NotaEnum.Dsos;
			}else {
				values.remove(NotaEnum.E);
				out = NotaEnum.E;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateSegunda(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Csos) ||  values.contains(NotaEnum.D) ){
			if (values.contains(NotaEnum.Csos)) {
				values.remove(NotaEnum.Csos);
				out =   NotaEnum.Csos;
			}else {
				values.remove(NotaEnum.D);
				out =  NotaEnum.D;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateCuarta(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.F) ||  values.contains(NotaEnum.Fsos) ){
			if (values.contains(NotaEnum.F)) {
				values.remove(NotaEnum.F);
				out =  NotaEnum.F;
			}else {
				values.remove(NotaEnum.Fsos);
				out = NotaEnum.Fsos;
			}
		}
		
		return out;
	}
	
	private static NotaEnum evaluateSeptima(Collection<NotaEnum> values) {
		
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Asos) ||  values.contains(NotaEnum.B) ){
			if (values.contains(NotaEnum.Asos)) {
				values.remove(NotaEnum.Asos);
				out =  NotaEnum.Asos;
			}else {
				values.remove(NotaEnum.B);
				out = NotaEnum.B;
			}
		}
		
		return out;
	}
	
	
	
	private static NotaEnum evaluateSexta(Collection<NotaEnum> values) {
		NotaEnum out = null;
		
		if ( values.contains(NotaEnum.Gsos) ||  values.contains(NotaEnum.A) ){
			if (values.contains(NotaEnum.Gsos)) {
				values.remove(NotaEnum.Gsos);
				out =   NotaEnum.Gsos;
			}else{
				values.remove(NotaEnum.A);
				out =  NotaEnum.A;
			}
		}
		
		return out;
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
		
		ArrayList<NotaEnum> notas = new ArrayList<NotaEnum>();
		
		notas.add(NotaEnum.C);
		notas.add(NotaEnum.Asos);
	notas.add(NotaEnum.E);
		notas.add(NotaEnum.B);
		
		System.out.println(Arrays.asList(notas) + FuncionEnum.getName(notas));
		
		
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
			
			obtainName()
			
			System.out.println(tono.peso + tono.name());
			
		}
		
		FuncionEnum function = FuncionEnum.valueOf("major");
		
		System.out.println(function.caption + function.name());
		
		*/
		
	}



}
