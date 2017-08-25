package myproject;

import java.io.*;
import java.util.*;


public class Uri1045 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		double x;

		double [] vector = new double[3];
		for (int i = 0; i < 3; ++i)
		{
			x = scan.nextDouble();
			vector[i] = x;
		}

		Arrays.sort(vector);
		double a, b, c;

		c = vector[0];
		b = vector[1];
		a = vector[2];

		if(a >= (b + c)){
			System.out.println("NAO FORMA TRIANGULO");
		}else{

			if(a*a == (b*b + c*c)){
				System.out.println("TRIANGULO RETANGULO");
			}else if(a*a > (b*b + c*c)){
				System.out.println("TRIANGULO OBTUSANGULO");
			}else{
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if(a == b && b == c){
				System.out.println("TRIANGULO EQUILATERO");
			}

			if((a == b && a != c) || (b == c && b != a) || (c == a && c != b)){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}