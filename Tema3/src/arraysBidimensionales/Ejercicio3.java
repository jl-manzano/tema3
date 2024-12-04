package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Objeto Scanner para leer de teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedir al usuario el número de filas y de columnas
		System.out.println("Introduce numero filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce numero columnas");
		int columnas = teclado.nextInt();
		
		//Ya conocemos el numero de filas y de columnas que tendrá la matriz
		//Declaramos la matriz
		int[][] matriz = new int[filas][columnas];
		
		//Rellenamos matriz con los valores según la formula
		for (int i = 0; i < matriz.length; i++) {
			//Para cada fila hacemos un bucle según la longitud de esa fila
			for (int j = 0; j < matriz[i].length; j++) {
				//El elemento [i][j] debe tener el valor 10*i + j
				matriz[i][j] = 10 * i + j;
			}
		}
		
		//Bucle para las filas
		for (int i = 0; i < matriz.length; i++) {
			//Para cada fila bucle para las columnas
			for (int j = 0; j < matriz[i].length; j++) {
				//Mostramos el valor del elemento de la posicion i,j
				System.out.print(matriz[i][j] + " ");
			}
			
			//Cuando acaba de mostrar todas las columnas muestro un salto de linea
			//para la siguiente fila
			System.out.println();
			
		}
	}
}
