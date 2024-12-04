package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

		// variable para almacenar puntuacion
		int puntuaciones[] = new int[8];

		// variable para almacenar num
		int num = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle for -> almacenar valores en tabla
		for (int i = 0; i < puntuaciones.length; i++) {

			do {
				try {

					// pedir puntuacion a usuario
					System.out.println("Introduzca la puntuación del jugador " + (i + 1) + ": (1000-2800)");

					// leer num introducido por usuario
					num = sc.nextInt();

					// almacenar num introducido por usuario en tabla
					puntuaciones[i] = num;

					System.out.println();

					// comprobar que introduce num >= 0 y <= 99
					assert num >= 1000 && num <= 2800 : "\nDebe introducir un núm dentro del rango.";

				} catch (AssertionError e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("\nDebe introducir un número entero.");
				} finally {
					sc.nextLine();
				}

			} while (num < 1000 || num > 2800);
		}
		// ordenar on orden ascendente -> array
		Arrays.sort(puntuaciones);

		// mostrar puntuaciones en orden descendente
		for (int i = puntuaciones.length - 1; i >= 0; i--) {
			System.out.println("Puntuación " + (puntuaciones.length - i) + ": " + puntuaciones[i]);
		}
		
		// cerrar scanner
		sc.close();

	}
}
