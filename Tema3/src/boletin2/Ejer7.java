package boletin2;

import java.util.Arrays;

public class Ejer7 {
	public static void main(String[] args) {
		
		// crear array de tamaño 55
		int array[] = new int[55];
		
		// variable para almacenar indice desde el que se empieza
		int inicio = 0;
		
		// bucle for -> asignar a la posición en cuestión del array el valor correspondiente
		for (int i = 1; i <= 10; i++) {
			
			// uso método Arrays.fill (nombreTabla, índiceDesde, índiceHasta, valor inicialización
			Arrays.fill(array, inicio, inicio + i,  i);
			
			// sumar y asignar valor 'i' a variable inicio
			inicio += i;
		}
		
		// imprimir contenido tabla
		System.out.println(Arrays.toString(array));
		
	}
}
