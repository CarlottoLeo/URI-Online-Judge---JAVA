package myproject;

import java.util.Scanner;

public class Uri1051 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salary = 0.0;
		double tax = 0.0;

		salary = scan.nextDouble();

		if (salary < 2000.99) {
			System.out.println("Isento");
		} else {
			if (salary >= 2001.00 && salary <= 3000.00) {
				tax = ((salary - 2000.00) * 0.08);
			} else {
				if (salary >= 3001.00 && salary <= 4500.00) {
					tax = (0.08 * 1000) + (0.18 * (salary - 3000));
				} else {
					if (salary > 4500) {
						tax = (0.08 * 1000) + (0.18 * 1500) + (0.28 * (salary - 4500));
					}
				}
			}
			
			System.out.printf("R$ %.2f", tax);
			System.out.println();
		}
	}
}