package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// crear tabla 
		int tabla[] = {1, 22, 24, 34, 17, 11, 7};
		
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
		
		// variable suma
		int suma = 0;
		
		// for -> asignar los valores de la tabla a devolver
		for (int i = 0; i < t.length - numElementos + 1; i++) {
			
			// for -> sumar los valores hasta el numElementos introducido por usuario
			for (int j = 0; j < numElementos; j++) {
				
				// sumar y asignar valores que se encuentren en la posicion en cuestion a variable suma
				suma += t[i];
			}
			
			// asignar a posición de array resultado[] en cuestión la suma de los nums consecutivos segun numElementos
			resultado[i] = suma;
			
			// reiniciar variable suma -> siguiente posición
			suma = 0;
			
		}
		
		// devolver tabla
		return resultado;
		
	}
	
}
