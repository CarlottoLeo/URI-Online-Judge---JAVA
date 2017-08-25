package myproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1165 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		double valueA, tmp, per;
		
		valueA = scan.nextDouble();

		if(valueA <= 400){
			per = 15;
			tmp = valueA + ((valueA * per) / 100);
		}else if(valueA > 400 && valueA <= 800){
			per = 12;
			tmp = valueA + ((valueA * per) / 100);
		}else if(valueA > 800 && valueA <= 1200){
			per = 10;
			tmp = valueA + ((valueA * per) / 100);	
		}else if(valueA > 1200 && valueA <= 2000){
			per = 7;
			tmp = valueA + ((valueA * per) / 100);
		}else{
			per = 4;
			tmp = valueA + ((valueA * per) / 100);
		}

		System.out.printf("Novo salario: " + "%.2f", tmp );
		System.out.println();
		System.out.printf("Reajuste ganho: " + "%.2f", (tmp - valueA));
		System.out.println();
		System.out.printf("Em percentual: " + "%.0f", per);
		System.out.println(" %");
		
	}
}
