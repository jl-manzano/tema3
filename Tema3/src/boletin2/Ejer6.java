package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejer6 {
	public static void main(String[] args) {
		
		// crear array de tamaño 6
		int arrayGanadora[] = {4, 10, 18, 22, 24, 38};
		
		// crear array de tamaño 6
		int arrayApuesta[] = new int[6];
		
		// crear clase random
		Random rand = new Random();
		
		// variable -> almacenar valor aleatorio generado
		int aleat;
		
		// variable -> almacenar contador
		int contador = 0;
		
		// variable -> buscar en la tabla si existe ya un num
		int busqueda;
		
		// variable -> almacenar numAciertos
		int numAciertos = 0;
		
		// crear bucle for -> asignar valor aleatorio entre 0 y 99
		while (contador < 6) {
			
			// generar num aleatorio entre 1 y 49 incluidos
			aleat = rand.nextInt(1, 50);
			
			// ordenar array -> dado que búsqueda binaria se lleva a cabo cuando la tabla está ordenada
			Arrays.sort(arrayApuesta);
						
			// buscar en la tabla array apuesta si el num aleatorio ya existe
			busqueda = Arrays.binarySearch(arrayApuesta, aleat);
			
			// si ya existe, busqueda devolverá un valor positivo; si es único, un valor negativo
			if (busqueda < 0) { // entra si el num aleatorio generado no existe en la tabla
				
				// asignar num aleatorio generado a posicion 0 del array -> inicizalizar a 0 y no a posición 'i' debido al uso de búsqueda binaria
				arrayApuesta[0] = aleat;
								
				// incrementar en 1 el contador
				contador++;
			}
						
		}

		
		// bucle for -> comparar Apuesta con Combinación Ganadora
		for (int valor : arrayApuesta) {
			
			// buscar en la tabla array si el num aleatorio ya existe
			busqueda = Arrays.binarySearch(arrayGanadora, valor);
			
			// si ya existe, incrementará en 1 el num aciertos, debido a que ha acertado un num de la combinación ganadora
			if (busqueda >= 0) {
				
				//incrementa en 1 el numAciertos 
				numAciertos++;
			}
		}
		
		// mostrar en pantalla números apostados
		System.out.println("Números apostados: " + Arrays.toString(arrayApuesta));

		// mostrar en pantalla número de aciertos
		System.out.println("Número de aciertos: " + numAciertos);
		
	}
}
