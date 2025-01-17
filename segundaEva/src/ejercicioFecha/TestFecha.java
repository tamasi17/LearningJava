package ejercicioFecha;

public class TestFecha {

	public static void main(String[] args) {

//		Crear instancias de Fecha
		
		Fecha fecha1 = new Fecha(1994,12,17);
		Fecha fecha2 = new Fecha(1997,9,17);
		
//		Usar gets, sets, toString y equals.
		
		fecha2.setMonth(12);
		System.out.println(fecha2.toString());
		
		System.out.println("");
		
		if (fecha1.equals(fecha2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son diferentes");
			
		}
		
		System.out.println("");
		
		fecha2.setYear(1994);
		System.out.println(fecha2.toString());
		
		if (fecha1.equals(fecha2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son diferentes");
			
		}
		
		
		
		System.out.println(Fecha.fechaCorrecta(1997,9,35));
		
		
		
	}

}
