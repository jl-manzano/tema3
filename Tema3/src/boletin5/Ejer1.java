package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
        // crear tabla de 6 filas x 10 col
        int[][] tabla = new int[6][10];
       
        // crear clase random
        Random rand = new Random();

        // bucle for -> recorrer filas
        for (int i = 0; i < tabla.length; i++) {
        	
        	// bucle for -> recorrer columnas -> rellenar tabla con numeros aleatorios entre 0 y 1000 inclusives
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = rand.nextInt(0, 1001);
            }
        }
        
        // mostrar resultado sin necesidad de almacenar en una variable
        System.out.println(Arrays.toString(minMax(tabla)));
        
        
	}
	 
	static int[] minMax (int t[][]) {
		
		// crear tabla
		int tabla[] = new int[2];
		
		// variable -> minimo
		int min = Integer.MAX_VALUE;
		
		// variable -> max
		int max = Integer.MIN_VALUE;
		
		// bucle for -> recorrer filas
		for (int i = 0; i < t.length; i++) {
			// bucle for -> recorrer columnas
			for (int j = 0; j < t[i].length; j++) {
				
				// definir condicional if -> comprobar si el num contenido en la posición en cuestión es < min
				if (t[i][j] < min) {
					min = t[i][j];
				}
				
				// definir condicional if -> comprobar si el num contenido en la posición en cuestión es > max
				if (t[i][j] > max) {
					max = t[i][j];
				}
			}
		}
		
		// asignar valor min a posicion 0
		tabla[0] = min;
		
		// asignar valor max a posicion 1
		tabla[1] = max;
		
		// devolver tabla
		return tabla;
	}
	
}
