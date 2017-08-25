package myproject;

import java.io.IOException;
import java.util.Scanner;

public class Uri1006 {
	public static double peso(double A, double B, double C) {
		double MEDIA = (((A * 2) + (B * 3) + (C * 5)) / 10);
		return MEDIA;
	}

public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double MEDIA = peso(A, B, C);
       
        System.out.printf("MEDIA = " + "%.1f", MEDIA);
        System.out.println();
       
    }

}
