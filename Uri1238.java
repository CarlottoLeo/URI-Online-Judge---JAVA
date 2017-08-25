package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uri1238 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String a, b;
	    int n, x, y, tmp, tam, size_a, size_b;
	    
	    n = scan.nextInt();
	    
	    for (int i = 0; i < n; ++i) {
	        a = scan.next();
	        b = scan.next();
	        tam = a.length() + b.length();
	        size_a = a.length();
	        size_b = b.length();
	        
	        x = 0;
	        y = 0;
	        tmp = 0;
	        
	        for (int j = 0; j < tam; ++j) {
	            
	            if (tmp == 0) {
	                tmp = 1;
	                if (x != size_a) {
	                	char [] valor1 = a.toCharArray();
	                	System.out.print(valor1[x]);
	                	//System.out.println(y);
	                	x++;
	                }
	            }
	            if (tmp == 1) {
	                tmp = 0;
	                if (y != size_b) {
	                	char [] valor = b.toCharArray();
	                	System.out.print(valor[y]);
	                    //System.out.println(y);
	                	y++;
	                    
	                }
	            }
	        }
	        
	        System.out.println();
	    }
	}
}
