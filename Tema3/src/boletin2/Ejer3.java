package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		
		// crear tabla
		int tabla[] = new int[30];

		// variable para almacenar num aleatorio generado entre 1 y 10
		int aleat;
		

		// crear clase random
		Random rand = new Random();

		// crear bucle for -> rellenar tabla con valores enteros aleatorios entre 1 y 10
		for (int i = 0; i < tabla.length; i++) {

			// generar num aleat entre 0 y 9 incluidos
			aleat = rand.nextInt(0, 10);

			// asignar a posicion de tabla en cuestión num aleatorio generado
			tabla[i] = aleat;

		}
		
		// ordenar valores array
		Arrays.sort(tabla);
		
		// mostrar pantalla valores array
		System.out.println(Arrays.toString(tabla));
		
	}
}
