package arraysUnidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	static final int MAX = 10;
	
	public static void main(String[] args) {

		//Objeto Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		//Crear array de longitud 10
		int[] numeros = new int[MAX];
		
		//Bucle de longitud 10
		for (int i = 0; i < MAX; i++) {
			//Pedir diez numeros por teclado
			System.out.println("Introduce el numero: ");
			numeros[i] = sc.nextInt();
		}

		//Mostrar el array en orden normal
		System.out.println(Arrays.toString(numeros));
		
		//Bucle que recorra el array al reves
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}
}