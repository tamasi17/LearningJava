package ejercicios_Mats;

import java.util.Scanner;

public class CajeroBucle {

	public static void main(String[] args) {
		
		double precio, recibido, devolucion;
		int b500, b200, b100, b50, b20, b10, b5, mon2e, mon1e;
		int c50, c20, c10, c5, c2, c1;

		Scanner scanner = new Scanner(System.in);
		
		precio = 0;
		recibido = 0;
		devolucion = 0;
		b500 = 0;
		b200 = 0;
		b100 = 0;
		b50 = 0;
		b20 = 0;
		b10 = 0;
		b5 = 0;
		mon2e = 0;
		mon1e = 0;
		c50 = 0;
		c20 = 0;
		c10 = 0;
		c5 = 0;
		c2 = 0;
		c1 = 0;
		
		
		
		// introducimos precio
		
		
		
		while (precio<=0) {
			System.out.println("Cuánto ha costado?");
			precio = scanner.nextDouble();
		}
		
		
		// dinero entregado
		
		do {
			System.out.println("Cuánto nos entregan?");
			recibido = scanner.nextDouble();
		} while (precio>recibido);
		
		devolucion = recibido - precio;
		
		System.out.println("Hay que devolver: " + devolucion + " euros.");
		
		// repartimos devolucion por monedas practicando el uso de >= o ++
		
		if (devolucion == 0) {
			
			System.out.println("Gracias por su compra!");
		} else {
			
			while (devolucion>=500) {
				b500++;
				devolucion -= 500;
			}
			
			while (devolucion>=200) {
				b200++;
				devolucion -= 200;
			}
			
			while (devolucion>=100) {
				b100++;
				devolucion -= 100;
			}
			
			while (devolucion>=50) {
				b50++;
				devolucion -= 50;
			}
			
			while (devolucion>=20) {
				b20++;
				devolucion -= 20;
			}
			
			while (devolucion>=10) {
				b10++;
				devolucion -= 10;
			}
			
			while (devolucion>=5) {
				b5++;
				devolucion -= 5;
			}
			
			while (devolucion>=2) {
				mon2e++;
				devolucion -= 2;
			}
			
			while (devolucion>=1) {
				mon1e++;
				devolucion -= 1;
			}
			
			while (devolucion>=0.50) {
				c50++;
				devolucion -= 0.50;
			}
			
			while (devolucion>=0.20) {
				c20++;
				devolucion -= 0.20;
			}
			
			while (devolucion>=0.10) {
				c10++;
				devolucion -= 0.10;
			}
			
			while (devolucion>=0.05) {
				c5++;
				devolucion -= 0.05;
			}
			
			while (devolucion>=0.02) {
				c2++;
				devolucion -= 0.02;
			}
			
			while (devolucion>=0.01) {
				c1++;
				devolucion -= 0.01;
			}
			
			// recuento vuelta
			
			System.out.println("Aquí tiene su vuelta:\n");
			
			while (b500>0) {
				System.out.println("Billetes de 500: " + b500);
				b500 = 0;
			}
			
			while (b200>0) {
				System.out.println("Billetes de 200: " + b200);
				b200 = 0;
			}
			
			while (b100>0) {
				System.out.println("Billetes de 100: " + b100);
				b100 = 0;
			}
			
			while (b50>0) {
				System.out.println("Billetes de 50: " + b50);
				b50 = 0;
			}
			
			while (b20>0) {
				System.out.println("Billetes de 20: " + b20);
				b20 = 0;
			}
			
			while (b10>0) {
				System.out.println("Billetes de 10: " + b10);
				b10 = 0;
			}
			
			while (b5>0) {
				System.out.println("Billetes de 5: " + b5);
				b5 = 0;
			}
			
			while (mon2e>0) {
				System.out.println("Monedas de 2e: " + mon2e);
				mon2e = 0;
			}
			
			while (mon1e>0) {
				System.out.println("Monedas de 1e: " + mon1e);
				mon1e = 0;
			}
			
			while (c50>0) {
				System.out.println("Monedas de 50c: " + c50);
				c50 = 0;
			}
			
			while (c20>0) {
				System.out.println("Monedas de 20c: " + c20);
				c20 = 0;
			}
			
			while (c10>0) {
				System.out.println("Monedas de 10c: " + c10);
				c10 = 0;
			}
			
			while (c5>0) {
				System.out.println("Monedas de 5c: " + c5);
				c5 = 0;
			}
			
			while (c2>0) {
				System.out.println("Monedas de 2c: " + c2);
				c2 = 0;
			}
			
			while (c1>0) {
				System.out.println("Monedas de 1c: " + c1);
				c1 = 0;
			}
			
			
			System.out.println("\nGracias por su compra!");
			
		}
		
		
		scanner.close();
	}

}
