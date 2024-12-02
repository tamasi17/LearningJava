package ejercicios_Mats;

import java.util.Scanner;

public class NumerosAmigos {

	public static void main(String[] args) {
		
		// dos numeros son amigos entre sí, si a cada uno de ellos se lo obtiene 
		// sumando los divisores propios del otro
		
		// puedes comprobar si son amigos con el par 220, 284
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame el primer número: ");
		int a = scanner.nextInt();
		System.out.println("Y el segundo número: ");
		int b = scanner.nextInt();
		
		int i=0;  // contador para ir dividiendo
		
		int sumaA=0;
		int sumaB=0;
		
		
		System.out.println("Divisores de "+ a);
		
		while(i < a) {
			
			i++;
			
			while( (a%i) != 0) {     // resto de a entre i diferente de cero:  no es un divisor
				
				i++;
			}
			
			if (i != a) {   
				
				System.out.println(i);
				
                sumaA+=i;      // guarda la suma de los divisores
			}
			
		}
		
	i=0;    // reinicia la variable para hacer lo mismo con b
	
	System.out.println("Divisores de "+ b);
	
		while(i<b) {
		
			i++;
		
			while( (b%i) != 0) {
			
			i++;
			}
		
			if(i != b) {
			
			System.out.println(i);
			
            sumaB+=i;
			}
		
		}
		
	System.out.println("\no----------------------o\n");
	
	if ( (sumaA==b) && (sumaB==a) ) {   // si la suma de sus divisores es igual, son amigos
		
		System.out.println("Los números " + a + " y "+ b + " son amigos!");
		
	} else {
			
			System.out.println("Los números " + a +" y " + b +" no son amigos...");
		}
	
	
	
	scanner.close();

	}

}