package myproject;

import java.util.Scanner;

public class Uri1176 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long vector[] = new long[61];
	    long fib, cont;
	    int i;
	    vector[0] = 0;
	    vector[1] = 1;
	 
	 
	    for (i=2; i<61; i++) {
	        vector[i] = vector [ i-1 ]  + vector [ i-2 ];
	    }
	 
	    cont = scan.nextInt();
	 
	    for (i=0; i<cont; i++) {
	        fib = scan.nextInt();
	        System.out.println("Fib(" + fib + ") = " + vector[(int)fib] );
	    }
	}
}
