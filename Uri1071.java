package myproject;

import java.io.IOException;
import java.util.*;

public class Uri1071 {
	

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int value1 = 0, value2 = 0;
		int result = 0, aux = 0;
		
		
		value1 = scan.nextInt();
		value2 = scan.nextInt();
		
		if (value1 < value2) {
	        aux=value2;
	        value2=value1;
	        value1=aux;
	    }
	    if (value2 % 2 == 0) {
	        value2++;
	    } else {
	       value2 = value2 + 2;
	    }
	    result = 0;
	    for (int i = value2; i < value1; i = i + 2) {
	      
	        result = result + i;
	    }
	    System.out.println(result);
	}	
}
