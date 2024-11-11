package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		
		// create an array
		int array[];

		// variable for storage the size of array
		int size;
		
		// variable for storage an initial value
		int initialValue = 0;

		// variable for storage an increase
		int increase;

		// create the scanner
		Scanner sc = new Scanner(System.in);
		
		// ask user for size of array
		System.out.println("Introduce the size of 'array': ");
		
		// read size introduced by user
		size = sc.nextInt();
		
		// assign the size to array
		array = new int[size];
	
		// ask user for initial value
		System.out.println("\nIntroduce an initial value: ");
		
		// read initial value introduced by user
		initialValue = sc.nextInt();
		
		// ask user for increase of array
		System.out.println("\nIntroduce an increase: ");
				
		// read size introduced by user
		increase = sc.nextInt();
		
		// create loop for
		for (int i = 0; i < array.length; i++) {
		
			// storage in the position in question of array the result of initial value + position in question of array * increase
			array[i] = initialValue + i * increase;
		
		}
		
		// show all the values of array on screen
		System.out.println("\n" + Arrays.toString(array));
		
		// close the scanner
		sc.close();
	}
}
