package boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		// variable -> almacenar filas
		int filas = 0;

		// variable -> almacenar columnas
		int columnas = 0;
		
		// crear array
		double tabla[][];

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle do-while -> asegurar que usuario introduzca nº filas > 0
		do {

			try {

				// pedir filas a usuario
				System.out.print("Introduce el número de filas: ");
				filas = sc.nextInt();
				System.out.println();

				// definir assert -> comprobar que nº filas introducido es > 0
				assert filas > 0 : "Introduzca un número de filas correcto";
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un número entero.");
			} finally {
				sc.nextLine();
			}

		} while (filas <= 0);

		// crear bucle do-while -> asegurar que usuario introduzca nº columnas > 0
		do {

			try {

				// pedir columnas a usuario
				System.out.print("Introduce el número de columnas: ");
				columnas = sc.nextInt();
				System.out.println();

				// definir assert -> comprobar que nº columnas introducido es > 0
				assert columnas > 0 : "Introduzca un número de columnas correcto";
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un número entero.");
			} finally {
				sc.nextLine();
			}

		} while (columnas <= 0);

		// asignar nº filas y nº columnas a tabla creada
		tabla = new double[filas][columnas];
		
		// bucle for -> recorrer filas
		for (int i = 0; i < tabla.length; i++) {
			
			// bucle for -> recorrer columnas
			for (int j = 0; j < tabla[i].length; j++) {
				
				//  calcular y almacenar valor en posición en cuestión
				tabla[i][j] = 10 * i + j;
				
			}
		}
		
		// bucle for anidado -> mostrar tabla de forma bonita
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			
			// imprimir salto de línea 
			System.out.println();
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
