package myproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Uri1533 {

	// TERMINAR

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCase = 1, cont = 0, aux = 0;
		while (nCase != 0) {
		nCase = scan.nextInt();
		int[] array = new int[nCase + 1];
		int[] array_copy = new int[nCase + 1];
		
			if (nCase == 0) {
				break;
			} else {

				for (int i = 1; i <= nCase; i++) {
					array[i] = scan.nextInt();
					array_copy[i] = array[i];

				}
				Arrays.sort(array);
				for (int i = 0; i <= nCase; i++) {
					if (array_copy[i] == array[nCase - 1]) {
						System.out.println(i);
					}
				}
			}
		}
	}
}
