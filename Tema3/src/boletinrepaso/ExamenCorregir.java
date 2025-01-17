package boletinrepaso;

import java.util.Random;
import java.util.Scanner;

public class ExamenCorregir {
	// crear clase scanner -> pueda ser accedida en cualquier parte del código
	static Scanner sc = new Scanner(System.in);

	// constante para almacenar guion -> pueda ser accedida en cualquier parte del
	// código
	static final char GUION = '-';

	// constante para almacenar A -> pueda ser accedida en cualquier parte del
	// código
	static final char A = 'A';

	// constante para almacenar B -> pueda ser accedida en cualquier parte del
	// código
	static final char B = 'B';

	public static void main(String[] args) {

		// crear array
		char tableroJuego[][];

		// crear array jugador1
		char tableroJugador1[][];

		// crear array jugador2
		char tableroJugador2[][];
		
		// crear tablero actual
		char tableroActual[][];

		// variable para almacenar filas
		int filas;

		// variable para almacenar cols
		int cols;

		// variable para almacenar numBarcos
		int numBarcos;

		// variable para almacenar turno
		int turno = 1;

		// variable -> almacenar contador barcos derribados jug1
		int contJ1 = 0;

		// variable -> almacenar contador barcos derribados jug2
		int contJ2 = 0;

		// variable -> almacenar boolean
		boolean descubrirBarcos = false;

		System.out.println("BIENVENIDO AL HUNDIR LA FLOTA");

		// pedir filas a usuario
		System.out.println("Introduzca el número de filas de su tablero: ");

		// leer num filas introducida por usuario
		filas = sc.nextInt();

		// pedir cols a usuario
		System.out.println("Introduzca el número de columnas de su tablero: ");

		// leer num cols introducida por usuario
		cols = sc.nextInt();

		// calcular numBarcos a generar -> hacer cast, debido a que metodo math trabaja
		// con double
		numBarcos = (int) (Math.sqrt(filas * cols));
		System.out.println("\nNúmero Barcos: " + numBarcos);
		System.out.println("TABLERO JUEGO\n");

		tableroJuego = creaTablero(filas, cols);
		generarBarquitos(tableroJuego, numBarcos);
		pintaTablero(tableroJuego); // mostrar tablero juego -> probar
		System.out.println();

		tableroJugador1 = inicializaTablero(filas, cols);
		tableroJugador2 = inicializaTablero(filas, cols);

		// bucle while -> control del juego (fin cuando haya ganador)
		do {

			System.out.println("Turno del jugador " + turno);

			tableroActual = (turno == 1) ? tableroJugador1 : tableroJugador2;
			descubrirBarcos = turnoJugador(tableroJuego, tableroActual);

			// condicional if - else if - else -> comprobar si usuario ha acertado y por
			// tanto ha derribado un barco o no y determinar turno
			if (descubrirBarcos) {
				if (turno == 1) {
					contJ1++;

				} else {
					contJ2++;

				}
			}
			
			pintaTablero(tableroActual);
			
			if (!descubrirBarcos) {
			    turno = (turno == 1) ? 2 : 1;
			}

			// salto de línea
			System.out.println();

		} while (contJ1 != numBarcos && contJ2 != numBarcos);

		// MOSTRAR QUIEN HA GANADO
        if (contJ1 == numBarcos) {
            System.out.println("¡El Jugador 1 ha ganado!");
        } else {
            System.out.println("¡El Jugador 2 ha ganado!");
        }
		
	}

	static char[][] inicializaTablero(int filas, int columnas) {

		// crear tablero
		char tableroUsuario[][] = new char[filas][columnas];

		// bucle for anidado -> rellenar con caracter guion medio el tablero

		// bucle for -> recorrer filas
		for (int i = 0; i < tableroUsuario.length; i++) {

			// bucle for -> recorrer columnas
			for (int j = 0; j < tableroUsuario[i].length; j++) {
				tableroUsuario[i][j] = GUION;
			}
		}

		// devolver tablero
		return tableroUsuario;

	}

	static char[][] creaTablero(int filas, int columnas) {

		// crear tablero
		char tablero[][] = new char[filas][columnas];

		// bucle for anidado -> rellenar con caracter A el tablero

		// bucle for -> recorrer filas
		for (int i = 0; i < tablero.length; i++) {

			// bucle for -> recorrer columnas
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = A;
			}
		}

		// devolver tablero
		return tablero;

	}

	static void generarBarquitos(char tablero[][], int numBarquitos) {
		// crear clase random
		Random rand = new Random();

		// variable -> almacenar contador
		int contador = 0;

		// variable -> almacenar columna aleatorio generado
		int filaAleatoria;

		// variable -> almacenar columna aleatorio generado
		int colAleatoria;

		// crear bucle while -> generar barquitos
		while (contador < numBarquitos) {

			// bucle do-while -> generar fila y columna aleatoria
			filaAleatoria = rand.nextInt(tablero.length);
			colAleatoria = rand.nextInt(tablero[0].length);


			// condicional if -> comparar si la posicion generada contiene un guion y añadir
			// barquito o en caso contrario, continuar generando otra posicion
			if (tablero[filaAleatoria][colAleatoria] == A) {

				// asignar letra 'B' -> posición -> almacenar barquito
				tablero[filaAleatoria][colAleatoria] = B;

				// incrementar en 1 variable contador
				contador++;
			}
		}
	}

	static void pintaTablero(char[][] tableroJugador) {

		// bucle for -> imprimir indices de cols -
		for (int i = 0; i < tableroJugador[0].length; i++) {
			System.out.print("\t" + (i + 1));
		}

		// salto de línea
		System.out.println();

		// bucle for -> imprimir indices filas y valores contenidos en la posicion
		// [i][j] del tablero
		for (int i = 0; i < tableroJugador.length; i++) {
			System.out.print((char) (A + i) + "\t");
			for (int j = 0; j < tableroJugador[i].length; j++) {
				System.out.print(tableroJugador[i][j] + "\t");
			}

			// salto de línea
			System.out.println();

		}

	}

	static boolean turnoJugador(char tablero[][], char tableroJugador[][]) {

		// variable para almacenar booleano
		boolean descubierto = false;

		// variable para almacenar filas
		int fila;

		// variable para almacenar cols
		int col;

		// variable para almacenar letraFila
		char letraFila;

		// pedir filas a usuario
		System.out.println("Introduzca la fila: ");

		// leer letra fila introducida por usuario
		letraFila = sc.next().toUpperCase().charAt(0);

		// convertir letra en número -> array
		fila = letraFila - 'A';

		// pedir cols a usuario
		System.out.println("Introduzca el número de columna: ");

		// leer num cols introducida por usuario - 1 -> sea más facil para usuario
		col = sc.nextInt() - 1;

		if (tablero[fila][col] == B) {
			System.out.println("HUNDIDO");
			tableroJugador[fila][col] = B;
			descubierto = true;
		} else if (tableroJugador[fila][col] == GUION) {
			// si la posición aún no había sido descubierta, marca como agua
			System.out.println("AGUA");
			tableroJugador[fila][col] = A;
			descubierto = false; // Esto es opcional porque ya es falso por defecto
		} else {
			// si la posición ya fue intentada
			System.out.println("Ya has intentado esta posición.");
			descubierto = false; // Esto también es opcional
		}

		return descubierto;

	}

}
