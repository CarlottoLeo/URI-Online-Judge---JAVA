package myproject;

import java.io.IOException;
import java.util.Scanner;

public class Uri1136 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int i, j, cont, k;
		int input1, input2, input3;
		int[] bingo = new int[1005];
		int[] ket = new int[1005];
		int aux1, aux2, p;

		input1 = scan.nextInt();
		input2 = scan.nextInt();
		while (input1 != 0 || input2 != 0) {

			aux1 = 0;
			aux2 = 0;
			
			for (i = 0; i < input2; i++) {
				input3 = scan.nextInt();
				bingo[i] = input3;
			}
			k = 0;
			p = 0;
			for (i = 0; i < input2; i++) {
				for (j = i; j < input2; j++) {
					for (k = 0; k <= input1; k++) {
						if (Math.abs(bingo[i] - bingo[j]) == k) {
							p++;
							ket[p] = k;

						}
					}
				}
			}
			aux2 = p;

			for (k = 0; k <= input1; k++) {
				cont = 0;
				for (p = 1; p <= aux2; p++) {
					if ((k == ket[p]) && (cont == 0)) {
						aux1++;
						cont = 1;
					}
				}
			}
			if (aux1 == input1 + 1) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			input1 = scan.nextInt();
			input2 = scan.nextInt();
		}
	}
}

/*
 * public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int balls[] = new int[1005];
   int markedBalls[] = new int[1005];
   int numBalls = 0;
   int number = 0;
   
   Boolean flag;
   
   number = read.nextInt();
   numBalls = read.nextInt();
   
   
   while (number != 0 || numBalls != 0) { 
    Arrays.fill(markedBalls, 0);
    flag = true;
    
    for ( int i = 0; i < numBalls; i++ ) { 
     balls[i] = read.nextInt();
    }
    
    for ( int i = 0; i < numBalls; i++ ) {
     for ( int j = 0; j < numBalls; j++) {
      markedBalls[Math.abs(balls[i] - balls[j])] = 1;
     }
    }
    
    for ( int i = 0; i < ( number + 1 ); i++ ) {
     if (markedBalls[i] == 0) {
      flag = false;
     }
    }
    System.out.println(flag ? "Y" : "N");
    number = read.nextInt();
    numBalls = read.nextInt();
   
     }
   }
} 
 */
