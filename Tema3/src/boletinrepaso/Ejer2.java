package boletinrepaso;

import java.util.Scanner;

public class Ejer2 {
    public static final int TAMANIO = 9; // Tamaño del tablero (9x9)
    
    public static void main(String[] args) {
        int[][] tablero = new int[TAMANIO][TAMANIO];

        // Inicializar el tablero con valores predeterminados
        inicializarTablero(tablero);

        // Iniciar el juego
        jugar(tablero);
    }

    // Inicializa el tablero con algunos valores predeterminados
    public static void inicializarTablero(int[][] tablero) {
        // Ejemplo de un tablero inicial válido
        int[][] predefinido = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Copiar valores predeterminados al tablero
        for (int i = 0; i < TAMANIO; i++) {
            System.arraycopy(predefinido[i], 0, tablero[i], 0, TAMANIO);
        }
    }

    // Muestra el tablero en consola
    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                System.out.print((tablero[i][j] == 0 ? "." : tablero[i][j]) + " ");
                if ((j + 1) % 3 == 0 && j < TAMANIO - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < TAMANIO - 1) {
                System.out.println("---------------------");
            }
        }
    }

    // Jugar al Sudoku
    public static void jugar(int[][] tablero) {
        Scanner sc = new Scanner(System.in);

        while (!esCompleto(tablero)) {
            mostrarTablero(tablero);

            System.out.println("\nIntroduce fila, columna y valor (separados por espacios):");
            int fila = sc.nextInt() - 1; // Resta 1 para usar índices 0-based
            int columna = sc.nextInt() - 1;
            int valor = sc.nextInt();

            if (esMovimientoValido(tablero, fila, columna, valor)) {
                tablero[fila][columna] = valor;
            } else {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            }
        }

        mostrarTablero(tablero);
        System.out.println("¡Felicidades! Has completado el Sudoku.");
        sc.close();
    }

    // Comprueba si el tablero está completo
    public static boolean esCompleto(int[][] tablero) {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (tablero[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Comprueba si un movimiento es válido
    public static boolean esMovimientoValido(int[][] tablero, int fila, int columna, int valor) {
        if (valor < 1 || valor > 9 || fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
            return false; // Valor fuera de rango o posición no válida
        }

        if (tablero[fila][columna] != 0) {
            return false; // Posición ya ocupada
        }

        // Comprobar fila
        for (int j = 0; j < TAMANIO; j++) {
            if (tablero[fila][j] == valor) {
                return false;
            }
        }

        // Comprobar columna
        for (int i = 0; i < TAMANIO; i++) {
            if (tablero[i][columna] == valor) {
                return false;
            }
        }

        // Comprobar subcuadro 3x3
        int inicioFila = (fila / 3) * 3;
        int inicioColumna = (columna / 3) * 3;
        for (int i = inicioFila; i < inicioFila + 3; i++) {
            for (int j = inicioColumna; j < inicioColumna + 3; j++) {
                if (tablero[i][j] == valor) {
                    return false;
                }
            }
        }

        return true;
    }
}
