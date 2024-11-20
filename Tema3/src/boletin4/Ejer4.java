package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear tabla
		int tabla[] = {1, 22, 24, 34, 17, 11, 7};
		
		// variable -> almacenar num a buscar
		int numBuscar;

		// variable busqueda -> almacenar resultado funcion
		int busqueda;
		
		// pedir num a buscar a usuario
		System.out.println("Introduzca un número a buscar en la tabla: ");
		
		// leer num introducido por usuario
		numBuscar = sc.nextInt();
		
		// buscar num a buscar introducido por usuario en tabla
		busqueda = buscar(tabla, numBuscar);
		
		if (busqueda == -1) {
			System.out.println("\nEl número " + numBuscar + " no se encuentra en la tabla 't'.");
			System.out.println(Arrays.toString(tabla));
		} else {
		// imprimir resultado busqueda
		System.out.println("\nEl número " + numBuscar + " se encuentra en la posición " + busqueda + " de la tabla 't'");
		System.out.println(Arrays.toString(tabla));
		}
		
		// cerrar scanner
		sc.close();
	}
	
	static int buscar(int t[], int clave) {
		
		// variable -> almacenar indiceBusqueda
		int indiceBusqueda = 0;
		
		// variable -> almacenar posicion
		int posicion = 0;
		
		// bucle while -> busqueda
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			// incrementar en 1 indiceBusqueda
			indiceBusqueda++;
		}
		
		// definir condicional if-else -> si es menor que la longitud
		if (indiceBusqueda < t.length) {
			posicion = indiceBusqueda;
		} else {
			posicion = -1;
		}
		
		// devolver posicion
		return posicion;
		
	}

}
