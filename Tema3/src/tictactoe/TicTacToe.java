package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static final int TAM = 3;
	static final char VACIO = '-';
	static final char O = 'O';
	static final char X = 'X';
	
	static Scanner sc = new Scanner(System.in);
	
	public static void inicializarTablero(char[][] tablero) {
		//Recorremos filas y columnas y a todas las posiciones les asigne '-'
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				tablero[i][j] = VACIO;
			}
		}
	}
	
	public static void mostrarTablero(char[][] tablero) {
		//Recorremos filas y columnas y mostramos el valor que tiene el tablero
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static char asignarTurno() {
		
		Random random = new Random();
		//Establecer un aleatorio entre 0 y 1 para saber que jugador comienza el juego
		int aleatorio = random.nextInt(2);
		
		//Dependiendo del aleatorio empieza uno de los dos
		if (aleatorio == 0) {
			return O;
		}
		else {
			return X;
		}
	}
	
	public static char cambiarTurno(char turno) {
		//Si el turno actual es el de la O
		if (turno == O) {
			return X;
		}
		else {
			return O;
		}
	}
	
	public static void ponFicha(char turno, char[][] tablero) {

		int fila, columna;
		
		//Repite la peticion de fila y columna mientras los datos sean incorrectos
		do {
			System.out.println("Introduce fila: ");
			fila = sc.nextInt();
			System.out.println("Introduce columna: ");
			columna = sc.nextInt();
		} while ((fila < 1 || fila > TAM)
			    || (columna < 1 || columna > TAM)
			    || tablero[fila - 1][columna - 1] != VACIO);
		
		//Si acaba el bucle, el valor de fila y columna es correcto
		//Asignar a la fila y columna el simbolo
		//Hemos indicado fila - 1 y columna - 1 para que el usuario no tenga
		//que poner el 0
		tablero[fila - 1][columna - 1] = turno;
	}
	
	public static void jugar(char[][] tablero) {
		
		boolean ganador = false;
		boolean lleno = false;
		
		//Asignamos el turno inicial
		char turno = asignarTurno();
		
		//mientras que no termine el juego
		while (ganador == false && lleno == false) {
			
			//Imprimimos turno para saber quien juega
			System.out.println("Turno: " + turno);
			
			//Pon ficha el turno actual
			ponFicha(turno, tablero);
			
			//Mostrar tablero
			mostrarTablero(tablero);
			
			//Verificar 3 en raya
			ganador = verificarFinJuego(tablero);
			
			//Si no ha terminado el juego
			if (ganador == false) {
				//Cambiar turno
				turno = cambiarTurno(turno);
				
				//Comprobamos si el tablero esta lleno
				lleno = tableroLleno(tablero);
			}
		}
		
		//Cuando finaliza el bucle puede haber dos motivos
		//El tablero está lleno, nadie gana
		if (lleno == true) {
			System.out.println("Fin juego: Tablero lleno");
		}
		
		//Si ha acabado como terminado, hay un ganador
		if (ganador == true) {
			//Si el juego ha terminado no cambio el turno para que no
			//salga que ha ganado el otro jugador
			System.out.println("Fin juego. Gana el " + turno);
		}
	}
	
	public static boolean tableroLleno(char[][] tablero) {
		boolean lleno = true;
		
		//Recorremos el tablero
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				//Si en la posicion i j hay un vacío
				if (tablero[i][j] == VACIO) {
					lleno = false;
				}
			}
		}
		
		return lleno;
	}
	
	public static boolean verificarFinJuego(char[][] tablero) {
        
		boolean ganador = false;
		
		// Comprobar filas
        for (int i = 0; i < tablero.length; i++) {
            if ((tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2])
            	&& (tablero[i][0] != VACIO && tablero[i][1] != VACIO && tablero[i][2] != VACIO)) {
            	
                ganador = true;
            }
        }
        
        // Comprobar columnas
        for (int i = 0; i < tablero[0].length; i++) {
            if ((tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i])
            && (tablero[0][i] != VACIO && tablero[1][i] != VACIO && tablero[2][i] != VACIO)){
               ganador = true;
            }
        }
        
        // Comprobar diagonales
        if ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])
           && (tablero[0][0] != VACIO && tablero[1][1] != VACIO && tablero[2][2] != VACIO)) {
            ganador = true;
        }
        
        if ((tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2])
        	&& (tablero[2][0] != VACIO && tablero[1][1] != VACIO && tablero[0][2] != VACIO)) {
            ganador = true;
        }   

        return ganador;
	}
	
	public static void main(String[] args) {
		
		char[][] tablero = new char[TAM][TAM];
		inicializarTablero(tablero);
		mostrarTablero(tablero);
		jugar(tablero);
		sc.close();
	}
}
