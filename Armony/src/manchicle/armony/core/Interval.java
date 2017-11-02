package manchicle.armony.core;

public enum Interval {
	primera(1, TonoEnum.O), 
	segundaBemol(2, TonoEnum.h), 
	segunda(2, TonoEnum.w), 
	terceraMenor(3, TonoEnum.m), 
	terceraMayor(3, TonoEnum.M), 
	cuarta(4, TonoEnum.c), 
	cuartaAumentada(4, TonoEnum.C), 
	quinta(5, TonoEnum.Q), 
	sextaBemol(6, TonoEnum.x), 
	sexta(6, TonoEnum.X), 
	septimaMenor(7, TonoEnum.s),
	septimaMayor(7, TonoEnum.S);
	
	protected int indice;
	protected TonoEnum intervalo;
	
	private Interval(int value, TonoEnum value2) {
		this.indice = value;
		this.intervalo = value2;
	}
}
