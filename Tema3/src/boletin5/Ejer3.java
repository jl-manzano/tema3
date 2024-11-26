package boletin5;

public class Ejer3 {

	public static void main(String[] args) {

		// crear tabla
		int tabla[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		// mostrar resultado
		if (esSimetrica(tabla)) {
			System.out.println("La matriz es simétrica.");
		} else {
			System.out.println("La matriz no es simétrica");
		}

	}

	static boolean esSimetrica(int t[][]) {

		// variable -> almacenar booleano
		boolean simetrica = true;

		// bucle for -> recorrer columnas
		for (int i = 0; i < t.length; i++) {

			// bucle for -> recorrer filas y almacenar valores transposicionados
			for (int j = 0; j < t[i].length && simetrica; j++) {
				if (t[i][j] != t[j][i]) {
					simetrica = false;
				}
			}

		}
		
		// devolver resultado
		return simetrica;
		
	}

}
