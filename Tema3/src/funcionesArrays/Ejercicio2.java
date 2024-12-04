package funcionesArrays;

public class Ejercicio2 {

	public static int[][] traspuesta(int[][] matriz) {
		
		//Crear la variable resultado para devolver
		int[][] matTraspuesta = new int[matriz[0].length][matriz.length];
		
		//Bucle que recorre la matriz traspuesta por sus filas y columnas
		for (int i = 0; i < matTraspuesta.length; i++) {
			for (int j = 0; j < matTraspuesta[i].length; j++) {
				//Asignar al elemento i,j de la traspuesta el valor j,i de la original
				matTraspuesta[i][j] = matriz[j][i];
			}
		}
		
		return matTraspuesta;
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Inicializar una matriz
		int[][] matriz = {{1, 2, 3, 4},
						  {5, 6, 7, 8}, 
						  {9, 10, 11, 12}, 
						  {13, 14, 15, 16},
						  {17, 18, 19, 20}};
		
		//Crear la traspuesta y asignarla al valor que devuelve la funcion
		int[][] trasp = traspuesta(matriz);
		
		mostrarMatriz(trasp);
	}

}
