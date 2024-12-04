package arraysUnidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	static final int MAX = 10;
	
	public static void main(String[] args) {
		//Objeto Random para los numeros aleatorios
		Random random = new Random();
		
		//Crear array de longitud 10
		int[] numeros = new int[MAX];
		
		//Bucle de longitud 10
		for (int i = 0; i < MAX; i++) {
			//Asigno en la posicion i el numero aleatorio
			numeros[i] = random.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(numeros));
	}

}
