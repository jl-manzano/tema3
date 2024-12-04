package arraysUnidimensionales;

public class Letras {

	public static void main(String[] args) {
		
		//Declaro el array de numeros
		int[] tabla = {7, 3, 5, 8, 0, 2, 5};
		
		//Asignar como valor inicial la letra mayuscula A
		//Internamente tendrá el codigo 65
		char letraA = 'A';
		
		for (int i = 0;  i < tabla.length; i++) {
			//Si a la letraA le sumo el valor de i estará sumandole al
			//codigo ascii el valor de i
			//Para que se muestre como caracter tengo que hacer un cast de int a char
			System.out.print((char) (letraA + i) + " ");
			System.out.println(tabla[i]);
		}
	}
}
