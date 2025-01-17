package boletin5;

public class Ejer2 {
	public static void main(String[] args) {

		// crear tabla
		int tabla[][] = { { 1, 2, 3, 4 }, 
						  { 1, 2, 3, 4 }, 
						  { 1, 2, 3, 4 }, 
						  { 1, 2, 3, 4 } };

		// tabla para almacenar resultado
		int tablaRes[][];

		// almacenar resultado
		tablaRes = tablaTransposicion(tabla);

		// mostrar tabla de forma bonita
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}

			System.out.print("|| \t");

			// mostrar tabla transposicionada de forma bonita
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tablaRes[i][j] + "\t");// tablaTransposicionada[j][i] = t[i][j];
			}

			// salto de línea
			System.out.println();
		}

	}

	static int[][] tablaTransposicion(int t[][]) {

		// crear tabla
		int tablaTransposicionada[][] = new int[t[0].length][t.length];

		// bucle for -> recorrer columnas
		for (int j = 0; j < t[0].length; j++) {
			
			// bucle for -> recorrer filas y almacenar valores transposicionados
			for (int i = 0; i < t.length; i++) {
				tablaTransposicionada[j][i] = t[i][j];
			}
		}

		// devolver tabla transposicionada
		return tablaTransposicionada;
	}
}
