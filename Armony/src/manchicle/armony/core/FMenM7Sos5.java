package manchicle.armony.core;

import java.util.List;

public class FMenM7Sos5 extends Menor implements IFuncion {

	private FMenM7Sos5() {

		//TODO pendiente de analisis para obtener escala natural
		alteracionNatural = new String[]{"", ""};
		
		funcion.add(FuncionEnum.menM7sos5);
	}
	
	public FMenM7Sos5(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FMenM7Sos5(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		FMenM7Sos5 f = new FMenM7Sos5(NotaEnum.C);
		
		List<NotaEnum[]> listaNotas = f.getEscalas();

		for (NotaEnum[] notaEnums : listaNotas) {
			
			for (int i = 0; i < notaEnums.length; i++) {
				
				System.out.print(notaEnums[i] + " ");
				
				//System.out.print(notaEnums[i].getIntervalo(notaEnums, TonoEnum.m) + "\n");
			}
			
			System.out.println("");
		}

		
	}

	@Override
	public FuncionEnum getFuncion() {
		// TODO Auto-generated method stub
		return funcion.getFuncionType();
	}
	
	@Override
	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		return true;
	}
	
}
