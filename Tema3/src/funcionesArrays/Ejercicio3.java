package funcionesArrays;

public class Ejercicio3 {

	public static boolean simetrica(int[][] matriz) {
		
		//Crear la variable resultado para devolver
		boolean esSimetrica = true;
		
		//Bucle que recorre la matriz traspuesta por sus filas y columnas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Si el elemento i,j es distinto de j,i
				if (matriz[i][j] != matriz[j][i]) {
					esSimetrica = false;
				}
			}
		}
		
		return esSimetrica;
	}
	
	public static void main(String[] args) {
		//Inicializamos la matriz
		int[][] tabla = {{1, 2, 3},
						 {2, 4, 5},
						 {3, 5, 6}};
		
		System.out.println(simetrica(tabla));
	}
}
