/**
 * 
 */
package pooCuentaBancaria;

/**
 * Para probar las clases Cuenta, CuentaAhorros y CuentaCorriente
 */
public class TestCuentaBancaria {

	
	public static void main(String[] args) {

		
		// CUENTA DE AHORROS
		
		CuentaAhorros cA = new CuentaAhorros(10500, 20);
		
		System.out.println(cA + "\n");
		
		
//		System.out.println(cA.isEstaActiva());  //descomentar para comprobar
			
		cA.ingresar(300);
			
		
		try {
			
			cA.retirar(1200);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.println(cA + "\n");	
		
		
		// CUENTA CORRIENTE
		
		CuentaCorriente cC = new CuentaCorriente(500, 30);
		
		System.out.println(cC + "\n");
		
		try {
			
			cC.retirar(700);
			System.out.println("Retirando 700...");
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.println(cC + "\n");

		cC.ingresar(1300);
		System.out.println("Ingresando 1300...");
		
		System.out.println(cC + "\n");
		
		
	}

}
