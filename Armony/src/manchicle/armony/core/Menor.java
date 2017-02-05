package manchicle.armony.core;

import java.util.HashMap;
import java.util.Map;

public class Menor extends Escala {
	
	protected Map<String, String[]> circuloQuintas = new HashMap<>();

	public Menor() {
		
		septima = TonoEnum.s;
		
		circuloQuintas.put("C", new String[]{"C","D","Dsos","F","G","Gsos","Asos"});
		circuloQuintas.put("Csos", new String[]{"Csos","Dsos","E","Fsos","Gsos","A","B"});
		circuloQuintas.put("D", new String[]{"D","E","F","G","A","Asos","C"});
		circuloQuintas.put("Dsos", new String[]{"Dsos","F","Fsos","Gsos","Asos","B","Csos"});
		circuloQuintas.put("E", new String[]{"E","Fsos","G","A","B","C","D"});
		circuloQuintas.put("F", new String[]{"F","G","Gsos","Asos","C","Csos","Dsos"});
		circuloQuintas.put("Fsos", new String[]{"Fsos","Gsos","A","B","Csos","D","E" });
		circuloQuintas.put("G", new String[]{"G","A","Asos","C","D","Dsos","F"});
		circuloQuintas.put("Gsos", new String[]{"Gsos","Asos","B","Csos","Dsos","E","Fsos"});
		circuloQuintas.put("A", new String[]{"A","B","C","D","E","F","G"});
		circuloQuintas.put("Asos", new String[]{"Asos", "C","Csos","Dsos","Esos","Fsos","Gsos"});
		circuloQuintas.put("B", new String[]{"B","Csos","D","E","Fsos","G","A"});
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

}
