package myproject;


import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {

		int startTime, minuteStart, finalHour, finalMinute;
		int contTime = 0;
		int contMinute = 0;

		Scanner scan = new Scanner(System.in);

		startTime = scan.nextInt();
		minuteStart = scan.nextInt();
		finalHour = scan.nextInt();
		finalMinute = scan.nextInt();

		if (startTime == finalHour && minuteStart == finalMinute) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {

			if (startTime == finalHour && minuteStart != finalMinute) {
				startTime++;
				while (minuteStart != finalMinute) {
					contMinute++;
					minuteStart++;
					if (minuteStart == 61)
						minuteStart = 1;
				}

				while (startTime != finalHour) {
					contTime++;
					startTime++;
					if (startTime == 25)
						startTime = 1;
				}

			}

			while (minuteStart != finalMinute) {
				contMinute++;
				minuteStart++;
				if (minuteStart == 61) {
					minuteStart = 1;
					contTime--;
				}
			}

			while (startTime != finalHour) {
				contTime++;
				startTime++;
				if (startTime == 25)
					startTime = 1;
			}

			System.out.println("O JOGO DUROU " + contTime + " HORA(S) E " + contMinute + " MINUTO(S)");
		}
	}
}
