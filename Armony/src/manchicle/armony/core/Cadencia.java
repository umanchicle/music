package manchicle.armony.core;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;

public class Cadencia {

	private Modo[] modos = new Modo[50];
	
	private int numero = 0;
	
	public Cadencia() {
	}

	public void add(IFuncion funcion){
		
		Modo modo = new Modo(funcion);
		
		modos[numero++] = modo;
		
	}
	
	public void add(IFuncion funcion, ModoSequence sequenceModo){
		
		Modo modo = new Modo(funcion, sequenceModo);
		
		modos[numero++] = modo;
		
	}
	
	public CadenciaIterator iterator(){
		
		return new CadenciaIterator(modos);
	}

	public static void main(String[] args) {
		
		Cadencia cadencia = new Cadencia();
		
		cadencia.add(new FMajor(NotaEnum.C));
//		cadencia.add(new FMaj6(NotaEnum.Csos));
//		cadencia.add(new FMaj6(NotaEnum.D));
//		cadencia.add(new FMaj6(NotaEnum.Dsos));
//		cadencia.add(new FMaj6(NotaEnum.E));
//		cadencia.add(new FMaj6(NotaEnum.F));
//		cadencia.add(new FMaj6(NotaEnum.Fsos));
//		cadencia.add(new FMaj6(NotaEnum.G));
//		cadencia.add(new FMaj6(NotaEnum.Gsos));
//		cadencia.add(new FMaj6(NotaEnum.A));
//		cadencia.add(new FMaj6(NotaEnum.Asos));
//		cadencia.add(new FMaj6(NotaEnum.B));
//		cadencia.add(new FMaj6b5(NotaEnum.C));
//		cadencia.add(new FMaj6b5(NotaEnum.Csos));
//		cadencia.add(new FMaj6b5(NotaEnum.D));
//		cadencia.add(new FMaj6b5(NotaEnum.Dsos));
//		cadencia.add(new FMaj6b5(NotaEnum.E));
//		cadencia.add(new FMaj6b5(NotaEnum.F));
//		cadencia.add(new FMaj6b5(NotaEnum.Fsos));
//		cadencia.add(new FMaj6b5(NotaEnum.G));
//		cadencia.add(new FMaj6b5(NotaEnum.Gsos));
//		cadencia.add(new FMaj6b5(NotaEnum.A));
//		cadencia.add(new FMaj6b5(NotaEnum.Asos));
//		cadencia.add(new FMaj6b5(NotaEnum.B));
//		cadencia.add(new FMajor(NotaEnum.D));
//		cadencia.add(new FMenM7Sos5(NotaEnum.Csos));
//		cadencia.add(new FMenM7Sos5(NotaEnum.D));
//		cadencia.add(new FMenM7Sos5(NotaEnum.Dsos));
//		cadencia.add(new FMenM7Sos5(NotaEnum.E));
//		cadencia.add(new FMenM7Sos5(NotaEnum.F));
//		cadencia.add(new FMenM7Sos5(NotaEnum.Fsos));
//		cadencia.add(new FMenM7Sos5(NotaEnum.G));
//		cadencia.add(new FMenM7Sos5(NotaEnum.Gsos));
//		cadencia.add(new FMenM7Sos5(NotaEnum.A));
//		cadencia.add(new FMenM7Sos5(NotaEnum.Asos));
//		cadencia.add(new FMenM7Sos5(NotaEnum.B));		
		Iterator<Modo> iter = cadencia.iterator();
		
		while (iter.hasNext()) {
		
			Modo modo = (Modo) iter.next();
			
			for (Object o : modo.getFunciones()) {
				
				IFuncion funcion = (IFuncion)o;
				
				
				System.out.print("*");
				
				if (funcion instanceof FDefault ){
					System.out.print("Xxx\t");
					System.out.print(Arrays.asList(funcion.getEscala()));
					double[] distancias = Escala.getDistancias(funcion.getEscala());
					
					System.out.print("\t[");
					System.out.print(distancias[0]+distancias[1]+",");
					System.out.print(distancias[2]+distancias[3]+",");
					System.out.print(distancias[4]+distancias[5]);
					System.out.println("]");
				}
				else{
					System.out.println(funcion.getEscala()[0].nota+funcion.getFuncion().nomenclatura+Arrays.asList(funcion.getEscala()) + funcion.getFuncion().caption );
				}

				
				for (NotaEnum[] escala: funcion.getEscalas()) {
					
//					if (escala[0].name().equals("C")){
						System.out.println(Arrays.asList(escala));
//					}
					
					Modo m = new Modo(escala);
					
					for (Object mf : m.getFunciones()) {
						IFuncion f = (IFuncion)mf;
						
//						if(f.getEscala()[0].name().equals("C")){
							System.out.print("\t");
							if (f instanceof FDefault ){
									System.out.print("Xxx\t");
									System.out.print(Arrays.asList(f.getEscala()));
									double[] distancias = Escala.getDistancias(f.getEscala());
									
									System.out.print("\t[");
									System.out.print(distancias[0]+distancias[1]+",");
									System.out.print(distancias[2]+distancias[3]+",");
									System.out.print(distancias[4]+distancias[5]);
									System.out.println("]");
							}
							else{
								System.out.println(f.getEscala()[0].enarmonico+f.getFuncion().nomenclatura+"\t"+Arrays.asList(f.getEscala()));
							}
//						}						
					}
					
				}
			} 
			
			System.out.println("\n");
		}
	}

	protected static void printFile(IFuncion f, File file) {
		
		
//		try {
//			FileWriter fileWriter = new FileWriter(file);
//			
//			fileWriter.write("Xxx");
//			
//			fileWriter.write(Arrays.asList(f.getEscala()).toArray().toString());
//			
//			fileWriter.flush();
//			
//			fileWriter.close();
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		if(f.getEscala()[0].name().equals("C")){
			System.out.print("Xxx");
			System.out.print(Arrays.asList(f.getEscala()));
			double[] distancias = Escala.getDistancias(f.getEscala());
			
			System.out.print("[");
			System.out.print(distancias[0]+distancias[1]+",");
			System.out.print(distancias[2]+distancias[3]+",");
			System.out.print(distancias[4]+distancias[5]);
			System.out.println("]");
		}
	}
	
}
