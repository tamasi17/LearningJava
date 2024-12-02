package calculadora;

// realiza una clase matematica con metodos y pruebala en otra clase que lleve el metodo main

public class Matematicas {
	
	
	public static double PI=3.1416;
	
	
	// 1.SUMA

	public static int suma(int a, int b) {	
		return a + b;
	}
	
	
	// 2.RESTA
	
	public static int resta(int a, int b) {	
		return a - b;
	}
	
	
	// 3.MULTIPLICACION
	
	public static double multiplicacion(int a, int b) {	
		return a * b;
	}
	
	
	// 4.DIVISION
	
	public static double division(int a, int b) {	
		return a / b;
	}
	
	
	// 5.POTENCIA
	
	public static double potencia(double base, double exponente) {	
		
		// a es la base
		// b el exponente
		
        double resultado = 1;
        
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        
        return resultado;
		
	}

	
	// 6.RAIZ
	
	public static double raiz(int a) {	
		return Math.sqrt(a);
	}
	
	
	// 7.PORCENTAJE
	
	public static double porcentaje(int a, int b) {	
		return ((a * b)/100);
	}
	
	
	//8. ABSOLUTO
	
	public static double abs(int a) {
		
		a = (a<0) ? -a : a;
		return a;
	}
	
	
	// 9.FACTORIALES
	
	
	public static double factorial(int a) {

			double acumulador=1; 
			
			
			//System.out.println("Calculamos el factorial de " + factorial);

		
			while (a>1){
				
				acumulador *= a;
				a--;
			}
			
			//System.out.println("El factorial es: " + acumulador);
			
			return acumulador;

		}
	
	
	

	} // fin class matematicas

