package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio5 {
	
	static final int MAX = 10;
	
	public static void main(String[] args) {
		//Objeto Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		//Crear array de longitud 10
		double[] numeros = new double[MAX];
		
		//Variable para la suma de todos los numeros
		double suma = 0;
		
		//Variable que guarda el maximo y el minimo
		double maximo = Double.MIN_VALUE;
		double minimo = Double.MAX_VALUE;
		
		//Bucle de longitud 10
		for (int i = 0; i < MAX; i++) {
			//Pedir diez numeros por teclado
			System.out.println("Introduce el numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		//Volvemos a recorrer el array para sumar
		for (int i = 0; i < MAX; i++) {
			//Sumamos los valores
			suma = suma + numeros[i];  //suma += numeros[i];
			
			//Si el valor del elemento i del array numeros 
			//es mayor que el maximo guardado hasta el momento
			if (numeros[i] > maximo) {
				//Actualizamos el maximo
				maximo = numeros[i];
			}
			
			//Si el valor del elemento i del array numeros 
			//es menor que el minimo guardado hasta el momento
			if (numeros[i] < minimo) {
				//Actualizamos el mínimo
				minimo = numeros[i];
			}
		}
		
		//Cuando hemos terminado todos los bucles mostramos el resultado
		System.out.println("Suma: " + suma);
		System.out.println("Minimo: " + minimo);
		System.out.println("Máximo: " + maximo);
	}

}
