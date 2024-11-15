package boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// crear tabla 4 filas x 5 columnas
		double notas[][] = new double[4][5];

		// variable para almacenar suma
		double suma = 0;

		// variable para almacenar minimo y establecer a 10 -> cualquier nota sea menor
		double min = 10;

		// variable para almacenar maximo
		double max = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// bucle for -> ir de alumno en alumno preguntando notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno: " + (i + 1) + ": ");

			// bucle for -> preguntar notas alumnos
			for (int j = 0; j < notas[i].length; j++) {
				
				// crear bucle do-while -> asegurar que alumno introduzca nota correcta
				do {

					try {
						
					// pedir nota a usuario
					System.out.println("Introduzca la nota " + (j + 1) + ": ");

					// leer nota introducida por usuario
					notas[i][j] = sc.nextDouble();

					// salto de línea
					System.out.println();
					
					// definir assert -> comprobar que nota introducida es >= 0 y <= 10
					assert notas[i][j] >= 0 && notas[i][j] <= 10 : "Introduzca una nota en el rango 0-10.";
					} catch (AssertionError e) {
						System.out.println(e.getMessage());
					} catch (InputMismatchException e) {
						System.out.println("Debe introducir una nota con nºs 'reales' en el rango entre 0-10.");
					} finally {
						sc.nextLine();
					}
					
				} while (notas[i][j] < 0 || notas[i][j] > 10);
			}
		}

		// imprimir tabulación
		System.out.print("\t");

		// bucle for
		for (int i = 1; i <= 5; i++) {
			System.out.print("\tNota " + i);
		}

		// salto de línea
		System.out.println();

		// bucle for
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\nAlumno " + (i + 1) + "\t");

			// bucle for -> imprimir bonito las notas por alumno
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");

				// sumar y asignar nota en cuestión a variable suma
				suma += notas[i][j];

				// definir condicional if -> determinar nota máxima
				if (max <= notas[i][j]) {
					max = notas[i][j];
				}

				// definir condicional if -> determinar nota mínima
				if (min >= notas[i][j]) {
					min = notas[i][j];
				}

			}

			// salto de línea
			System.out.println();

			// imprimir en pantalla nota mínima
			System.out.println("\nNota mínima: " + min);

			// imprimir en pantalla nota máxima
			System.out.println("Nota máxima: " + max);

			// imprimir en pantalla nota media
			System.out.println("Media aritmética: " + suma / 5);

			// establecer a 0 la variable suma -> cada alumno
			suma = 0;

		}

		// cerrar scanner
		sc.close();
	}
}
