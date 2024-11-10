package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// variable para almacenar array1
		int array1[] = new int[10];

		// variable para almacenar array2
		int array2[] = new int[10];

		// variable para almacenar valor introducido en la posición del array
		// correspondiente
		int valor;

		// variable para almacenar valor booleano -> son iguales / no
		boolean sonIguales;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle for -> almacenar valores en tabla
		for (int i = 0; i < 20; i++) {

			// pedir valor a usuario
			System.out.println("\nIntroduzca un num: ");

			// leer tamaño introducido por usuario
			valor = sc.nextInt();

			// definir condicional if -> determinar en que array guardar valor
			if (i < 10) {

				// asignar valor introducido en la posición en cuestión del array1
				array1[i] = valor;
				
			} else {
				// asignar valor introducido en la posición en cuestión del array2
				array2[i - 10] = valor;
			}

		}

		// asignar valor booleano a variable -> son iguales / no
		sonIguales = Arrays.equals(array1, array2);

		// definir condicional if-else -> si son iguales / no
		if (sonIguales) {
			System.out.println("\nLos 2 arrays son iguales");
		} else {
			System.out.println("\nLos 2 arrays no son iguales");

		}
		
		// cerrar scanner
		sc.close();
	}
}
