package poo.coche;

public class Coche {


    private String marca, modelo, color;

    private int potencia, maletero, puertas, precio, velocidad;


    

    // Constructor con parámetros

    public Coche(String marca, String modelo, String color, int maletero, int puertas, int potencia, int velocidad, int precio) {

        this.marca = marca;

        this.modelo = modelo;

        this.color = color;

        this.maletero = maletero;

        this.puertas = puertas;

        this.potencia = potencia;

        this.velocidad = velocidad;

        this.precio = precio;

    }



    // GETTERS Y SETTERS

    public void setMarca(String marca) {

        this.marca = marca;
    }



    public String getMarca() {

        return marca;
    }



    public void setModelo(String modelo) {

        this.modelo = modelo;
    }



    public String getModelo() {

        return modelo;
    }



    public void setColor(String color) {

        this.color = color;
    }



    public String getColor() {

        return color;
    }



    public void setPotencia(int potencia) {

        this.potencia = potencia;
    }



    public int getPotencia() {

        return potencia;
    }



    public void setMaletero(int maletero) {

        this.maletero = maletero;
    }



    public int getMaletero() {

        return maletero;
    }



    public void setPuertas(int puertas) {

        this.puertas = puertas;
    }



    public int getPuertas() {

        return puertas;
    }



    public void setPrecio(int precio) {

        this.precio = precio;
    }



    public int getPrecio() {

        return precio;
    }

    

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;
    }



    public int getVelocidad() {

        return velocidad;
    }



    

    //METODOS

    public void acelerar(int mas) {

        velocidad += mas;
    }



    public void desacelerar(int menos) {

        velocidad -= menos;
    }



    public void frenar() {

        velocidad = 0;
    }



    public void pintarCoche(String color) {

    	this.color = color;
    }



    public void mostrarDatos() {

        System.out.println("----- Datos del coche -----");

        System.out.println("Marca: " + marca);

        System.out.println("Modelo: " + modelo);

        System.out.println("Color: " + color);

        System.out.println("Potencia: " + potencia + " cv.");

        System.out.println("Maletero: " + maletero + " L.");

        System.out.println("Puertas: " + puertas);

        System.out.println("Precio: " + precio + " €");

    }

}