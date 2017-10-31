package manchicle.armony.core;

import java.util.Arrays;


public enum NotaEnum {
	C("C", "C"),
	Csos("C#", "Db"),
	D("D", "D"),
	Dsos("D#", "Eb"),
	E("E", "E"),
	F("F", "F"),
	Fsos("F#", "Gb"),
	G("G", "G"),
	Gsos("G#", "Ab"),
	A("A", "A"),
	Asos("A#", "Bb"),
	B("B", "B");
	
	protected String nota;
	
	protected String enarmonico;
	
	protected int altura;
	
	public String getEnarmonico() {
		return enarmonico;
	}
	
	public NotaEnum[] getOrderByNote(NotaEnum[] notas) {

		NotaEnum aux; 
		
		NotaEnum[] out = notas.clone();
		
		for (int i = 1; i < out.length; i++) {
			
			for (int j = 0; j < out.length - i; j++) {
				
				int o1 = out[j].ordinal() < this.ordinal() ? (NotaEnum.values().length + 1) + out[j].ordinal() : out[j].ordinal() ;
				
				int o2 = out[j+1].ordinal() < this.ordinal() ? (NotaEnum.values().length + 1) + out[j+1].ordinal() : out[j+1].ordinal() ;
				
				if (o1 > o2 ) {
					
					aux = out[j];
					
					out[j] = out[j+1];
					
					out[j+1] = aux;
				}
			}
		}
		return out;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public double getDistancia(NotaEnum value) {
		
		double peso = (value.ordinal() - this.ordinal()) / 2.0;
		
		return peso < 0 ? peso + 6.0 : peso; 
		
	}

	private NotaEnum(String nota, String enarmonico) {
		
		this.nota = nota;
		
		this.enarmonico = enarmonico;
	}
	
	public NotaEnum getIntervalo(TonoEnum value){
		
		int peso = Double.valueOf(value.peso * 2).intValue();
		
		int ordinal = this.ordinal();
		
		int indice = ordinal + peso ;
		
		if (indice > 11) {
			
			indice = indice - 12;
			
		}
		
		return NotaEnum.values()[indice];
	}
	
	
	//TODO: depura obtencion de intervalo , para que intervalo tome notas solamente de la escala 
	public NotaEnum getIntervalo(NotaEnum[] escala, TonoEnum value){

		int peso;
		
		if (value.equals(TonoEnum.M) 
				|| value.equals(TonoEnum.w)
				|| value.equals(TonoEnum.C)
				|| value.equals(TonoEnum.X)
				|| value.equals(TonoEnum.S)
 		) {
			peso = Double.valueOf(value.peso + 0.5).intValue();	
			
		}else{
			peso = Double.valueOf(Math.ceil(value.peso + 0.5)).intValue();
			
		}
		
		int ordinal = searchNota(escala);
		
		int indice = ordinal + peso ;
		
		if (indice > 6) {
			
			indice = indice - 7;
		}
		
		return escala[indice];
	}
	
	private int searchNota(NotaEnum[] escala) {
		
		for (int i = 0; i < escala.length; i++) {
			if (this.name().equals(escala[i].name())) {
				return i;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		NotaEnum[] notas = NotaEnum.B.getOrderByNote(new NotaEnum[]{NotaEnum.B, NotaEnum.D, NotaEnum.F, NotaEnum.A});
		
		for (double d : Escala.getDistancias(notas)) {
			System.out.print(d + " ");
		}

		System.out.println(Arrays.asList(notas));
		
		/**
		 * prueba distancia
		 */
		
		System.out.println(D.ordinal());
		System.out.println(Csos.ordinal());
		
		System.out.println(B.getDistancia(A));
		System.out.println(C.getDistancia(C));
		System.out.println(C.getDistancia(Dsos));
		System.out.println(Dsos.getDistancia(C));

//		NotaEnum[] escala = new NotaEnum[]{NotaEnum.C,NotaEnum.D,
//				NotaEnum.E,NotaEnum.F,NotaEnum.Gsos,NotaEnum.A,NotaEnum.B};

		/**
		 * test escala patron
		 */
			
//		for (int i = 0; i < escala.length; i++) {
//			System.out.println(escala[i].ordinal());
//		}
		
		/**
		 * prueba getIntervalo
		 */
		
		//System.out.println(NotaEnum.C.getIntervalo(escala,TonoEnum.Q));
		
/**
 * 		System.out.println(NotaEnum.Dsos.getIntervalo(TonoEnum.S));
 */
		
		/**
		 * 
		 */
//		System.out.println((NotaEnum.valueOf("Asos")).nota);
//		System.out.println((NotaEnum.valueOf("Asos")).enarmonico);
//		System.out.println((NotaEnum.valueOf("Asos")).ordinal()+1);
	}
}
