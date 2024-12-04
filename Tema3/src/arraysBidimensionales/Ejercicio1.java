package arraysBidimensionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[][] num = new int[3][6];
		
		//Manualmente asignamos los valores a las posiciones de la matriz
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		//Bucle para las filas
		for (int i = 0; i < num.length; i++) {
			//Para cada fila bucle para las columnas
			for (int j = 0; j < num[i].length; j++) {
				//Mostramos el valor del elemento de la posicion i,j
				System.out.print(num[i][j] + " ");
			}
			
			//Cuando acaba de mostrar todas las columnas muestro un salto de linea
			//para la siguiente fila
			System.out.println();
			
		}
	}
}
