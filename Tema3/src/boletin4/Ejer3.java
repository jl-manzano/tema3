package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {

	// crear scanner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// creear tablaPares
		int tablaPares[];
		
		// variable para almacenar la longitud del array
		int longitudArray;
		
		// variable para almacenar el valor máximo del array
		int valorFinal;
		
		// pedir longitudArray a usuario
		longitudArray = pedirNumeroEntero("Introduzca la longitud del Array: ");
		
		// pedir valorFinal a usuario
		valorFinal = pedirNumeroEntero("\nIntroduzca el valor máximo del Array: ");
		
		// almacenar tabla resultante de la función en tablaPares
		tablaPares = rellenaPares(longitudArray, valorFinal);
		
		// salto de línea
		System.out.println();
		
		// mostrar contenido tabla
		System.out.println(Arrays.toString(tablaPares));
		
	}

	static int[] rellenaPares(int longitud, int fin) {

		// crear tabla de longitud introducida por usuario
		int tabla[] = new int[longitud];

		// crear clase Random
		Random rand = new Random();

		// variable para almacenar número aleatorio
		int numAleat;

		// variable apra almacenar contador
		int contador = 0;

		// bucle while -> generar num aleatorios pares en tabla desde 2-fin inclusives
		while (contador < tabla.length) {

			// generar num aleatorio
			numAleat = rand.nextInt(2, fin + 1);
			
			// definir condicional if -> comprobar numAleat es par
			if (numAleat % 2 == 0) {
				
				// almacenar numAleat en posición en cuestión tabla
				tabla[contador] = numAleat;
				
				// incrementar en 1 variable contador
				contador++;
			}
		}
		
		// ordenar tabla
		Arrays.sort(tabla);
		
		// devolver tabla
		return tabla;

	}

	static int pedirNumeroEntero(String mensaje) {

		// variable para almacenar dato
		int dato = 0;

		do {
			try {
				// pedir num a usuario
				System.out.println(mensaje);

				// leer num introducido por usuario
				dato = sc.nextInt();

				assert dato > 0 : "Introduzca un número positivo > 0";
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Introduzca un número entero.");
			} finally {
				sc.nextLine();
			}
		} while (dato <= 0);

		// devolver dato
		return dato;

	}
}
