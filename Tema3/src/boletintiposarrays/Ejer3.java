package boletintiposarrays;

import java.util.Arrays;

public class Ejer3 {
	public static void main(String[] args) {
		
		// crear tabla 1
		double tabla1[] = new double[8];

		// crear tabla 2
		double tabla2[] = new double[8];
	
		// versión 1 método fill
		Arrays.fill(tabla1, 1234.56);
		
		// versión 2 método fill
		Arrays.fill(tabla2, 3, 7, 1234.56);
		
		// mostrar cadena con contenido de tabla 1
		System.out.println("Tabla 1: " + Arrays.toString(tabla1));

		// mostrar cadena con contenido de tabla 2
		System.out.println("\nTabla 2: " + Arrays.toString(tabla2));
		
	}
}
