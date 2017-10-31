package manchicle.armony.core;

import java.util.List;

public class F7susSos4Sos5 extends Menor implements IFuncion {

	private F7susSos4Sos5() {

		//TODO pendiente de analisis para obtener escala natural
		alteracionNatural = new String[]{"", ""};
		
		funcion.add(FuncionEnum.majMen7susSos4Sos5);
	}
	
	public F7susSos4Sos5(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public F7susSos4Sos5(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		F7susSos4Sos5 f = new F7susSos4Sos5(NotaEnum.C);
		
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
