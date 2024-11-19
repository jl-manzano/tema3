package boletin4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		
		System.out.println("Introduzca un número positivo: ");
		int longitud = comprobarValores();
		System.out.println("Longitud" + longitud);
	}

	static int comprobarValores() {
		
		Scanner sc = new Scanner(System.in);
		int dato = -1;
		do {
			try {
				System.out.println("Introduzca un número positivo: ");
				dato = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un entero positivo.");
			} finally {
				sc.nextLine();
			}
		} while (dato < 0);
		
		return dato;
	}
}
