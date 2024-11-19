package boletin4;

import java.util.Arrays;

public class Ejer1 {
	public static void main(String[] args) {
		
		// crear tabla 
		int array[] = {1, 22, 24, 34, 17, 11, 7};
		
		// mostrar contenido array
		System.out.println(Arrays.toString(array) + "\n");
		
		// mostrar resultado suma valores tabla
		System.out.println("La suma de los valores de la tabla es: " + sumaValores(array));
	}
	
	// crear función sumaValores
	static int sumaValores(int[] tabla) {
		
		// variable para la suma
		int suma = 0;
		
		// bucle for-each -> recorrer posiciones de la tabla y sumar los valores contenidos
		for (int valor : tabla) {
			
			// sumar y reasignar el valor de variable suma al sumarle el valor contenido en cada posición de la tabla
			suma += valor;
		}
		
		// devuelve el resultado de la suma
		return suma;
	}
}
