package ejercicioFecha;

import java.time.LocalDate;
import java.util.Objects;

public class Fecha {

	
//	Atributos
	
	private int day, month, year;
	
	
//	Constructores: uno vacio, otro con los tres parametros.
	
	public Fecha() {
		
		this.year=0;
		this.month=1;
		this.day=1;
		
	}
	
	public Fecha(int year, int month, int day) {
		
		this.year=year;
		this.month=month;
		this.day=day;
	
		
	}
	

	
//	Metodos
	
	
	public void fechaSistema() {
		LocalDate today = LocalDate.now();
		this.year=today.getYear();
		this.month=today.getMonthValue();
		this.day=today.getDayOfMonth();
	}
	
	private boolean fechaCorrecta(int year, int month, int day) {
		
		if (month == 4 || month == 6 || month == 9 || month == 11) { //meses con 30 dias
        	
        	if (day < 0) {
        		
        		return false;
        	} else if (day <= 30){
        		
        		return true;  
        		
        	} else {
        		return false;
        	}
        	
        	
        	} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { //meses con 31 dias
        		
            	if (day < 0) {
            		
            		return false;
            		
            	} else if (day <= 31){
            		
            		return true;
            		
            	} else {
            		return false;
            	}
        	
        	} else if (month == 2) { // febrero
        		
        		if ((year % 4 == 0) && (year % 100 != 0)) { // bisiesto
        			
        			if (day < 0) {
                		
        				return false;
        				
            	    } else if (day <= 29){
            		
            	    	return true;
            		
            	    } else {

            	    	return false;            	    
            	    }
        			
        		} else if (day < 0) { // no bisiesto
        		
        			return false;
        			
        	    } else if (day <= 28){
        		
        	    	return true;
        		
        	    } else {
        	    	return false;
        	    }
        
        	} else { // cualquier otro fallo
        		return false;
        	}
    
		
	} // fin fechaCorrecta()
	
	
//	Getters y Setters

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		
		if (fechaCorrecta(year, this.month, this.day)) {			
			this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if (fechaCorrecta(this.year, month, this.day)) {			
			this.month = month;
		}
		
		
	}


	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {

		if (fechaCorrecta(this.year, this.month, day)) {			
			this.day = day;
		}
	}
	
//	toString (generado desde Source)
	
	@Override
	public String toString() {
		return day + " del " + month + " de " + year;
	}

	

	
//	equals (generado desde Source)
	
	
	public boolean equals(Fecha f1) {
		if ( (this.day == f1.day) && (this.month == f1.month) && (this.year == f1.year) ) {
			return true;
		} else {
			return false;
		}		
		
	}
	
	
	
	
	
	
	
}
