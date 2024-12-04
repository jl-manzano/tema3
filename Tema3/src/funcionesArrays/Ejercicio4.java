package funcionesArrays;

public class Ejercicio4 {

	public static boolean esMagica(int[][] tabla) {
		
		boolean magica = true;
		
		int sumaReferencia = 0;
		int sumaFila = 0;
		int sumaCol = 0;

		//Sumar la prima fila como referencia
		for (int j = 0; j < tabla.length; j++) {
			sumaReferencia = sumaReferencia + tabla[0][j];
		}
		
		//Bucle horizontal desde la primera fila
		for (int i = 1; i < tabla.length; i++) {
			//Para cada fila la suma de filas es cero
			sumaFila = 0;
			
			//Para cada fila recorremos cada columna de la matriz
			for (int j = 0; j < tabla[i].length; j++) {
				//Sumo los valores de la fila
				sumaFila = sumaFila + tabla[i][j];	
			}
			
			//Si la suma es distinta de la suma de referencia
			if (sumaFila != sumaReferencia) {
				magica = false;
			}
		}
		
		//Si al sumar las filas tengo que la matriz sigue siendo magica
		//No es necesario revisarlo si la suma de las filas no coincide
		if (magica == true) {
			//Bucle horizontal, por columna y fila
			for (int j = 0; j < tabla[0].length; j++) {
				//Para cada columna la suma de columna es cero
				sumaCol = 0;
				
				//Para cada columna recorremos cada fila de la matriz
				for (int i = 0; i < tabla.length; i++) {
					//Sumo los valores de la fila
					sumaCol = sumaCol + tabla[i][j];	
				}
			}
			
			//Si la suma es distinta de la suma de referencia
			if (sumaCol != sumaReferencia) {
				magica = false;
			}
		}
		
		return magica;
	}
	
	public static void main(String[] args) {
		//Inicializamos la matriz
		int[][] tabla = {{4, 9, 2},
						 {3, 6, 7},
						 {8, 1, 6}};
		
		System.out.println(esMagica(tabla));
	}

}
