package myproject;

import java.util.Scanner;

public class Uri1079 {

	private static Scanner scan;

	public static void main(String[] args) {
	
	int n;
	double value1;
	double value2;
	double value3;

	scan = new Scanner(System.in);
	n = scan.nextInt();

	for (int i = 0; i < n; ++i)
	{
		value1 = scan.nextDouble();
		value2 = scan.nextDouble();
		value3 = scan.nextDouble();
		
		double average = ((value1/10) * 2) + ((value2/10) * 3) + ((value3/10) * 5);

		System.out.printf("%.1f", average);
		System.out.println();
	}
	}

}
