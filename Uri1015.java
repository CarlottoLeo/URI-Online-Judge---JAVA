package myproject;

import java.io.IOException;
import java.util.*;

public class Uri1015 {
	public static double distancia(double X1, double X2, double Y1, double Y2) {
		double DISTANCIA = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		return DISTANCIA;
	}

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		double X1 = scan.nextDouble();
		double Y1 = scan.nextDouble();
		double X2 = scan.nextDouble();
		double Y2 = scan.nextDouble();
		
		double DISTANCIA = distancia(X1, X2, Y1, Y2);
		
		System.out.printf("%.4f", DISTANCIA);
		System.out.println();

	}
}
