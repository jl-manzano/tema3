package boletin5;

import java.util.Arrays;

public class Ejer2 {
	public static void main(String[] args) {
		
		// crear tabla
		int tabla[][] = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		
		// tabla para almacenar resultado
		int tablaRes[][];
		
		tablaRes = tablaTransposicion(tabla);
		
		System.out.println(Arrays.deepToString(tablaRes));
		
		for (int i = 0; i < tablaRes.length; i++) {
			for (int j = 0; j < tablaRes[i].length; j++) {
				System.out.println(Arrays.toString();// tablaTransposicionada[j][i] = t[i][j];
			}
		}
	}
	
	static int[][] tablaTransposicion(int t[][]) {
		
		// crear tabla
		int tablaTransposicionada[][] = new int[t[0].length][t.length];
		
		for (int j = 0; j < t[0].length; j++) {
			for (int i = 0; i < t.length; i++) {
				tablaTransposicionada[j][i] = t[i][j];
			}
		}
		
		return tablaTransposicionada;
	}
}
