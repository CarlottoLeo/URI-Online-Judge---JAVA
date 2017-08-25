package myproject;

import java.io.*;
import java.util.*;


public class Uri1171 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int nCase, input;
		int array[] = new int[2001];
		
		nCase = scan.nextInt();

		for (int i = 0; i < nCase; ++i)
		{
			input = scan.nextInt();
			array[input] += 1;
		}

		for (int i = 0; i < 2001; ++i)
		{
			if(array[i] != 0){
				System.out.println( i + " aparece " + array[i] + " vez(es)" );
			}
		}

	}
}
