package myproject;

import java.util.Scanner;

public class Uri1164 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = 0;
		int value = 0;
		int total = 0;

		testCase = scan.nextInt();

		for (int i = 0; i < testCase; i++) {
			value = scan.nextInt();
			for (int j = 1; j < value; j++) {
				total += j;
				if (total == value) {
					break;
				}
			}
			if (total == value) {
				System.out.println(value + " eh perfeito");
			} else {
				System.out.println(value + " nao eh perfeito");
			}
			total = 0;
		}

	}
}
