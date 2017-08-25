package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1553 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caseN, caseK, caseP, counter;
		int[] array = new int[1001];

		caseN = scan.nextInt();
		caseK = scan.nextInt();
		while (scan.hasNext() && (caseN != 0) && (caseK != 0)) {
			counter = 0;
			Arrays.fill(array, 0);

			for (int i = 0; i < caseN; ++i) {
				caseP = scan.nextInt();
				array[caseP] += 1;
			}

			for (int i = 0; i < 1001; ++i) {
				if (array[i] >= caseK)
					counter++;
			}

			System.out.println(counter);
			caseN = scan.nextInt();
			caseK = scan.nextInt();
		}
	}
}
