package myproject;

import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bunny = 0, mouse = 0, frog = 0;
		int testCase = 0;
		int value = 0;
		double total = 0;
		double percentageBunny = 0;
		double percentageMouse = 0;
		double percentageFrog = 0;
		
		String type;

		testCase = scan.nextInt();

		for (int i = 0; i < testCase; i++) {

			value = scan.nextInt();
			type = scan.next();

			total += value;

			if (value >= 1 && value <= 15) {
				
				if(type.equals("C")){
					bunny += value;
				}else if(type.equals("R")){
					mouse += value;
				}else if(type.equals("S")){
					frog += value;
				}
			}else {
				break;
			}
			percentageBunny = bunny * 100 / total;
			percentageMouse = mouse * 100 / total;
			percentageFrog = frog * 100 / total;
		}

		System.out.println("Total: " + (bunny + mouse + frog) + " cobaias");
		System.out.println("Total de coelhos: " + bunny);
		System.out.println("Total de ratos: " + mouse);
		System.out.println("Total de sapos: " + frog);
		System.out.printf("Percentual de coelhos: " + "%.2f",percentageBunny);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: " + "%.2f",percentageMouse);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: " + "%.2f",percentageFrog);
		System.out.println(" %");

	}
}