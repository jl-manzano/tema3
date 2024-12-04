package funcionesArrays;

public class Ejercicio5 {

	public static int[][] gira90(int[][] tablaInicio){
		
		//Crear matriz resultado con el mismo numero de filas y columnas que la de inicio
		int[][] resultado = new int[tablaInicio.length][tablaInicio.length];
		
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
					
					//La columna de la tabla inicio es la fila de la tabla resultado
					resultado[j][tablaInicio.length - i - 1] = tablaInicio[i][j];
			}
		}
		return resultado;
	}
	
	public static void mostrarMatriz(int[][] tabla) {
		
		//Bucle que recorre matriz por filas y columnas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = {{1, 2, 3}, 
						  {4, 5, 6}, 
						  {7, 8, 9}};
		
		mostrarMatriz(matriz);
		
		int[][] matrizGirada = gira90(matriz);

		System.out.println();
		mostrarMatriz(matrizGirada);
	}

}
