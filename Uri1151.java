package myproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Uri1151 {
	

		public static void main(String[] args) throws IOException {
	 
	 	Scanner scan = new Scanner(System.in);
	 	
	 	int i;
	 	int[] vetor = new int[46];
	    int line;
	    line = scan.nextInt();
	    vetor[0] = 0;
	    vetor[1] = 1;

	        for (i= 2; i<=45; i++) {
	            vetor [i] = vetor[i-1] + vetor [i-2];
	        }

	        System.out.print("0");
	        for (i= 1; i<line; i++) {
	        	System.out.print(" " + vetor[i]);
	        
	        }
	        System.out.println();
		}
}
