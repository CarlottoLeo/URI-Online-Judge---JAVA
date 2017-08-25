package myproject;

import java.io.*;
import java.util.*;


public class Uri1073 {
	

		public static void main(String[] args) throws IOException {
	 
	 	Scanner scan = new Scanner(System.in);
	 	
	 	int value = 0;
	 	int total;
	 	
	 	value = scan.nextInt();
	 	
	 	for(int i = 2; i < value + 2; i += 2) {
	 		total = (int) Math.pow(i, 2);
	 		System.out.println(i + "^2 = " +total);
	 	}
	 	
	}
}
