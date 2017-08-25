package myproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uri1216 {

	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		double cont = 0, time = 0, result = 0, value;
		
		String name = "";

		while(scan.hasNext()) {
			
			name = scan.nextLine();
			value = scan.nextDouble();
			
			
			time += value;
			cont++;
			name = scan.nextLine();

		result = time / cont;
		

		}
		System.out.printf("%.1f", result);
		System.out.println();
		
	}
	
}
