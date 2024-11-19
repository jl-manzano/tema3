package boletin4;

import java.util.Arrays;

public class Ejer2 {
	public static void main(String[] args) {
		//	Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.

		// crear tabla 
		int t[] = {1, 22, 24, 34, 17, 11, 7};
		
		// mostrar contenido array
		System.out.println(Arrays.toString(t) + "\n");
		
		// mostrar valor máximo contenido en tabla 't'
		System.out.println("El valor máximo contenido en la tabla 't' es: " + maximoValor(t));
	}
	
	// funcion maximoValor contenido en tabla t
	static int maximoValor(int[] t) {
		
		// variable para el maximo
		int max = 0;
		
		// bucle for -> encontrar valor máximo contenido en tabla t
		for (int i = 0; i < t.length; i++) {
			
			// definir condicional if -> comprobar si el numero contenido en la posición en cuestión es mayor al valor contenido en la variable maximo
			if (t[i] > max) {
				max = t[i];
			}
		}
		
		// devuelve el valor maximo contenido en tabla t
		return max;
		
	}
}
