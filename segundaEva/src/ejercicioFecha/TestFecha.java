package ejercicioFecha;

public class TestFecha {

	public static void main(String[] args) {

//		Crear instancias de Fecha
		
		Fecha fecha1 = new Fecha(1994,12,17);
		Fecha fecha2 = new Fecha(1997,9,17);
		
		System.out.println("La fecha uno es: " + fecha1.toString());
		System.out.println("La fecha dos es: " + fecha2.toString());
		
		
//		Usar gets, sets, toString y equals.
		
		if (fecha1.equals(fecha2)) { //comprobamos si son iguales
			System.out.println("Las fechas son iguales.");
		} else {
			System.out.println("Las fechas son diferentes.");
			
		}
		
		
		fecha2.setMonth(12); // cambiamos el mes de fecha 2
		
		System.out.println("\nLa fecha uno es: " + fecha1.toString());
		System.out.println("La fecha dos es: " + fecha2.toString());
		
		
		if (fecha1.equals(fecha2)) { //comprobamos si son iguales
			System.out.println("Las fechas son iguales.");
		} else {
			System.out.println("Las fechas son diferentes.");
			
		}
		
		System.out.println("");
		
		fecha1.setYear(1997); // cambiamos año de fecha 2
		
		System.out.println("La fecha uno es: " + fecha1.toString());
		System.out.println("La fecha dos es: " + fecha2.toString());
		
		
		if (fecha1.equals(fecha2)) { //comprobamos si son iguales
			System.out.println("Las fechas son iguales.");
		} else {
			System.out.println("Las fechas son diferentes.");
			
		}
				
		
		
		Fecha fecha3 = new Fecha();
		fecha3.fechaSistema();
		
		System.out.println("");
		System.out.println("La fecha 3 es:" + fecha3.toString());
		
		
		
	}

}
