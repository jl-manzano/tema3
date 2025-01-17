package buscaminas;

import java.util.Scanner;
import java.util.Random;

public class BuscaMina {

	static Scanner sc = new Scanner(System.in);
	static final char MINA = '*';
	static final char VACIO = '-';
	static final char DESCUBIERTO = ' ';
	static int filas;
	static int columnas;
	static int minas;

	public static void main(String[] args) {

		// Solicitar la configuración inicial
		System.out.println("¡Bienvenido al Buscaminas!");
		// Solicitar el número de filas, columnas y minas
		System.out.print("Introduce el número de filas: ");
		filas = sc.nextInt();
		System.out.print("Introduce el número de columnas: ");
		columnas = sc.nextInt();
		System.out.print("Introduce el número de minas: ");
		minas = sc.nextInt();

		// Inicializar el tablero
		char[][] tablero = new char[filas][columnas];
		inicializarTablero(tablero);

		// Colocar las minas en el tablero
		colocarMinas(tablero);

		// Empezar el juego
		jugar(tablero);
	}

	static void jugar(char[][] tablero) {
		boolean juegoActivo = true;

		while (juegoActivo) {
			mostrarTablero(tablero);
			System.out.print("Introduce fila y columna (separados por espacio): ");
			int fila = sc.nextInt();
			int columna = sc.nextInt();

			if (tablero[fila][columna] == MINA) {
				System.out.println("¡Has pisado una mina! Game Over.");
				juegoActivo = false;
			} else {
				descubrir(tablero, fila, columna);
				if (ganar(tablero)) {
					System.out.println("¡Felicidades! Has ganado.");
					juegoActivo = false;
				}
			}
		}
	}

	static void inicializarTablero(char[][] tablero) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tablero[i][j] = VACIO; // Todas las celdas inician vacías
			}
		}
	}

	static void mostrarTablero(char[][] tablero) {
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            if (tablero[i][j] == DESCUBIERTO) {
	                System.out.print(contarMinasAlrededor(tablero, i, j) + " ");
	            } else {
	                System.out.print(VACIO + " "); // Muestra el tablero oculto con VACIO ('-')
	            }
	        }
	        System.out.println();
	    }
	}


	static void descubrir(char[][] tablero, int fila, int col) {
	    boolean celdaValida = true;

	    // Verificar si la celda está dentro de los límites
	    if (fila < 0 || fila >= filas || col < 0 || col >= columnas) {
	        celdaValida = false;
	    }

	    // Verificar si la celda ya ha sido descubierta
	    if (celdaValida && tablero[fila][col] != VACIO) {
	        celdaValida = false;
	    }

	    // Si la celda es válida, la descubrimos
	    if (celdaValida) {
	        tablero[fila][col] = DESCUBIERTO;

	        // Lógica para descubrir más celdas si no hay minas alrededor
	        if (contarMinasAlrededor(tablero, fila, col) == 0) {
	            for (int i = -1; i <= 1; i++) {
	                for (int j = -1; j <= 1; j++) {
	                    // Llamar a descubrir solo si es una celda válida
	                    if (fila + i >= 0 && fila + i < filas && col + j >= 0 && col + j < columnas) {
	                        descubrir(tablero, fila + i, col + j);
	                    }
	                }
	            }
	        }
	    }
	}


	static void colocarMinas(char[][] tablero) {
		Random rand = new Random();
		int minasColocadas = 0;

		while (minasColocadas < minas) {
			int fila = rand.nextInt(filas);
			int columna = rand.nextInt(columnas);

			if (tablero[fila][columna] != MINA) {
				tablero[fila][columna] = MINA;
				minasColocadas++;
			}
		}
	}

	static int contarMinasAlrededor(char[][] tablero, int fila, int col) {
		int contador = 0;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int nuevaFila = fila + i;
				int nuevaColumna = col + j;

				if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
					if (tablero[nuevaFila][nuevaColumna] == MINA) {
						contador++;
					}
				}
			}
		}

		return contador;
	}

	static boolean ganar(char[][] tablero) {
	    boolean quedanCeldasPorDescubrir = false;

	    // Recorremos todas las celdas del tablero
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            // Si encontramos una celda que no ha sido descubierta y no tiene mina
	            if (tablero[i][j] == VACIO) {
	                quedanCeldasPorDescubrir = true;
	            }
	        }
	    }

	    // Al final del bucle, devolvemos el valor de quedanCeldasPorDescubrir
	    return !quedanCeldasPorDescubrir; // Si no quedan celdas por descubrir, el jugador gana
	}

}
