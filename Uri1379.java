package myproject;

import java.io.*;
import java.util.*;

public class Uri1379 {
	
	  public static void main(String[] args) throws IOException {
		  Scanner read = new Scanner(System.in);
		  int valueA;
		  int valueB;
		  int aux = 0;
		  
		  valueA = read.nextInt();
		  valueB = read.nextInt();
		  
		  while ((valueA != 0) && (valueB != 0)) {
		   
		   if ( valueA > valueB ) {
		    valueA = aux;
		    aux = valueB;
		    valueA = valueB;
		   }
		   
		   System.out.println(valueA - (valueB - valueA));

		   valueA = read.nextInt();
		   valueB = read.nextInt();
		   
		  }

	    }
	}