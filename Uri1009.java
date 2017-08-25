package myproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) throws IOException {
		DecimalFormat format = new DecimalFormat("0.00");

		Scanner scan = new Scanner(System.in);
		
		double valueA, valueB, total;
		String name = "";

		    name = scan.nextLine();
		    valueA = scan.nextDouble();
		    valueB = scan.nextDouble();

		    total = valueA + valueB * 0.15  ;

		    
		    System.out.println("TOTAL = R$ " + format.format(total));
	}
}
