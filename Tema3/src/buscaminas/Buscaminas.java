package buscaminas;

import java.util.Scanner;
import java.util.Random;

public class Buscaminas {
     static final char MINA = '*';
     static final char VACIO = '-';
     static final char DESCUBIERTO = ' ';
     static int filas;
     static int columnas;
     static int minas;
     static char[][] tablero;
     static boolean[][] minasTablero;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Configuración del tablero
        System.out.println("¡Bienvenido al Buscaminas!");
        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = sc.nextInt();
        System.out.print("Introduce el número de minas: ");
        minas = sc.nextInt();

        inicializarTablero();
        colocarMinas();

        boolean juegoActivo = true;
        while (juegoActivo) {
            mostrarTablero();
            System.out.print("Introduce fila y columna (separados por espacio): ");
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            if (minasTablero[fila][columna]) {
                System.out.println("¡Has pisado una mina! Game Over.");
                juegoActivo = false;
            } else {
                descubrir(fila, columna);
                if (ganar()) {
                    System.out.println("¡Felicidades! Has ganado.");
                    juegoActivo = false;
                }
            }
        }
        sc.close();
    }

     static void inicializarTablero() {
    	//tablero del usuario
        tablero = new char[filas][columnas];
        //tablero donde se indica si en esa fila columna
        //hay una mina
        minasTablero = new boolean[filas][columnas];
        
        //El tablero del usuario se inicializa VACÍO
        //Y el de las minas se inicializa false, no hay minas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = VACIO;
                minasTablero[i][j] = false;
            }
        }
    }

     static void colocarMinas() {
        Random rand = new Random();
        int colocadas = 0;
        //Mientras no haya colocado todas las minas
        while (colocadas < minas) {
        	//Fila aleatoria
            int fila = rand.nextInt(filas);
            //Columna aleatoria
            int columna = rand.nextInt(columnas);
            //Si en esa fila y columna no hay una mina
            if (minasTablero[fila][columna] == false) {
            	//Asignamos una mina en esa posicion
                minasTablero[fila][columna] = true;
                //Indicamos que se ha insertado una mina
                colocadas++;
            }
        }
    }

     static void mostrarTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	//Si el valor del tablero se ha descubierto
                if (tablero[i][j] == DESCUBIERTO) {
                	//Mostrar el numero de minas que hay alrededor
                    System.out.print(contarMinasAlrededor(i, j) + " ");
                } else {
                	//Si no se ha descubierto, mostramos el valor
                	//del tablero => VACIO
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

     static void descubrir(int fila, int columna) {
        //Si la fila o columna no está dentro del rango del tablero
    	if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || tablero[fila][columna] == DESCUBIERTO) {
            //Salimos de la funcion
    		return;
        }
    	
    	//La fila y columna es correcta => descubrimos la celda
        tablero[fila][columna] = DESCUBIERTO;
        //Si la fila y la columna no tiene minas alrededor
        if (contarMinasAlrededor(fila, columna) == 0) {
        	//Descubrimos la fila inferior y la columna siguiente
        	//de la columna que no tiene mina
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    descubrir(fila + i, columna + j);
                }
            }
        }
    }

     static int contarMinasAlrededor(int fila, int columna) {
        int contador = 0;

        //Desde la fila anterior y columna anterior
        //hasta la fila siguiente y columna siguiente
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
            	//Calculamos la fila y columna que vamos a revisar
            	//segun el bucle
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                
                //Si la fila y la columna a revisar están dentro
                //del rango de la matriz
                //y existe una mina en esa fila y columna
                if (nuevaFila >= 0 && nuevaFila < filas 
                		&& nuevaColumna >= 0 
                		&& nuevaColumna < columnas 
                		&& minasTablero[nuevaFila][nuevaColumna]) {
                    //Incrementamos el contador
                	contador++;
                }
            }
        }
        return contador;
    }

     static boolean ganar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	//Si queda una celda vacía o una celda sin mina
                if (tablero[i][j] == VACIO && minasTablero[i][j] == false) {
                    return false;
                }
            }
        }
        return true;
    }
}