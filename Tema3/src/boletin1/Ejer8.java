package boletin1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		// crear tabla
		int tabla[] = new int[100];

		// variable para almacenar un num pedido a usuario
		int num;

		// variable para almacenar num aleatorio generado entre 1 y 10
		int aleat;

		// variable para almacenar posición introducida por el usuario
		int resp = -1;
		
		// variable para almacenar booleano
		boolean enc = false;
		

		// crear clase random
		Random rand = new Random();

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle for -> rellenar tabla con valores enteros aleatorios entre 1 y 10
		for (int i = 0; i < tabla.length; i++) {

			// generar num aleat entre 1 y 10 incluido
			aleat = rand.nextInt(1, 11);

			// asignar a posicion de tabla en cuestión num aleatorio generado
			tabla[i] = aleat;

		}

		do {
			try {

				// pedir num a usuario
				System.out.println("\nIntroduzca un número del 0 al 99 incluidos: ");

				// leer num introducido por usuario
				resp = sc.nextInt();

				// comprobar que introduce num >= 0 y <= 99
				assert resp >= 0 && resp <= 99 : "\nDebe introducir un núm dentro del rango.";

			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("\nDebe introducir un número entero.");
			} finally {
				sc.nextLine();
			}

		} while (resp < 0 || resp > 99);
			
		// crear bucle for -> verificar numero a numero de la tabla si coincide con el num introducido por el usuario
		for (int i = 0; i < tabla.length; i++) {
			
			// definir condicional if -> comprobar si el valor de la posición en cuestión de la tabla coincide con el núm
			if (tabla[i] == resp) { // entra si el valor de la posición en cuestión de la tabla coincide con el núm
				
				// definir condicional if con valor booleano -> imprima 1 vez si el num se encuentra en la tabla
				if (!enc) { 
					System.out.println("El número " + resp + " se encuentra en las posiciones: ");
					enc = true; // modificar valor a true -> no entre a este if más veces
				}
				
				// imprime el valor de la posición que coincide con el num
				System.out.print(i + " ");
			}
			
		}
		
		// definir condicional if -> determinar que el num no se encuentra en la tabla
		if (!enc) {
			System.out.println("El número " + resp + " no se encuentra en la tabla");
		}
		
		// cerrar scanner
		sc.close();

	}
}
