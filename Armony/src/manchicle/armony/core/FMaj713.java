package manchicle.armony.core;

import java.util.List;

public class FMaj713 extends Major implements IFuncion {

	private FMaj713() {

		//TODO pendiente de analisis para obtener escala natural
		alteracionNatural = new String[]{"", ""};
		
		funcion.add(FuncionEnum.maj713);
	}
	
	public FMaj713(NotaEnum tonalidad) {

		this();
		
		setEscalas(tonalidad);
		
	}
	
	public FMaj713(NotaEnum tonalidad, int type) {

		this();
		
		setEscalas(tonalidad, type);
		
	}
	
	public static void main(String[] args) {
		
		FMaj713 f = new FMaj713(NotaEnum.C);
		
		List<NotaEnum[]> listaNotas = f.getEscalas();
		
		System.out.println(listaNotas.get(0)[0].nota+f.getFuncion().nomenclatura);

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
