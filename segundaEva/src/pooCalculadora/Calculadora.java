package pooCalculadora;

public class Calculadora {
	
   
    private double acumulador, memoriaUno, memoriaDos;


    

//    Constructor con parámetros

    public Calculadora(double acumulador, double memoriaUno, double memoriaDos) {


        this.memoriaUno = memoriaUno;

        this.memoriaDos = memoriaDos;

        this.acumulador = acumulador;
        
    }
    
    
//    Getters y Setters
    
    
    public void setAcumulador(double a) {

        this.acumulador = a;
    }



    public double getAcumulador() {

        return acumulador;
    }
    
    
    public void setMemoriaUno(double a) {

        this.memoriaUno = a;
    }



    public double getMemoriaUno() {

        return memoriaUno;
    }
    
    
    public void setMemoriaDos(double a) {

        this.memoriaDos = a;
    }



    public double getMemoriaDos() {

        return memoriaDos;
    }
    
    
 
    
    
//    Métodos
    
    
    public void suma(double a) {

    	this.acumulador += a;
    }
    
    
    public void resta(double a) {

    	this.acumulador -= a;
    }
    
    
    public void producto(double a) {

    	this.acumulador *= a;
    }

  
    public void division(double a) {

    	this.acumulador /= a;
    }

  
    public void potencia(double a) {

    	this.acumulador = Math.pow(acumulador, a);
    }
    
    
    
    

}
