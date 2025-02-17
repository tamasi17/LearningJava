/**
 * 
 */
package pooCuentaBancaria;

/**
 * Para probar las clases Cuenta, CuentaAhorros y CuentaCorriente
 */
public class TestCuentaBancaria {

	
	public static void main(String[] args) {

		
		CuentaAhorros cA = new CuentaAhorros(10500, 20);
		
		System.out.println(cA + "\n");
		
		
		System.out.println(cA.isEstaActiva());
			
		cA.ingresar(300);
			
		
		try {
			
			cA.retirar(1200);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.println(cA + "\n");	
		
		
		
		
		
		
		
	}

}
