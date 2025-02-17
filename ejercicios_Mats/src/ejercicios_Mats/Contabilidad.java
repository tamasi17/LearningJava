package ejercicios_Mats;

public class Contabilidad {

	public static void main(String[] args) {
		/*
		 * Se inicia un array con 20 numeros enteros (para pruebas, por teclado)
		 * Hay que indicar cual es 0, positivo o negativo
		 * 
		 * Probar a usar metodos de otras clases
		 * 
		 *
		 * 
		 */
		
		
		int[] contabilidad = new int[20]; // array original
		
		// arrays para guardar los resultados
		
		int[] positivo = new int[20]; 
		int cantPositivos=0;
		int[] negativo = new int[20];
		int cantNegativos=0;
		int[] cero = new int[20];
		int cantCeros=0;
		
		MetodosArray.introValores(contabilidad);
		
		// primero mostrar valores por pantalla, luego evaluar si son positivos, negativos o cero
		
		System.out.println("Array original: ");
		MetodosArray.muestraValores(contabilidad);
		
		for (int i=0; i<contabilidad.length;i++) {
			
			
			if (MetodosArray.esCero(contabilidad[i])==true) {  // si es cero
				cero[cantCeros]=contabilidad[i];
				cantCeros++;
				
			} else if (MetodosArray.esPositivo(contabilidad[i])==true) { // si es positivo
				positivo[cantPositivos]=contabilidad[i];
				cantPositivos++;
			} else {
				negativo[cantNegativos]=contabilidad[i];
				cantNegativos++;
			}
			
		} // fin for
		
		// mostramos resultados - tiene metodos nuevos porque el valor por defecto es cero y quedaba feo.
		
		System.out.println("\n\n----- Resultados por separado ----- ");
		
		System.out.println("\nPositivos: "); 
		MetodosArray.muestraPositivos(positivo);
		System.out.println("\nTotal: "+ cantPositivos);


		System.out.println("\nNegativos: ");
		MetodosArray.muestraNegativos(negativo);
		System.out.println("\nTotal: "+ cantNegativos);
		

		System.out.println("\nCero: ");
		System.out.println("Total: "+ cantCeros);
		
		
	}

}
