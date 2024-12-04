package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Crear el array en memoria para 12 posiciones
		int[] num = new int[12];
		
		//Manualmente añadir los valores
		num[0] = 39;
		num[1] = -2;
		num[4] = 0; //Al inicializar el array el valor ya es 0
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		//Mostrar 
		System.out.println(Arrays.toString(num));

	}

}
