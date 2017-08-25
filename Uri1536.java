package myproject;

import java.io.*;
import java.util.*;

public class Uri1536 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int cont = 0, nCase, sumTime1, sumTime2;
		int[] time1 = new int[2];
		int[] time2 = new int[2];
		String x = "";

		nCase = scan.nextInt();
		while (cont < nCase) {
			sumTime1 = 0;
			sumTime2 = 0;

			time1[0] = scan.nextInt();// mandante
			x = scan.next();
			time2[0] = scan.nextInt();// visitante

			time2[1] = scan.nextInt();// mandante
			x = scan.next();
			time1[1] = scan.nextInt();// visitante

			// soma os gols
			sumTime1 = time1[0] + time1[1];
			sumTime2 = time2[0] + time2[1];
			//System.out.println("Time1: " + sumTime1);
			//System.out.println("Time2: " + sumTime2);

			if (sumTime1 > sumTime2 || sumTime1 == sumTime2 && time1[1] > time2[0]) {
				System.out.println("Time 1");
			} else if (sumTime1 < sumTime2 || sumTime1 == sumTime2 && time1[1] < time2[0]) {
				System.out.println("Time 2");
			} else {
				System.out.println("Penaltis");
			}
			cont++;
		}
	}
}