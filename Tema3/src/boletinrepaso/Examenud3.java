package boletinrepaso;

import java.util.Random;
import java.util.Scanner;

public class Examenud3 {
    // Crear clase Scanner y constantes
    static Scanner sc = new Scanner(System.in);
    static final char GUION = '-';
    static final char A = 'A';
    static final char B = 'B';

    public static void main(String[] args) {
        char tableroJuego[][], tableroJugador1[][], tableroJugador2[][];
        int filas, cols, numBarcos, turno = 1, contJ1 = 0, contJ2 = 0;
        boolean descubrirBarcos;

        System.out.println("BIENVENIDO AL HUNDIR LA FLOTA");

        // Pedir dimensiones del tablero
        System.out.println("Introduzca el número de filas del tablero: ");
        filas = sc.nextInt();
        System.out.println("Introduzca el número de columnas del tablero: ");
        cols = sc.nextInt();

        // Calcular número de barcos
        numBarcos = (int) (Math.sqrt(filas * cols));
        System.out.println("\nNúmero de barcos: " + numBarcos);

        // Inicializar tableros
        tableroJuego = creaTablero(filas, cols);
        tableroJugador1 = inicializaTablero(filas, cols);
        tableroJugador2 = inicializaTablero(filas, cols);

        // Generar barquitos
        generarBarquitos(tableroJuego, numBarcos);
        System.out.println("Tablero de juego inicial (para prueba):");
        pintaTablero(tableroJuego);

        // Juego
        do {
            System.out.println("\nTurno del jugador " + turno);
            if (turno == 1) {
                descubrirBarcos = turnoJugador(tableroJuego, tableroJugador1);
                if (descubrirBarcos) contJ1++;
                else turno = 2;
                pintaTablero(tableroJugador1);
            } else {
                descubrirBarcos = turnoJugador(tableroJuego, tableroJugador2);
                if (descubrirBarcos) contJ2++;
                else turno = 1;
                pintaTablero(tableroJugador2);
            }

            System.out.println("\nBarcos hundidos: Jugador 1: " + contJ1 + " | Jugador 2: " + contJ2);
        } while (contJ1 < numBarcos && contJ2 < numBarcos);

        System.out.println("¡El ganador es el Jugador " + (contJ1 == numBarcos ? 1 : 2) + "!");
    }

    static char[][] inicializaTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = GUION;
            }
        }
        return tablero;
    }

    static char[][] creaTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = A;
            }
        }
        return tablero;
    }

    static void generarBarquitos(char[][] tablero, int numBarquitos) {
        Random rand = new Random();
        int contador = 0;
        while (contador < numBarquitos) {
            int filaAleatoria = rand.nextInt(tablero.length);
            int colAleatoria = rand.nextInt(tablero[0].length);
            if (tablero[filaAleatoria][colAleatoria] == A) {
                tablero[filaAleatoria][colAleatoria] = B;
                contador++;
            }
        }
    }

    static void pintaTablero(char[][] tableroJugador) {
        System.out.print("\t");
        for (int i = 0; i < tableroJugador[0].length; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < tableroJugador.length; i++) {
            System.out.print((char) ('A' + i) + "\t");
            for (int j = 0; j < tableroJugador[i].length; j++) {
                System.out.print(tableroJugador[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean turnoJugador(char[][] tablero, char[][] tableroJugador) {
        boolean descubierto = false;
        int fila = -1, col = -1;
        boolean inputValido = false;

        do {
            try {
                System.out.println("Introduce la fila (letra):");
                char filaLetra = sc.next().toUpperCase().charAt(0);
                fila = filaLetra - 'A';

                System.out.println("Introduce la columna (número):");
                col = sc.nextInt() - 1;

                if (fila >= 0 && fila < tablero.length && col >= 0 && col < tablero[0].length) {
                    inputValido = true;
                } else {
                    System.out.println("Posición fuera del tablero. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                sc.nextLine(); // Limpiar buffer
            }
        } while (!inputValido);

        if (tablero[fila][col] == B) {
            System.out.println("¡HUNDIDO!");
            tableroJugador[fila][col] = B;
            descubierto = true;
        } else {
            System.out.println("AGUA");
            tableroJugador[fila][col] = A;
        }
        return descubierto;
    }
}
