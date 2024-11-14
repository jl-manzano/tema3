package boletin3;

import java.util.Arrays;

public class Ejer1 {
	public static void main(String[] args) {

		// crear tabla 3 filas x 6 columnas
		int array[][] = new int[3][6];

		// asignar valores a las posiciones correspondientes según tabla 
		array[0][0] = 0;
		array[0][1] = 30;
		array[0][2] = 2;
		array[0][5] = 5;
		array[1][0] = 75;
		array[1][4] = 0;
		array[2][2] = -2;
		array[2][3] = 9;
		array[2][5] = 11;

		// imprimir contenido fila 0
		System.out.println(Arrays.toString(array[0]));

		// imprimir contenido fila 1
		System.out.println(Arrays.toString(array[1]));

		// imprimir contenido fila 2
		System.out.println(Arrays.toString(array[2]));

	}
}
