package myproject;

import java.io.IOException;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int valueA, nCase, div;
			
		nCase = scan.nextInt();
	    
	    for (int h = 1; h <= nCase; h = h + 1) {
	    	valueA = scan.nextInt();    
	        div = 0;
	        for (int i = 1; i <= valueA; i++) {
	            if (valueA % i == 0) {
	                div++;
	            }
	        }
	        if (div <= 2) {
	            System.out.println(valueA + " eh primo");
	        } else {
	            System.out.println(valueA + " nao eh primo");
	        }
	    }
		
	}
}
