package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// crear array de tamaño 6
		int arrayGanadora[] = {4, 6, 10, 18, 22, 24};
		
		// crear array de tamaño 6
		int arrayApuesta[] = new int[6];
		
		// crear clase random
		Random rand = new Random();
		
		// variable -> almacenar valor aleatorio generado
		int aleat;
		
		// variable boolean
		boolean enc = false;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int busqueda;
		
		// crear bucle for -> asignar valor aleatorio entre 0 y 99
		while (contador < 6) {
			
			// generar num aleatorio entre 1 y 49 incluidos
			aleat = rand.nextInt(1, 50);
			
			// ordenar array
			Arrays.sort(arrayApuesta);
			
			// buscar en la tabla array si el num aleatorio ya existe
			busqueda = Arrays.binarySearch(arrayApuesta, aleat);
			
			// si ya existe, busqueda devolverá un valor positivo; si es único, un valor negativo
			if (busqueda < 0) { // entra si el num aleatorio generado no existe en la tabla
				
				// asignar num aleatorio generado a posicion del array en cuestión
				arrayApuesta[contador] = aleat;
				
				// incrementar en 1 el contador
				contador++;
			}
						
		}
		
		// mostrar contenido array en pantalla -> comprobar después con Ctrl + F
		System.out.println(Arrays.toString(arrayApuesta));


		
	}
}
