package boletin5;

public class Ejer4 {
	public static void main(String[] args) {
		// crear tabla
		int tabla1[][] = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };

		// mostrar tabla de forma bonita
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				System.out.print(tabla1[i][j] + "\t");
			}
			// salto de línea
			System.out.println();
		}

		// condicional if - else -> determinar si es mágica o no
		if (esMagica(tabla1)) {
			System.out.println("La tabla es mágica."); // true
		} else {
			System.out.println("La tabla no es mágica."); // false

		}

	}

	static boolean esMagica(int tabla[][]) {

		// variable -> almacenar 'booleano' -> si es magica / no
		boolean magica = true;

		// variable -> almacenar suma primera fila
		int sumaComparar = 0;

		// recorrer primera fila y sumar valores
		for (int j = 0; j < tabla[0].length; j++) {
			sumaComparar += tabla[0][j];
		}

		// variable -> almacenar suma filas
		int sumaFilas = 0;

		// variable -> almacenar suma cols
		int sumaCols = 0;

		System.out.println("\nRESULTADO 1ª SUMA: " + sumaComparar);

		// bucle for -> recorrer filas
		for (int i = 1; i < tabla.length; i++) {
			
			// reiniciar suma a 0
			sumaFilas = 0;
			
			// bucle for -> recorrer cols
			for (int j = 0; j < tabla[i].length; j++) {
				
				// sumar y asignar valor de la posición en cuestión a variable sumaFilas
				sumaFilas += tabla[i][j];

			}
			
			// comparar sumaFilas en cuestión con suma 1ª fila
			if (sumaFilas != sumaComparar) {
				magica = false;
			}

		}

		// bucle for -> recorrer cols
		for (int j = 0; j < tabla[0].length; j++) {

			// reiniciar suma a 0
			sumaCols = 0;
			
			// bucle for -> recorrer filas
			for (int i = 0; i < tabla.length; i++) {
				
				// sumar y asignar valor de la posición en cuestión a variable sumaCols
				sumaCols += tabla[i][j];

			}
			
			// comparar sumaCols en cuestión con suma 1ª fila
			if (sumaCols != sumaComparar) {
				magica = false;
			}
			
		}

		// devolver resultado
		return magica;

	}

}
