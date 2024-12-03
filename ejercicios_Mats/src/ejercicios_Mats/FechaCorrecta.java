package ejercicios_Mats;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dame una fecha");
        System.out.println("");
        
        System.out.println("Cuál es el año?");
        int year = scanner.nextInt();
        
        System.out.println("");
        System.out.println("Mes?");
        int month = scanner.nextInt();
           
        System.out.println("");
        System.out.println("Y qué día?");
        int day = scanner.nextInt();
        
        
        if (month == 4 || month == 6 || month == 9 || month == 11) { //meses con 30 dias
        	
        	if (day < 0) {
        		
        		System.out.println("Fecha incorrecta");
        	} else if (day <= 30){
        		
        		System.out.println("Fecha correcta!");
        		
        	} else {
        		System.out.println("Fecha incorrecta");
        	}
        	
        	
        	} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { //meses con 31 dias
        		
            	if (day < 0) {
            		
            		System.out.println("Fecha incorrecta");
            	} else if (day <= 31){
            		
            		System.out.println("Fecha correcta!");
            		
            	} else {
            		System.out.println("Fecha incorrecta");
            	}
        	
        	} else if (month == 2) { // febrero
        		
        		if ((year % 4 == 0) && (year % 100 != 0)) { // bisiesto
        			
        			if (day < 0) {
                		
            	    	System.out.println("Fecha incorrecta");
            	    } else if (day <= 29){
            		
            		    System.out.println("Fecha correcta!");
            		
            	    } else {
            		System.out.println("Fecha incorrecta");
            	    
            	    }
        			
        		} else if (day < 0) { // no bisiesto
        		
        	    	System.out.println("Fecha incorrecta");
        	    } else if (day <= 28){
        		
        		    System.out.println("Fecha correcta!");
        		
        	    } else {
        		System.out.println("Fecha incorrecta");
        	    
        	    }
        
        	}
    
        
        scanner.close();
        
  }
}