package myproject;

import java.util.Scanner;

public class Uri1160 {
	public static void main(String[] args) {

		int t, pa, pb, ctr;
		double ga, gb;

		Scanner scan = new Scanner(System.in);

		t = scan.nextInt();

		for (int i = 0; i < t; ++i) {
			ctr = 0;

			pa = scan.nextInt();
			pb = scan.nextInt();
			ga = scan.nextDouble();
			gb = scan.nextDouble();

			while (pa <= pb && ctr <= 100) {
				ctr++;
				pa += (pa * (ga / 100));
				pb += (pb * (gb / 100));
			}

			if (ctr > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(ctr + " anos.");
			}
		}

	}
}
