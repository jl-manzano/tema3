package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {

		// create an array
		int array[] = new int[10];

		// variable for storage a char
		char option;

		// variable for storage a value
		int value;

		// variable for storage a position
		int position;

		// create the scanner
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENU: ");

			System.out.println("'a': SHOW ALL THE VALUES");
			System.out.println("'b': ASK FOR A VALUE AND A POSITION");
			System.out.println("'c': EXIT");

			// ask user for option
			System.out.println("\nIntroduce an option: ");

			// read option introduced by user
			option = sc.next().charAt(0);

			// create a conditional switch -> to not to show the menu if the user chooses
			// the option 'c'
			switch (option) {
			case 'a', 'A' -> {
				// show all the values on screen
				System.out.println(Arrays.toString(array));
			}

			case 'b', 'B' -> {
				// ask user for value
				System.out.println("\nIntroduce the value: ");

				// read value introduced by user
				value = sc.nextInt();

				// ask user for position
				System.out.println("\nIntroduce the position where storage the previous value: ");

				// read position introduced by user
				position = sc.nextInt();

				// assign value to position in question of the array
				array[position] = value;

			}

			case 'c', 'C' -> {

				// exit the program
				System.out.println("\nExiting the program ...");
			}

			default -> {
				System.out.println("ERROR. Invalid option entered.");
			}

			}
		} while (option != 'c');

		// close scanner
		sc.close();

	}
}
