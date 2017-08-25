package myproject;

import java.util.Scanner;

public class Uri1848 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int cont = 0;
		int cont2 = 0;
		char eyes[] = new char[1];
		
		eyes[0]='*';

		while (in.hasNext()) {
			s = in.nextLine();

			if (s.equals("caw caw")) {
				System.out.println(cont2);
				cont++;
				cont2 = 0;
				if (cont > 2) {
					break;
				}
			} else {
				for (int i = 0; i < 3; i++) {
					if(s.charAt(i)==(eyes[0]))
					if (i == 0) {
						cont2 += 4;
					} else {
						if (i == 1) {
							cont2 += 2;
						} else if (i == 2) {
							cont2++;
						}
					}
				}
			}
		}
	}
}