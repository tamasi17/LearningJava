package otrosPrimeraEvaluacion;

public class CajeroComparadores {

	public static void main(String[] args) {
		// ejemplo de la pizarra
		
		/*

nos devuelven 127.34, 
le hacemos cast
parteEntera = (int) devolucion;  esto le quita decimales

billete500 = parteEntera / 500; dividiendo 127 entre 500 sale 0, la cantidad de billetes de quinientos que hay
parteEntera -= billete500;
billete200 = parteEntera % 200;
y asi sucesivamente y lo mismo con los decimales por el otro lado


		*/
		double devolucion=157.34;
		int pEntera=(int)devolucion;
		double restoDecimal=(devolucion-pEntera)*100;
		int pDecimal= (int) restoDecimal;
		
		System.out.println(pEntera);
		System.out.println(pDecimal);
		
		int b100=0;
		b100=pEntera/100;
		System.out.println("Necesitas " + b100 + " billetes de 100");
		
		//hay que volver a asignar pEntera para seguir haciendo esto
		
		System.out.println(pEntera); //para comprobar
		
		int b50=(pEntera%100)/50; //el resto de la division entre 100 es lo que queda de la parte entera, dividirlo entre 50 da la cantidad de billetes de 50
		System.out.println(b50);
		

		
	
	}

}
