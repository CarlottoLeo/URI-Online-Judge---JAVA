package myproject;

import java.util.HashMap;
import java.io.*;
import java.util.*;

public class Uri1652 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Map<String, String> dictionaryMap = new HashMap<String, String>();
		int quantityOfIrregular;
		int quantity;
		int length;

		String[] line;
		String singularIrregular;
		String pluralIrregular;
		String regular;

		quantityOfIrregular = read.nextInt();
		quantity = read.nextInt();
		read.nextLine();
		for (int i = 0; i < quantityOfIrregular; i++) {
			line = read.nextLine().split(" ");
			singularIrregular = line[0];
			pluralIrregular = line[1];

			dictionaryMap.put(singularIrregular, pluralIrregular);

		}
		// System.out.println(dictionaryMap.values());
		while (quantity-- > 0) {
			regular = read.nextLine();
			length = regular.length();
			StringBuilder stringBuilder = new StringBuilder(regular);
			if (dictionaryMap.containsKey(regular)) {
				System.out.println(dictionaryMap.get(regular));
			} else if (regular.charAt(length - 2) != 'i' && regular.charAt(length - 2) != 'a'
					&& regular.charAt(length - 2) != 'e' && regular.charAt(length - 2) != 'o'
					&& regular.charAt(length - 2) != 'u' && regular.charAt(length - 1) == 'y') {
				stringBuilder.deleteCharAt(length - 1);
				stringBuilder.insert(length - 1, 'i');
				System.out.println(stringBuilder + "es");
			} else if (regular.charAt(length - 1) == 'o' || regular.charAt(length - 1) == 's'
					|| regular.charAt(length - 1) == 'x'
					|| (regular.charAt(length - 2) == 'c' && regular.charAt(length - 1) == 'h')
					|| regular.charAt(length - 2) == 's' && regular.charAt(length - 1) == 'h') {
				System.out.println(stringBuilder + "es");
			} else {
				System.out.println(stringBuilder + "s");
			}
		}
	}
}