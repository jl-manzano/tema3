package boletin5;

public class Ejer3 {

	public static void main(String[] args) {

		// crear tabla simetrica
		int tabla1[][] = { { 1, 2, 3 }, 
						   { 2, 4, 5 }, 
						   { 3, 5, 6 } };

		// crear tabla no simetrica
		int tabla2[][] = { { 1, 2, 3 }, 
				           { 4, 5, 6 }, 
				           { 7, 8, 9 } };

		
		// mostrar resultado
		if (esSimetrica(tabla1)) {
			System.out.println("La matriz 1 es simétrica.");
		} else {
			System.out.println("La matriz 1 no es simétrica.");
		}
		
		// mostrar resultado
		if (esSimetrica(tabla2)) {
			System.out.println("\nLa matriz 2 es simétrica.");
		} else {
			System.out.println("\nLa matriz 2 no es simétrica.");
		}

	}

	static boolean esSimetrica(int t[][]) {

		// variable -> almacenar booleano
		boolean simetrica = true;

		// comprobar si la matriz no es cuadrada
		if (t.length != t[0].length) {
			simetrica = false;
		}
		
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
