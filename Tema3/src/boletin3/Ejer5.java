package boletin3;

import java.util.Random;

public class Ejer5 {
	public static void main(String[] args) {
		
		// crear tabla 4 filas x 5 columnas
		int tabla[][] = new int[4][5];
		
		// variable para almacenar suma parcial
		int sumaParcial = 0;
		
		// variable para almacenar suma total
		int total = 0;
		
		// crear clase random
		Random rand = new Random();
		
		// bucle for -> recorrer filas
		for (int i = 0; i < tabla.length; i++) {
			
			// bucle for -> recorrer columnas y generar nºos aleatorios
			for (int j = 0; j < tabla[i].length; j++) {
				
				// generar num aleatorio entre 100 y 999 incluidos
				tabla[i][j] = rand.nextInt(100, 1000);
			}

		}
		
		// bucle for anidado -> mostrar tabla de forma bonita
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
				
				// sumar y asignar numºs aleatorios a variable sumaParcial
				sumaParcial += tabla[i][j]; 
				
				// definir condicional if -> mostrar suma parcial
				if (j == (tabla[i].length - 1)) {
					System.out.println(sumaParcial);
					// sumar y asignar sumaParcial a variable total
					total += sumaParcial;
				}
			}
			
			// reiniciar variable sumaParcial a 0
			sumaParcial = 0;
			System.out.println();
		}
		
		// bucle for -> recorrer columnas
		for (int j = 0; j < tabla[0].length; j++) {
			
			// reiniciar variable sumaParcial a 0
			sumaParcial = 0;
			
			// bucle for -> recorrer filas
			for (int i = 0; i < tabla.length; i++) {
				
				// sumar y asignar numºs aleatorios por columna a variable sumaParcial
				sumaParcial += tabla[i][j];
			}
			
			// sumar y asignar sumaParcial a variable total
			total += sumaParcial;
			
			// imprimir contenido variable sumaParcial
			System.out.print(sumaParcial + "\t");
		}
		
		// imprimir contenido variable total
		System.out.println("TOTAL -> " + total);
	}
}
