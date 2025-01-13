package entidadDireccion;

import java.util.Scanner;

public class TestDireccion {

	public static void main(String[] args) {

		
//		Clase principal para probar la entidad direccion
		
		/*
		 tipoVia;
		 nombreVia;
		private int portal;
		private int piso;
		private char puerta;
		private int codigoPostal;
		private String ciudad;
		private String provincia;
		private String pais;
		*/
		
		
		
		
		
        Direccion calle1 = new Direccion();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entidad Dirección \n\n\n");

        System.out.println("Tipo de via:");
        String input = scanner.nextLine();
        calle1.setTipoVia(input); // Pasamos la informacion por parametros
        
        System.out.println("Nombre de la calle:");
        input = scanner.nextLine();
        calle1.setNombreVia(input);
        
        System.out.println("Portal:");
        int num = scanner.nextInt();
        calle1.setPortal(num);
        
        System.out.println("Piso:");
        num = scanner.nextInt();
        calle1.setPiso(num);
        
        System.out.println("Puerta:");
        char digito = scanner.next().charAt(0);
        calle1.setPuerta(digito);
        
        System.out.println("Código Postal:");
        num = scanner.nextInt();
        calle1.setCodigoPostal(num);
        
        System.out.println("Localidad:");
        input = scanner.next();
        calle1.setCiudad(input);
        
        System.out.println("Provincia:");
        input = scanner.next();
        calle1.setProvincia(input);
        
        System.out.println("País:");
        input = scanner.next();
        calle1.setPais(input);
        
        
        System.out.println("\nLa dirección completa es: "
        		+ calle1.getTipoVia() + " "
        		+ calle1.getNombreVia() + ", "
        		+ calle1.getPortal() + ".\nPiso "
        		+ calle1.getPiso() + " Puerta "
        		+ calle1.getPuerta() + "\n"
        		+ calle1.getCodigoPostal() + " "
        		+ calle1.getCiudad() + ", "
        		+ calle1.getProvincia() + ", "
        		+ calle1.getPais() + ".");
		
		
		
		
	}

}
