package myproject;

import java.util.Scanner;

public class Uri1786 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String userInputSsn;

		int aux = 0;
		int array[] = new int[11];
		int i;
		int cont = 1;

		while (read.hasNext()) {
			userInputSsn = read.nextLine();
			aux = 0;
			cont = 1;
			for (i = 0; i < userInputSsn.length(); i++) {
				array[i] = Integer.parseInt("" + userInputSsn.charAt(i));
				aux += array[i] * cont;
				cont++;
			}

			if (aux % 11 == 10) {
				array[9] = 0;
			} else {
				array[9] = aux % 11;
			}

			aux = 0;
			cont = 9;

			for (i = 0; i < 9; i++) {
				aux += array[i] * cont;
				cont--;
			}

			if (aux % 11 == 10) {
				array[10] = 0;
			} else {
				array[10] = aux % 11;
			}

			for (i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i == 2 || i == 5) {
					System.out.print(".");
				} else if (i == 8) {
					System.out.print("-");
				}
			}
			System.out.println();

		}
	}
}
