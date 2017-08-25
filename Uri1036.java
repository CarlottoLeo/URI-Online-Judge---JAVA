package myproject;

import java.io.IOException;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		double valueA, valueB, valueC;
		 double Result1, Result2;
		//cout << fixed << setprecision ( 5 );
		 valueA = scan.nextDouble();
		 valueB = scan.nextDouble();;
		 valueC = scan.nextDouble();
		 if ( ( valueB * valueB - 4 * valueA * valueC <0) || (valueA == 0)){
		    System.out.println("Impossivel calcular");
		 }else{

		 Result1 = (- valueB + Math.sqrt( valueB * valueB - 4 * valueA * valueC)) / (2 * valueA);
		 Result2 = (- valueB - Math.sqrt( valueB * valueB - 4 * valueA * valueC)) / (2 * valueA);

		 System.out.printf("R1 = " + "%.5f", Result1 );
		 System.out.println();
		 System.out.printf("R2 = " + "%.5f", Result2 );
		 System.out.println();
		 }
		
	}
}
