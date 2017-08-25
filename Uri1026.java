package myproject;

import java.io.*;
import java.util.*;

public class Uri1026 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		long inputNumberA, inputNumberB, binarySum;

		while (sc.hasNext()) {
			inputNumberA = sc.nextLong();
			inputNumberB = sc.nextLong();
			binarySum = inputNumberA ^ inputNumberB;
			System.out.println(binarySum);
		}
	}
}
