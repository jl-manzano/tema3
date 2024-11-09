package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// crear tabla
		int tabla[] = new int[100];
		
		// variable para almacenar un num pedido a usuario
		int num;
		
		// variable para almacenar num aleatorio generado entre 1 y 10
		int aleat;
		
		// crear clase random
		Random rand = new Random();
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
			
			aleat = rand.nextInt(1, 11);
			
			tabla[i] = aleat;
			
			
		}
		
	}
}
