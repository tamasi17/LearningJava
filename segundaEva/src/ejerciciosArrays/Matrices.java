package ejerciciosArrays;

		
import java.util.Random;

public class Matrices {
	
		    public static void main(String[] args) {
		    	
		        Random random = new Random();
		        
		        // Definimos matrices de tamaño 4x4
		        int[][] matriz1 = new int[4][4];
		        int[][] matriz2 = new int[4][4];
		        int[][] suma;
		        int[][] producto;

		        // Llenar las matrices con valores aleatorios entre 1 y 100
		        System.out.println("Primera matriz (4x4) con números aleatorios:");
		        llenarMatrizAleatoria(matriz1, random);
		        imprimirMatriz(matriz1);

		        System.out.println("\nSegunda matriz (4x4) con números aleatorios:");
		        llenarMatrizAleatoria(matriz2, random);
		        imprimirMatriz(matriz2);

		        // Sumar las matrices
		        suma = sumarMatrices(matriz1, matriz2);
		        System.out.println("\nSuma de las matrices:");
		        imprimirMatriz(suma);

		        // Multiplicar las matrices
		        producto = multiplicarMatrices(matriz1, matriz2);
		        System.out.println("\nProducto de las matrices:");
		        imprimirMatriz(producto);
		    }

		    // Método para llenar la matriz con números aleatorios
		    public static void llenarMatrizAleatoria(int[][] matriz, Random random) {
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                matriz[i][j] = random.nextInt(100) + 1; // Aleatorio entre 1 y 100
		            }
		        }
		    }

		    // Método para imprimir la matriz
		    public static void imprimirMatriz(int[][] matriz) {
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.print(matriz[i][j] + "\t");
		            }
		            System.out.println();
		        }
		    }

		    // Método para sumar dos matrices
		    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
		        int[][] resultado = new int[4][4];
		        for (int i = 0; i < matriz1.length; i++) {
		            for (int j = 0; j < matriz1[i].length; j++) {
		                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
		            }
		        }
		        return resultado;
		    }

		    // Método para multiplicar dos matrices
		    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
		        int[][] resultado = new int[4][4];
		        for (int i = 0; i < matriz1.length; i++) {
		            for (int j = 0; j < matriz2[0].length; j++) {
		                for (int k = 0; k < matriz1[0].length; k++) {
		                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
		                }
		            }
		        }
		        return resultado;
		    }
		}

		
		
	}

}
