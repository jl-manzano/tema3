package boletin5;

public class Ejer3 {

	public static void main(String[] args) {

		// crear tabla
		int tabla[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };


	}

	static boolean tablaTransposicion(int t[][]) {

		// crear tabla
		int tablaTransposicionada[][] = new int[t[0].length][t.length];

		//
		boolean simetrica = false;

		// bucle for -> recorrer columnas
		for (int i = 0; i < t.length; i++) {

			// bucle for -> recorrer filas y almacenar valores transposicionados
			for (int j = 0; j < t[i].length && simetrica; j++) {
				if (t[i][j] != t[j][i]) {

				} else {
					simetrica = false;
				}
			}

		}
	}

}
