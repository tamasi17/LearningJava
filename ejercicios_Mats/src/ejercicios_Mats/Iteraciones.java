package ejercicios_Mats;

public class Iteraciones {

	public static void main(String[] args) {
	
		// cuatro bucles de veinte vueltas con diferentes iteradores

		int i = 1;
		int j = 1;
		
		System.out.println("While sumando 1:");
		System.out.println(" ");
		
		while (i<=20) {
			System.out.println(j + " i: " + i);
		    i = i + 1;
		    j = j + 1;
		
		}
		
		
		
		i = 0;
		j = 1;
		
		System.out.println(" ");
		System.out.println("While multiplos de cinco 5:");
		System.out.println(" ");
		
		while (i<=500) {
			System.out.println(j + " i: " + i);
		    i = i + 5;
		    j = j + 1;
		
		}	
		
	}

}
