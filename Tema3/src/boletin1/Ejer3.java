package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// variable para almacenar num
		double num;
		
		// construir tabla
		double tabla[] = new double[10];
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for
		for (int i = tabla.length - 1; i >= 0 ; i--) {
			
			// pedir num a usuario
			System.out.println("Introduzca un / otro núm: ");
			
			// leer num introducido por usuario
			num = sc.nextInt();
			
			// almacenar num introducido por usuario en tabla
			tabla[i] = num;
				
		}

		// imprimir contenido de la tabla en orden inverso
		System.out.println("\n" + Arrays.toString(tabla));

		// cerrar scanner
		sc.close();
		
	}
}
