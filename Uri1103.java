package myproject;

import java.io.IOException;
import java.util.Scanner;

public class Uri1103 {

	public static void main(String[] args) throws IOException {

		Scanner read = new Scanner(System.in);

		int hourI, hourF, minuteI, minuteF, contH = 0, contM = 0, result = 0,
				mResult = 0, finalResult = 0;
		boolean close = false;

		while (close == false) {

			contH = 0;
			contM = 0;
			result = 0;
			mResult = 0;
			finalResult = 0;

			hourI = read.nextInt();
			minuteI = read.nextInt();
			hourF = read.nextInt();
			minuteF = read.nextInt();

			if ((hourI == 0) && (hourF == 0) && (minuteI == 0) && (minuteF == 0)) {
				close = true;
			} else {
				if ((hourI == hourF) && (minuteI == minuteF)) {
					finalResult = 1440;
				} else {
					if (minuteI > minuteF) {
						for (int i = minuteI; i < 60; i++) {
							contM = contM + 1;
						}
						mResult = (contM + minuteF);
						contH = contH - 1;
					} else {
						for (int i = minuteI; i < minuteF; i++) {
							contM = contM + 1;
						}
						mResult = contM;
					}

					if ((hourI == hourF) && (hourF == hourI)) {
						if (minuteI > minuteF) {
							contH = -1;
							for (int i = hourI; i < 24; i++) {
								contH = contH + 1;
							}
							result = (contH + hourF) * 60;
						}
					} else {

						if (hourI > hourF) {
							if (minuteI > minuteF) {
								contH = -1;
							}
							for (int i = hourI; i < 24; i++) {
								contH = contH + 1;
							}
							result = (contH + hourF) * 60;
						} else {
							for (int i = hourI; i < hourF; i++) {
								contH = contH + 1;
							}
							result = contH * 60;
						}

					}
					finalResult = result + mResult;
				}
				System.out.println(finalResult);
			}
		}
	}
}
