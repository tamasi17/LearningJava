package ejercicios_Mats;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = 0;

        do {
            System.out.print("Introduce un número del 1 al 7: ");
            
            // comprobar si es un numero valido
            
     
                dayNumber = scanner.nextInt();
                
                if (dayNumber < 1 || dayNumber > 7) {
                    System.out.println("No es correcto.");
                 }
                
        } while (dayNumber < 1 || dayNumber > 7);

        
        switch (dayNumber) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        scanner.close();
    }
}
