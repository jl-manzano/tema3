package boletin1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// variable para almacenar tª media / mes
		int tempMedia[] = new int[12];
		
		// variable para almacenar num
		int num;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for -> almacenar valores en tabla
		for (int i = 0; i < tempMedia.length; i++) {
			
			// pedir temp usuario
			System.out.println("Introduzca la temperatura del mes " + (i+1) + ": ");
			
			// leer num introducido por usuario
			num = sc.nextInt();
			
			// almacenar num introducido por usuario en tabla
			tempMedia[i] = num;
		
		}
		
		System.out.println();
		
		// crear bucle for-each -> recorrer valor a valor tabla
		for (int valor : tempMedia) {
			
			// crear bucle for -> construir diagrama de barras
			for (int j = 0; j < valor; j++) {
				System.out.print("* ");
			}
			
			// imprimir salto de línea
			System.out.println();
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
