package myproject;

import java.io.IOException;
import java.util.*;

public class Uri1017 {
	

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		double time = scan.nextDouble();
		double travel = scan.nextDouble();
		double consumption = travel * time /12;
		
		System.out.printf("%.3f", consumption);
		System.out.println();
		
	}	
}
