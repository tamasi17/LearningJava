/**
 * 
 */
package pooCuentaBancaria;

/**
 * Para probar las clases Cuenta, CuentaAhorros y CuentaCorriente
 */
public class TestCuentaBancaria {

	
	public static void main(String[] args) {

		
		
		CuentaAhorros cA = new CuentaAhorros(10500, 10);
		
		try {
			
		cA.ingresar(200);
		cA.interes();
		cA.retirar(70);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		cA.toString();
		
		
		
		
		
		
		
		
	}

}
