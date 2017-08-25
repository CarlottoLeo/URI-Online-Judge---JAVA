package myproject;

import java.io.*;
import java.util.*;

public class Uri1041 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		double inputX, inputY;

		inputX = scan.nextDouble();
		inputY = scan.nextDouble();

		if (inputX > 0 && inputY > 0) {
			System.out.println("Q1");
		} else {
			if (inputX < 0 && inputY > 0) {
				System.out.println("Q2");
			} else {
				if (inputX < 0 && inputY < 0) {
					System.out.println("Q3");
				} else {
					if (inputX > 0 && inputY < 0) {
						System.out.println("Q4");
					} else {
						if (inputX == 0 && inputY == 0) {
							System.out.println("Origem");
						} else {
							if (inputX == 0 && inputY != 0) {
								System.out.println("Eixo Y");
							}
							if (inputX != 0 && inputY == 0) {
								System.out.println("Eixo X");
							}
						}
					}
				}
			}
		}
	}
}