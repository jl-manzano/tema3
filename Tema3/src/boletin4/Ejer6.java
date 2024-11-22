package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear tabla 
		int tabla[] = {10, 1, 5, 8, 9, 2};
		
		// crear tabla -> almacenar resultado
		int tablaSumar[];
		
		// variable -> almacenar numElementos
		int agrupar = 0;
		
		do {
			try {
				// pedir num a usuario
				System.out.println("Introduzca el número de elementos en los que desea agrupar los valores de su tabla que contienen una suma de los elementos consecutivos: ");

				// leer num introducido por usuario
				agrupar = sc.nextInt();

				assert agrupar >= 2 : "\nIntroduzca un número positivo >= 2";
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Introduzca un número entero.");
			} finally {
				sc.nextLine();
			}
		} while (agrupar < 2);
		
		// almacenar resultado
		tablaSumar = suma(tabla, agrupar);		
		
		// imprimir contenido tabla con resultados
		System.out.println("\n" + Arrays.toString(tablaSumar));
		
		// cerrar scanner
		sc.close();
		
	}
	
	static int[] suma(int t[], int numElementos) {
		
		// crear tabla con la longitud de la tabla introducida - numElementos a agrupar introducidos + 1
		int resultado[] = new int[t.length - numElementos + 1];
		
		// for -> asignar los valores de la tabla a devolver
		for (int i = 0; i < resultado.length; i++) {
			
			// for -> sumar los valores hasta i + numElementos introducido por usuario
			for (int j = i; j < i + numElementos; j++) {
				
				// sumar y asignar valores que se encuentren en la posicion en cuestion a variable suma
				resultado[i] += t[j];
			}
			
		}
		
		// devolver tabla
		return resultado;
		
	}
	
}
