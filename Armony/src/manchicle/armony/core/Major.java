package manchicle.armony.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Major extends Escala{
	
	protected Map<String, String[]> circuloQuintas = new HashMap<>();

	public Major() {
		
		septima = TonoEnum.S;
		
		circuloQuintas.put("C", new String[]{"C", "D","E","F","G","A", "B"});
		circuloQuintas.put("Csos", new String[]{"Csos","Dsos","F","Fsos", "Gsos","Asos","C"});
		circuloQuintas.put("D", new String[]{"D", "E", "Fsos", "G","A","B", "Csos"});
		circuloQuintas.put("Dsos", new String[]{"Dsos","F","G", "Gsos","Asos","C","D"});
		circuloQuintas.put("E", new String[]{"E","Fsos","Gsos","A","B","Csos","Dsos"});
		circuloQuintas.put("F", new String[]{"F","G","A","Asos","C","D","E"});
		circuloQuintas.put("Fsos", new String[]{"Fsos","Gsos","Asos","B","Csos","Dsos","F"});
		circuloQuintas.put("G", new String[]{"G","A","B","C","D","E","Fsos"});
		circuloQuintas.put("Gsos", new String[]{"Gsos","Asos","C","Csos","Dsos","F","G"});
		circuloQuintas.put("A", new String[]{"A","B","Csos","D","E","Fsos","Gsos"});
		circuloQuintas.put("Asos", new String[]{"Asos","C","D","Dsos","F","G","A"});
		circuloQuintas.put("B", new String[]{"B","Csos","Dsos","E","Fsos","Gsos","Asos"});
	}

	protected boolean isNatural(NotaEnum[] escala, String tonalidad) {
		
		String[] escalaFinal = applyAlteraciones(circuloQuintas.get(tonalidad), getAlteraciones(tonalidad));
		
		for (int i = 0; i < escala.length; i++) {

			if (!escala[i].name().equals(escalaFinal[i])) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public Map<String, String[]> getCirculoQuintas() {
				
		return circuloQuintas;
	}
	
	public static void main(String[] args) {
		
		Menor funcion = new Menor();
		
		FuncionEnum tipoFuncion = FuncionEnum.mDism; 
		
		funcion.funcion.add(tipoFuncion);
		
		funcion.alteracionNatural = new String[]{"b5", ""};
		
		System.out.println(tipoFuncion.caption);
		
		for (NotaEnum nota : NotaEnum.values()) {
			
			List<NotaEnum[]> lista = funcion.getEscala(nota, Escala.NATURAL);
			
			for (NotaEnum[] notaEnums : lista) {
				
				for (int i = 0; i < notaEnums.length; i++) {
					
					System.out.print(notaEnums[i].enarmonico + " ");
				}
				System.out.println("\n");
			}
			
		}
		
	}

}
