package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		// variable para almacenar num
		double num;
		
		// variable para almacenar suma
		double suma = 0;
		
		// variable para almacenar min
		double min = 0;

		// variable para almacenar min
		double max = 0;
		
		// construir tabla
		double tabla[] = new double[10];
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear bucle for
		for (int i = 0; i < tabla.length ; i++) {
			// pedir num a usuario
			System.out.println("Introduzca un / otro núm: ");
			
			// leer num introducido por usuario
			num = sc.nextInt();	
			
			// almacenar num introducido en tabla
			tabla[i] = num;
			
			// sumar num introducido a variable suma
			suma += num;
			
			// definir condicionar if-else-if-else -> determinar mínimo y máximo
			if (num <= min) { // entra si num <= min 
				
				// asignar num a variable mín
				min = num;
				
			} else if (num > max) { // entra si num > max
				
				// asignar num a variable máx
				max = num;
			
			} else {
				
			}
		}
		
		// imprimir contenido tabla
		System.out.println("\n" + Arrays.toString(tabla));
		
		// imprimir suma
		System.out.println("Suma: " + suma);
		
		// imprimir valor mín y máx
		System.out.println("Mínimo: " + min + ", Máximo: " + max);
		
		// cerrar scanner
		sc.close();
	}
}
