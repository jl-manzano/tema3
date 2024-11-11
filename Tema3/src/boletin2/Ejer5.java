package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		// crear array de tamaño 1000
		int array[] = new int[1000];
		
		// crear clase random
		Random rand = new Random();
		
		// variable -> almacenar valor aleatorio generado
		int aleat;
		
		// variable -> almacenar valor introducido por usuario
		int valor = -1;
		
		// variable para almacenar contador
		int contador = 0;
		
		// variable boolean
		boolean enc = false;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for -> asignar valor aleatorio entre 0 y 99
		for (int i = 0; i < array.length; i++) {
			
			// generar num aleatorio entre 0 y 99 incluidos
			aleat = rand.nextInt(0, 100);
			
			// asignar num aleatorio generado a posición en cuestión del array 
			array[i] = aleat;
		}
		
		// mostrar contenido array en pantalla -> comprobar después con Ctrl + F
		System.out.println(Arrays.toString(array));

		
		do {
			
			try {
		// pedir valor a usuario
		System.out.println("\nIntroduzca un valor para comprobar si existe en el array, además de cuántas veces: ");
		
		// leer valor introducido por usuario
		valor = sc.nextInt();
		
		// comprobar que introduce num >= 0 y <= 99
		assert valor >= 0 && valor <= 99 : "\nERROR. \nEl valor no existe en la tabla. \nIntroduzca un valor dentro del rango.";
			
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Introduzca un número entero del 0 al 99.");
			} finally {
				sc.nextLine();
			}
		} while (valor < 0 || valor > 99);
		
		// crear bucle for -> verificar numero a numero de la tabla si coincide con el num introducido por el usuario
		for (int i = 0; i < array.length; i++) {
			
			// definir condicional if -> comprobar si el valor de la posición en cuestión de la tabla coincide con el núm
			if (array[i] == valor) {
				
				// incrementar en 1 variable contador
				contador++;
				
				// definir condicional if con valor booleano -> imprima 1 vez si el num se encuentra en la tabla
				if (!enc) {
					System.out.println("El número " + valor + " se encuentra en las siguientes posiciones: ");
					enc = true; // modificar valor a true -> no entre a este if más veces
				}
				
				// imprime el valor de la posición que coincide con el num
				System.out.println(i + "");
				
			}
			
		}
		
		// imprimir cuantas veces existe el valor en la tabla
		System.out.println("\nEl valor " + valor + " se repite " + contador + " veces en la tabla.");

		// cerrar scanner
		sc.close();
		
	}
}
