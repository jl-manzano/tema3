package boletintiposarrays;

import java.util.Arrays;

public class Ejer4 {
	public static void main(String[] args) {
		
		// crear tabla
		int tabla[] = {19, 4, 795, 44, 149, 22, 98};
		
		// ordenar tabla de menor a mayor
		Arrays.sort(tabla);
		
		// mostrar contenido tabla ordenado de menor a mayor
		System.out.println(Arrays.toString(tabla));
	}
}
