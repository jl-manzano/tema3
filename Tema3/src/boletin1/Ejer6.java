package boletin1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// variable para almacenar num
		int num;
		
		// construir tabla
		int tabla[] = new int[8];
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for
		for (int i = 0; i < tabla.length; i++) {
			
			// pedir num a usuario
			System.out.println("Introduzca un / otro núm: ");
			
			// leer num introducido por usuario
			num = sc.nextInt();
			
			// almacenar num introducido por usuario en tabla
			tabla[i] = num;
				
		}
		
		// crear bucle for-each -> imprimir valor a valor los números almacenados en tabla
		for (int valor : tabla) {
			// uso operador ternario -> comprobar si es par o impar e imprimir valor a valor + par / impar
			System.out.println(valor % 2 == 0 ? valor + " es par" : valor + " es impar");
		}
		
		// cerrar scanner
		sc.close();
	}
}
