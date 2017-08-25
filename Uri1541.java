package myproject;

import java.io.*;
import java.util.Scanner;

public class Uri1541 {

	public static void main(String[] args) throws IOException{
		 BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        
	        int nCase = 1;
			while (nCase != 0) {
				String input = read.readLine();
				String max[] = input.split(" ");
				if (max.length == 1) {
					nCase = Integer.parseInt(max[0]);
					continue;
				}
				
				double total = (((Integer.parseInt(max[0]) * Integer.parseInt(max[1])) * 100) / Integer.parseInt(max[2])); 
				total = Math.sqrt(total);
				System.out.println((int)total);
			}
	}
}