package boletin1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido.
		 */
		
		// variable para almacenar núm
		double num;
		
		// construir tabla
		double tabla[] = new double[5];
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for
		for (int i = 0; i < tabla.length; i++) {
			
			// pedir num a a usuario
			System.out.println("Introduzca un número decimal");
			
			// leer num introducido por usuario
			num = sc.nextDouble();
			
			// almacenar num introducido por usuario en tabla
			tabla[i] = num;
		}
		
		// crear bucle for-each -> imprimir valor a valor los números almacenados en tabla
		for (double valor : tabla) {
			
			// imprimir resultado
			System.out.print("\n" + valor);
		}
		
		// cerrar scanner
		sc.close();
	}
}
