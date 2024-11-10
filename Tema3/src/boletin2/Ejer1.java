package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		// variable para almacenar el tamaño del array
		int tamaño = 0;

		// variable para almacenar valor introducido en la posición del array
		// correspondiente
		double valor;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		do {

			try {
				// pedir tamaño a usuario
				System.out.println("Introduzca el tamaño del array: ");

				// leer tamaño introducido por usuario
				tamaño = sc.nextInt();

				assert tamaño > 0 : "\nDebe introducir un valor mayor de 0 para el tamaño del array.";

			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("\nDebe introducir un valor entero para el tamaño del array.");
			} finally {
				sc.nextLine();
			}

		} while (tamaño < 0);

		// crear tabla
		double tabla[] = new double[tamaño];

		// crear bucle for -> almacenar valores en tabla
		for (int i = 0; i < tabla.length; i++) {

			// pedir valor a usuario
			System.out.println("\nIntroduzca un num: ");

			// leer tamaño introducido por usuario
			valor = sc.nextDouble();

			// asignar valor a posición en cuestión del array
			tabla[i] = valor;

		}
		
		// mostrar array por pantalla
		System.out.println("\n" + Arrays.toString(tabla));

		// cerrar scanner
		sc.close();

	}
}
