package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear tabla
		int tabla[] = { 1, 22, 24, 34, 1, 1, 7 };

		// variable -> almacenar num
		int num;
		
		// crear tabla -> almacenar resultadoBusqueda
		int resultadoBusq[];
		
		// pedir num a usuario
		System.out.println("Introduce un número para comprobar en qué posiciones de la tabla se encuentra: ");

		// leer num introducido por usuario
		num = sc.nextInt();

		// realizar búsqueda de num y asignar resultado 'posición' donde se encuentra el num en tabla en la nueva tabla
		resultadoBusq = buscarTodos(tabla, num);
		
		// mostrar contenido tabla
		System.out.println("\nMostraré la tabla con los números que están almacenados en cada una de sus posiciones:\n" + Arrays.toString(tabla));
		
		
		// mostrar resultadoBusq en pantalla
		System.out.println("RESULTADO BÚSQUEDA:\n" + Arrays.toString(resultadoBusq));
		
		// cerrar scanner
		sc.close();
		
	}

	static int[] buscarTodos(int t[], int valor) {

		// determinar tamaño tabla -> mediante el numVeces que se encuentra el num en tabla
		int tam = numVeces(t, valor);

		// crear tabla de longitud 'tam'
		int tablaPos[] = new int[tam];
		
		// variable -> almacenar indice donde se encuentra contenido 'num' en tabla
		int indice = 0;
		
		// bucle for -> recorrer tabla 't'
		for (int i = 0; i < t.length; i++) {
			
			// definir condicional if -> comprobar si num se encuentra en posicion en cuestion en tabla
			if (t[i] == valor) {
				// asignar valor 'i' (posición) a posición tabla nueva
				tablaPos[indice] = i;
				// incrementar en 1 variable indice
				indice++;
			}
		}
		
		// devolver tabla
		return tablaPos;
		
	}

	static int numVeces(int t[], int valor) {

		// variable contador
		int cont = 0;
		
		// bucle for-each -> recorrer tabla
		for (int contenido : t) {
			
			// definir condicional -> comprobar numVeces que num se encuentra contenido en tabla
			if (contenido == valor) {
				cont++;
			}
		}
		
		// devolver contador
		return cont;

	}

}
