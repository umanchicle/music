package manchicle.armony.core;

import java.util.List;

public class Function extends Escala implements IFuncion{
	
	public Function(Object funcionEnum) {
		
		this(new String[]{"", ""}, funcionEnum);
		
	}
	
	public Function(String[] alteraciones, Object funcionEnum) {
		
		this(alteraciones, funcionEnum, NotaEnum.C);
		
		
	}

	public Function(Object funcionEnum, NotaEnum tonalidad) {
		
		this(new String[]{"", ""}, funcionEnum, tonalidad);
		
	}
	
	public Function(String[] alteraciones, Object funcionEnum, NotaEnum tonalidad){

		alteracionNatural = alteraciones;
		
		funcion.add(funcionEnum);

		setEscalas(tonalidad);
	}
	
	public Function(String[] alteraciones, Object funcionEnum, NotaEnum tonalidad, int type){
		
		alteracionNatural = alteraciones;
		
		funcion.add(funcionEnum);

		setEscalas(tonalidad, type);
	}

	@Override
	public Object getFuncion() {
		
		return funcion.getFuncionType();
	}

	@Override
	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		return true;
	}
	
	public static void main(String[] args) {
		Function f = new Function(new String[]{"", ""}, FuncionEnumExt.Fmaj7, NotaEnum.C);
		
		List<NotaEnum[]> listaNotas = f.getEscalas();
		
		System.out.println(listaNotas.get(0)[0].nota+((FuncionEnumExt)f.getFuncion()).nomenclatura);

		int x = 0;
		
		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i].enarmonico + " ");
				
				//System.out.print(notaEnums[i].getIntervalo(notaEnums, TonoEnum.m) + "\n");
			}
			
			System.out.println("");
			
			x+=1;
		}
		
		System.out.println(x);
	}

}
