package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear tabla
		int tabla[] = {1, 22, 24, 34, 17, 11, 7};
		
		// variable -> almacenar numBuscar
		int numBuscar;
		
		// variable -> almacenar resultado de la funcion
		int busqueda;
		
		// pedir numBuscar a usuario
		System.out.println("Introduzca un número para comprobar si se encuentra en el array: ");

		// leer num introducido por usuario
		numBuscar = sc.nextInt();
		
		// almacenar resultado función
		busqueda = buscar(tabla, numBuscar);
		
		// definir condicional if-else -> si es menor que la longitud
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

		
		// bucle while -> busqueda secuencial en tabla 't'
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			
			// incrementar en 1 indiceBusqueda
			indiceBusqueda++;
		}
		
		// definir condicional if-else -> devolver valor posición o -1 si no se encuentra
		if (indiceBusqueda < t.length) {
			
			// asignar indiceBusqueda a variable posición
			posicion = indiceBusqueda;
		} else {
			// no se encuentra; por tanto -> -1
			posicion = -1;
		}
		
		// devolver posicion
		return posicion;
		
	}
	
}
