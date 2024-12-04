package arraysBidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Matriz para guardar las notas
		int[][] numeros = new int[4][5];
		
		//Objeto para generar numero aleatorios
		Random random = new Random();
		
		//Variables que suma las filas, las columnas, y el total
		int sumaFila = 0;
		int sumaCol = 0;
		int sumaTotal = 0;
		
		//Bucle para guardar las notas en la matriz
		for (int i = 0; i < numeros.length; i++) {

			//Para cada fila recorremos cada columna de la matriz
			for (int j = 0; j < numeros[i].length; j++) {
				//Guardar un numero entero entre 100 y 999
				numeros[i][j] = random.nextInt(900) + 100;
			}
		}
		
		//Bucle horizontal, por fila y columna
		for (int i = 0; i < numeros.length; i++) {
			//Para cada fila la suma de filas es cero
			sumaFila = 0;
			
			//Para cada fila recorremos cada columna de la matriz
			for (int j = 0; j < numeros[i].length; j++) {
				
				//Muestro el valor de la matriz
				System.out.print(numeros[i][j] + "\t");
				
				//Sumo los valores de la fila
				sumaFila = sumaFila + numeros[i][j];
				
				//Sumar el total
				sumaTotal = sumaTotal + numeros[i][j];
				
			}
			//Muestro el total de las filas antes del salto de linea
			System.out.print(sumaFila);
			System.out.println();
		}
		
		//Bucle vertical por columna y fila
		for (int j = 0; j < numeros[0].length; j++) {
			//Para cada fila la suma de filas es cero
			sumaCol = 0;
			
			//Para cada fila recorremos cada columna de la matriz
			for (int i = 0; i < numeros.length; i++) {
				//Sumo los valores de la fila
				sumaCol = sumaCol + numeros[i][j];
			}
			//Muestro el total de las filas antes del salto de linea
			System.out.print(sumaCol + "\t");
			
		}
		//Mostramos el total al final del todo
		System.out.println(sumaTotal);
	}

}
