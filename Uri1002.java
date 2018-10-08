package myproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1002 {
	 private static Scanner scan;

		public static void main(String[] args) throws IOException {
	 
	 	scan = new Scanner(System.in);
	 	
	 	double R;
	 	double P = 3.14159;
	 	double A = 0;
	 	
		R = scan.nextDouble();
	 	
	 	A = P * (R*R);
	 	
	 	System.out.printf("A=" + "%.4f",A);
	 	System.out.println();

		}
}
