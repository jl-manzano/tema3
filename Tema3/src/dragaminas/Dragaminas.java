package dragaminas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dragaminas {

	static final int TAM = 20;
	static final int NUM_MINAS = 6;
	static final char VACIO = '-';
	static final char MINA = '*';
	
	static Scanner sc = new Scanner(System.in);
	
	public static void inicializarTablero(char[] tablero) {	
		//Recorremos filas y columnas y a todas las posiciones les asigne '-'
		for (int i = 0; i < TAM; i++) {
			tablero[i] = VACIO;
		}
	}

	public static void mostrarTablero(char[] tablero) {
		System.out.println(Arrays.toString(tablero));
	}
	
	public static void colocarMinas(char[] tablero) {
		
		int aleatorio;
		Random random = new Random();
		
		//Bucle que genera 6 minas en posiciones aleatorias entre 0 y 19
		for (int i = 0; i < NUM_MINAS; i++) {
			
			//Repetir en caso que ya haya una mina en esa posicion
			do {
				aleatorio = random.nextInt(TAM);
			} while (tablero[aleatorio] == MINA);
			
			//Cuando el aleatorio es correcto
			tablero[aleatorio] = MINA;
		}
	}
	
	public static void calculaNumeroMinas(char[] tablero) {
		
		int contadorMinas;
		
		//Bucle que genera 6 minas en posiciones aleatorias entre 0 y 19
		for (int i = 0; i < TAM; i++) {
			
			//Para cada posicion se pone el contador de minas a cero
			contadorMinas = 0;
			
			//Si no hay una mina en la posicion
			if (tablero[i] != MINA) {
				//Si la i es mayor que cero => la primera no tiene anterior
				//y la posicion anterior tiene una mina
				if (i > 0 && tablero[i - 1] == MINA) {
					//Sumamos el contador de minas
					contadorMinas++;
				}
				
				//Si la i es menor que el ultimo elemento de la lista => la ultima no tiene posterior
				//y el elemento posterior es una mina
				if (i < TAM - 1 && tablero[i + 1] == MINA) {
					//Sumamos el contador de minas
					contadorMinas++;
				}
				
				//Para cada elemento le añado el numero de minas, sumandole al valor ascii del 0
				//que es el 48 el valor del contador de minas
				//48 ('0') + 0 = 48 ('0')
				//48 ('0') + 1 = 49 ('1')
				//48 ('0') + 2 = 50 ('2')
				tablero[i] = (char) ('0' + contadorMinas);
			}
		}
	}
	
	public static boolean descubrePosicion(char[] juego, char[] usuario) {

		int posicion;
		boolean terminado;
		
		//Repite la peticion de fila y columna mientras los datos sean incorrectos
		do {
			System.out.println("Introduce posicion: ");
			posicion = sc.nextInt();
			
		} while (posicion < 1 || posicion > TAM);

		//Si acaba el bucle, el valor de la posicion es correcto
		//Si en esa posicion hay una mina
		if (juego[posicion - 1] == MINA) {
			terminado = true;
			//Al usuario le pongo el valor del juego
			usuario[posicion - 1] = juego[posicion - 1];
		}
		else {
			//Sino sigo jugando
			terminado = false;
			//Al usuario le pongo el valor del juego
			usuario[posicion - 1] = juego[posicion - 1];
			//Al juego le pongo un vacio para que se queden solo las minas
			juego[posicion - 1] = VACIO;
		}

		return terminado;
	}
	
	public static boolean posicionSinMina(char[] tablero) {
		boolean existe = false;
		
		//Recorremos el tablero
		for (int i = 0; i < tablero.length; i++) {
			//Si en la posicion i hay un elemento distinto de mina
			if (tablero[i] != MINA && tablero[i] != VACIO) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	public static void jugar(char[] juego, char[] usuario) {
		
		boolean terminado = false;
		boolean posSinMina = true;

		//mientras que no termine el juego
		while (terminado == false && posSinMina == true) {
			
			//Descubrimos una posicion
			terminado = descubrePosicion(juego, usuario);
			
			//Mostrar tablero
			mostrarTablero(usuario);

			//Si no ha terminado el juego
			if (terminado == false) {

				//Comprobamos si todavía hay posiciones sin minas
				posSinMina = posicionSinMina(juego);
			}
		}
		
		//Cuando finaliza el bucle puede haber dos motivos
		if (terminado == true) {
			System.out.println("BOOOOM!!!!!!!!");
		}
		
		//Si ha acabado sin posiciones con minas
		if (posSinMina == false) {

			System.out.println("HAS GANADO");
		}
	}
	
	public static void main(String[] args) {
		
		char[] juego = new char[TAM];
		char[] usuario = new char[TAM];
		
		
		//Inicializo el array del usuario => el que irá rellenando conforme juega
		inicializarTablero(usuario);
		//Colocar las minas al tablero del juego
		colocarMinas(juego);
		calculaNumeroMinas(juego);
		mostrarTablero(usuario);
		jugar(juego, usuario);
		mostrarTablero(juego);
	}
}
