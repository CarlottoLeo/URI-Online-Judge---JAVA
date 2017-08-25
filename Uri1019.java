package myproject;

import java.io.*;
import java.util.*;


public class Uri1019 {
	

		public static void main(String[] args) throws IOException {
	 
	 	Scanner scan = new Scanner(System.in);
	 	
	 	int value = 0;
	 	int hour = 0, minute = 0, seconds = 0, aux = 0;
	 	
	 	value = scan.nextInt();
	 	
	 	hour = value /3600;
	 	aux = value % 3600;
	 	minute = aux / 60;
	 	seconds = aux % 60;
	 	
	 	System.out.println(hour + ":" + minute + ":" + seconds);
	 	
	}
}
