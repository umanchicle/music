package manchicle.armony.core;


public class Modo {
	
	private Object[] funciones;
	
	private static Object functionType;
	
	
	public Modo(IFuncion funcion, ModoSequence sm) {

		this(funcion.getEscala(), sm);
	}

	public Modo(NotaEnum[] notas, ModoSequence sm) {

		funciones = new Object[sm.sequence.length];

		NotaEnum[] escala = notas;
		
		Object[] currentEscala = null; 
		
		int k=0;
		
		for (int i : sm.sequence) {
			
			currentEscala = escala;
			
			for (int j = 0; j < i - 1; j++) {
				currentEscala = invercion(currentEscala);
			}
			
			funciones[k++] = getFuncion(currentEscala);
		}
	}

	public Modo(IFuncion funcion) {
		
		funciones = new Object[7];
		
		funciones[0] = funcion;
		
		if (funcion instanceof Function) {
			setFunctionType(((Function)funcion).getFuncion());
		}
		modulador(funcion);	
	}

	public Modo(NotaEnum[] escala) {
		
		funciones = new Object[7];
		
		IFuncion funcion = getFuncion(escala); 
				
		funciones[0] = funcion; 
		
		if (funcion instanceof Function) {
			setFunctionType(((Function)funcion).getFuncion());
		}
		
		modulador(funcion);
	}

	public Object[] getFunciones() {
		
		return funciones;
	}
	
	private void modulador(IFuncion funcion) {
		
		Object[] currentEscala = new NotaEnum[funciones.length]; 
		
		int i = 1;
		
		NotaEnum[] escala = funcion.getEscala();
		
		currentEscala = invercion(escala);
		
		while(i < currentEscala.length){
			
			funciones[i] = getFuncion(currentEscala);
			
			currentEscala = invercion(currentEscala);
			
			i++;
		}
	}

	public static IFuncion getFuncion(Object[] notas) {
		
		double[] distancias = Escala.getDistancias(notas);

		Object funcionEnum;
		
		
		if(notas.length == 7){
			
			if (getFunctionType() instanceof FuncionEnum) {
				funcionEnum = FuncionEnum.getFunction(new TonoEnum[]{
						TonoEnum.getTono(distancias[0] + distancias[1]),
						TonoEnum.getTono(distancias[2] + distancias[3]),
						TonoEnum.getTono(distancias[4] + distancias[5])
					});
				
			}else if (getFunctionType() instanceof FuncionEnumExt) {
				funcionEnum = FuncionEnumExt.getFunction(new TonoEnum[]{
						TonoEnum.getTono(distancias[0] + distancias[1]),
						TonoEnum.getTono(distancias[2] + distancias[3]),
						TonoEnum.getTono(distancias[4] + distancias[5])
					});
				
				if (funcionEnum == null) {
					funcionEnum = FuncionEnumExt2.getFunction(new TonoEnum[]{
							TonoEnum.getTono(distancias[0] + distancias[1]),
							TonoEnum.getTono(distancias[2] + distancias[3]),
							TonoEnum.getTono(distancias[4] + distancias[5])
						});
					
				}
				
			}else{
				funcionEnum = FuncionEnumExt2.getFunction(new TonoEnum[]{
						TonoEnum.getTono(distancias[0] + distancias[1]),
						TonoEnum.getTono(distancias[2] + distancias[3]),
						TonoEnum.getTono(distancias[4] + distancias[5])
					});
				if (funcionEnum == null) {
					funcionEnum = FuncionEnumExt.getFunction(new TonoEnum[]{
							TonoEnum.getTono(distancias[0] + distancias[1]),
							TonoEnum.getTono(distancias[2] + distancias[3]),
							TonoEnum.getTono(distancias[4] + distancias[5])
						});
					
				}
				
				
			}

		
		
		}else if(notas.length == 4) {
			
				TonoEnum[] tonos = new TonoEnum[]{
						TonoEnum.getTono(distancias[0]),
						TonoEnum.getTono(distancias[1]),
						TonoEnum.getTono(distancias[2])};
			
			funcionEnum = FuncionEnumExt.getFunction(tonos);
			
			if (funcionEnum == null) {
				funcionEnum = FuncionEnumExt2.getFunction(tonos);	
			} 
			
		}else return null;
		
		return obtainFuncion(funcionEnum, getNotas(notas));
	}

	private static TonoEnum[] shiftNulls(TonoEnum[] tonos) {

		TonoEnum[] out = new TonoEnum[] { null, null, null };

		int j = 0;
		
		for (int i = 0; i < tonos.length; i++) {
			
			if (tonos[i] != null) {
				
				out[j++] = tonos[i];
			}
		}
		
		if (out.equals(new TonoEnum[] { TonoEnum.M, TonoEnum.h, null })) {
			
			System.out.println();
		}

		return out;
	}
	
	public static NotaEnum[] getNotas(Object[] escala) {
		
		NotaEnum[] notas = new NotaEnum[escala.length];
		
		for (int i = 0; i < escala.length; i++) {
			
			notas[i] = (NotaEnum)escala[i];
		}
		
		return notas;
	}
	
	public static IFuncion obtainFuncion(Object funcionEnum, NotaEnum[] escala) {
		
		NotaEnum tonalidad = escala[0];
		
		IFuncion funcion = new Function(new String[]{"", ""}, funcionEnum, tonalidad);
		
		funcion.setType(escala);
		
		return funcion;
	}

	public static IFuncion obtainFuncion(FuncionEnum funcionEnum, NotaEnum[] escala) {
		
		IFuncion funcion = null;
		
		NotaEnum tonalidad = escala[0];
		
		if (funcionEnum == null) return new FDefault(tonalidad, escala);
		
		switch (funcionEnum.caption) {
		
		case "+++":
			funcion = new FAumentada(tonalidad);
			
			((FAumentada)funcion).setType(escala);
			
			break;
			
		case "++-":
			funcion = new FMedAumentada(tonalidad);
			((FMedAumentada)funcion).setType(escala);
			
			break;
			
		case "+-+":
			funcion = new FMajor(tonalidad);
			((FMajor)funcion).setType(escala);
			
			break;
		case "+--":
			funcion = new F7(tonalidad);
			((F7)funcion).setType(escala);
			
			break;
		case "---":
			funcion = new FDisminuida(tonalidad);
			((FDisminuida)funcion).setType(escala);
			
			break;
		case "--+":
			funcion = new FMedDisminuida(tonalidad);
			((FMedDisminuida)funcion).setType(escala);
			
			break;
		case "-+-":
			funcion = new FMenor(tonalidad);
			((FMenor)funcion).setType(escala);
			
			break;
		case "-++":
			funcion = new FMenMaj7(tonalidad);
			((FMenMaj7)funcion).setType(escala);
			
			break;
			
		case "A--":
			
			funcion = new FMaj7Sos5sus4(tonalidad);
			((FMaj7Sos5sus4)funcion).setType(escala);
			
			break;
			
		case "-A-":
			
			funcion = new FMenM7Sos5(tonalidad);
			((FMenM7Sos5)funcion).setType(escala);
			
			break;
			
		case "--A":
			
			funcion = new FMenM7b5(tonalidad);
			((FMenM7b5)funcion).setType(escala);
			
			break;

		case "D++":
			
			funcion = new F7sus2b5(tonalidad);
			((F7sus2b5)funcion).setType(escala);
			
			break;
			
		case "+D+":
			
			funcion = new F7b5(tonalidad);
			((F7b5)funcion).setType(escala);
			
			break;

		case "++D":
			
			funcion = new F7Sos5(tonalidad);
			((F7Sos5)funcion).setType(escala);
			
			break;
			
		case "D+-":
			
			funcion = new FMaj6sus2b5(tonalidad);
			((FMaj6sus2b5)funcion).setType(escala);
			
			break;
		
		case "+D-":
			
			funcion = new FMaj6b5(tonalidad);
			((FMaj6b5)funcion).setType(escala);
			
			break;

		case "+-D":
			
			funcion = new FMaj6(tonalidad);
			((FMaj6)funcion).setType(escala);
			
			break;

		case "D-+":
			
			funcion = new FMaj6sus211(tonalidad);
			((FMaj6sus211)funcion).setType(escala);
			
			break;
			
		case "-D+":
			
			funcion = new FMen611(tonalidad);
			((FMen611)funcion).setType(escala);
			
			break;
			
		case "-+D":
			
			funcion = new FMen6(tonalidad);
			((FMen6)funcion).setType(escala);
			
			break;

		case "AD-":
			
			funcion = new F7sus4(tonalidad);
			((F7sus4)funcion).setType(escala);
			
			break;

		case "DA-":
			
			funcion = new F7sus2(tonalidad);
			((F7sus2)funcion).setType(escala);
			
			break;

		case "D-A":
			
			funcion = new F7sus211(tonalidad);
			((F7sus211)funcion).setType(escala);
			
			break;

		case "A-D":
			
			funcion = new F7sus4Sos5(tonalidad);
			((F7sus4Sos5)funcion).setType(escala);
			
			break;

		case "-AD":
			
			funcion = new FMen7Sos5(tonalidad);
			((FMen7Sos5)funcion).setType(escala);
			
			break;

		case "-DA":
			
			funcion = new FMen711(tonalidad);
			((FMen711)funcion).setType(escala);
			
			break;

		case "AD+":
			
			funcion = new FMaj7sus4(tonalidad);
			((FMaj7sus4)funcion).setType(escala);
			
			break;
			
		case "DA+":
			
			funcion = new FMaj7sus2(tonalidad);
			((FMaj7sus2)funcion).setType(escala);
			
			break;
			
		case "D+A":
			
			funcion = new FMaj7sus2b5(tonalidad);
			((FMaj7sus2b5)funcion).setType(escala);
			
			break;
			
		case "A+D":
			
			funcion = new FMaj713sus4(tonalidad);
			((FMaj713sus4)funcion).setType(escala);
			
			break;
		case "+AD":
			
			funcion = new FMaj713(tonalidad);
			((FMaj713)funcion).setType(escala);
			
			break;
		case "+DA":
			
			funcion = new FMaj7b5(tonalidad);
			((FMaj7b5)funcion).setType(escala);
			
			break;
		case "DAD":
			
			funcion = new FMaj6sus2(tonalidad);
			((FMaj6sus2)funcion).setType(escala);
			
			break;
			
		case "-D-":
			
			funcion = new FMen11b13(tonalidad);
			((FMen11b13)funcion).setType(escala);
			
			break;

		case "--D":
			
			funcion = new FMenb5b13(tonalidad);
			((FMenb5b13)funcion).setType(escala);
			
			break;
			
		case "+h+":
			
			funcion = new FMaj611(tonalidad);
			((FMaj611)funcion).setType(escala);
			
			break;

		case "-DC":
			
			funcion = new FMenM711(tonalidad);
			((FMenM711)funcion).setType(escala);
			
			break;

		case "DC-":
			
			funcion = new FMaj7Sus2Sos5(tonalidad);
			((FMaj7Sus2Sos5)funcion).setType(escala);
			
			break;

		case "C-D":
			
			funcion = new FMaj7susSos413(tonalidad);
			((FMaj7susSos413)funcion).setType(escala);
			
			break;

		case "-CD":
			
			funcion = new FMenM713(tonalidad);
			((FMenM713)funcion).setType(escala);
			
			break;

		case "CD-":
			
			funcion = new FMaj7susSos4Sos5(tonalidad);
			((FMaj7susSos4Sos5)funcion).setType(escala);
			
			break;
			
		case "D-C":
			
			funcion = new FMaj79sus4(tonalidad);
			((FMaj79sus4)funcion).setType(escala);
			
			break;

			
		case "A-+":
			
			funcion = new FMajsus4Sos5(tonalidad);
			((FMajsus4Sos5)funcion).setType(escala);
			
			break;
			
		case "Chh":
			
			funcion = new FMajsusSos4b13(tonalidad);
			((FMajsusSos4b13)funcion).setType(escala);
			
			break;
			
		case "Cww":
			
			funcion = new F7susSos4Sos5(tonalidad);
			((F7susSos4Sos5)funcion).setType(escala);
			
			break;

		default:
			funcion = new FDefault(tonalidad, escala);
			((FDefault)funcion).setType(escala);
			break;
		}
				
		return funcion;
	}

	public static Object[] invercion(Object[] value) {
		
		Object[] aux = new Object[value.length];
		
		aux[value.length-1] = value[0];
		
		for (int i = 1; i < aux.length ; i++) {
			
			aux[i-1] = value[i];
		}
		
		return aux;
	}
	
	public static NotaEnum[] invercion(NotaEnum[] value) {
		
		NotaEnum[] aux = new NotaEnum[value.length];
		
		aux[value.length-1] = value[0];
		
		for (int i = 1; i < aux.length ; i++) {
			
			aux[i-1] = value[i];
		}
		
		return aux;
	}

	public static TonoEnum[] invercion(TonoEnum[] value) {
		
		TonoEnum[] aux = new TonoEnum[value.length];
		
		aux[value.length-1] = value[0];
		
		for (int i = 1; i < aux.length ; i++) {
			
			aux[i-1] = value[i];
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		
//		NotaEnum[] a = new NotaEnum[]{NotaEnum.A, NotaEnum.B};
//		
//		NotaEnum[] b = new NotaEnum[]{NotaEnum.C, NotaEnum.B};
//		
//		boolean r = true;
//		
//		for (int i = 0; i < b.length; i++) {
//			if (!a[i].equals(b[i])){
//				r = false;
//				break ;
//			}
//		}
//		
//		System.out.println(r);
		
		/**
		 * test modulo funcion
		 */
		
		Modo modo = new Modo(new Function(new String[]{"", ""}, FuncionEnumExt.FMaj_1, NotaEnum.C));
		
		for (Object funcion : modo.funciones) {
			
			IFuncion f = (IFuncion)funcion;
			
			System.out.println();
			
			if (f.getFuncion() instanceof FuncionEnumExt) {
				System.out.println( f.getTonalidad() +  ((FuncionEnumExt)f.getFuncion()).nomenclatura);
			}else if (f.getFuncion() instanceof FuncionEnumExt2) {
				System.out.println( f.getTonalidad() +  ((FuncionEnumExt2)f.getFuncion()).nomenclatura);
			}
			
		}
	
		
//		System.out.println(Arrays.asList(Modo.modular(new Integer[]{1,2,3,4})));
//		System.out.println(Arrays.asList(Modo.modular(Modo.modular(new Integer[]{1,2,3,4}))));
//		
		System.out.println();
	}

	public static Object getFunctionType() {
		return functionType;
	}

	public void setFunctionType(Object functionType) {
		this.functionType = functionType;
	}
	
}

