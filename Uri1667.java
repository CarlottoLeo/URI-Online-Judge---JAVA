package myproject;

import java.io.*;
import java.util.*;

public class Uri1667 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		String line = "";

		while (scan.hasNextLine()) {
			StringTokenizer tokens = new StringTokenizer(scan.nextLine());

			while (tokens.hasMoreTokens()) {
				String word = tokens.nextToken();

				if (line.length() + word.length() + 1 > 80) {
					text.append(line + "\n");
					line = "";
				}

				switch (word) {
				case "<br>":
					text.append(line);
					text.append("\n");
					line = "";
					break;
				case "<hr>":
					if (!line.isEmpty()) {
						text.append(line);
						text.append("\n");
						line = "";
					}
					text.append("--------------------------------------------------------------------------------\n");
					break;
				default:
					if (!line.isEmpty()) {
						line += " ";
					}
					line += word;
				}
			}
		}

		text.append(line);

		System.out.println(text.toString());

		if (scan != null) {
			scan.close();
		}
	}
}
