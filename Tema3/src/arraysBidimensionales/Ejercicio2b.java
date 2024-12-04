package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {
		
		//Objeto Scanner para leer de teclado
		Scanner teclado = new Scanner(System.in);
		
		//Matriz para guardar las notas
		double[][] notas = new double[4][5];
		
		//Variables para el valor maximo y minimo
		double maximo, minimo;
		
		//Variabla para la suma de notas
		double suma;
		
		
		//Bucle para guardar las notas en la matriz
		for (int i = 0; i < notas.length; i++) {

			//Para cada fila recorremos cada columna de la matriz
			for (int j = 0; j < notas[i].length; j++) {
				//Para cada iteracion pedimos la nota
				System.out.println("Introduce nota Alumno " + (i + 1) + " nota " +  (j + 1));
				notas[i][j] = teclado.nextDouble();
			}
		}
		
		//Bucle para calcular los resultados que se piden
		for (int i = 0; i < notas.length; i++) {

			//Para cada alumno calculamos su maxima y minima nota
			//Se inicializa para cada uno antes de empezar
			maximo = Double.MIN_VALUE;
			minimo = Double.MAX_VALUE;
			
			//Para cada alumno también se inicializa la suma
			suma = 0;
			
			//Para cada fila recorremos cada columna de la matriz
			for (int j = 0; j < notas[i].length; j++) {
				
				//Una vez se conoce la nota, comprobamos si es mayor que el maximo guardado
				//o menor que el minimo guardado
				if (notas[i][j] > maximo) {
					maximo = notas[i][j];
				}
				
				if (notas[i][j] < minimo) {
					minimo = notas[i][j];
				}
				
				//Sumamos la nota
				suma = suma + notas[i][j];
			}
			
			//Una vez ha finalizado el bucle mostramos el resultado para ese alumno
			System.out.println("Alumno " + (i + 1));
			System.out.println("Nota minima: " + minimo);
			System.out.println("Nota maxima: " + maximo);
			System.out.println("Nota media: " + suma / 5);
		}
	}
}