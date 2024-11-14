package boletin3;

public class Ejer4 {
	public static void main(String[] args) {
		
		// crear tabla 10 filas x 10 columnas
		int tabla[][] = new int[10][10];
		
		// bucle for -> recorrer filas
		for (int i = 0; i < tabla.length; i++) {
			
			// bucle for -> recorrer columnas
			for (int j = 0; j < tabla[i].length; j++) {
				
				// calcular y asignar resultado a posición en cuestión de la tabla
				tabla[i][j] = (i + 1) * (j + 1); 
			}
			
		}
		
		// bucle for anidado -> mostrar tabla de forma bonita
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Tabla del " + (i+1) + "\t");
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			
			// salto de línea
			System.out.println();
		}

	}
}
