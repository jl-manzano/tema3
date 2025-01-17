package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		
		// crear clase random
		Random rand = new Random();
		
		// variable para almacenar números aleatorios
		int aleat;
		
		// construir tabla
		int tabla[] = new int[10];
		
		// crear bucle for -> almacenar números aleatorios entre 1 y 100 y guardarlos en tabla
		for (int i = 0; i < tabla.length; i++) {
			
			// generar número aleatorio entre 1 y 100
			aleat = rand.nextInt(1, 101);
			
			// almacenar número aleatorio en posición de tabla
			tabla[i] = aleat;
		}
		
		// imprimir array contenido array en pantalla
		System.out.println(Arrays.toString(tabla));
	}
}
