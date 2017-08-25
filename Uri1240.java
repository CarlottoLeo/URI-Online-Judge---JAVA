package myproject;

import java.io.*;


public class Uri1240 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) throws IOException {

		int nCase = Integer.parseInt(in.readLine());
		int diff = 0;
        String valueA, valueB;
        String[] line;
        while (nCase-- > 0) {
            line = in.readLine().split(" ");
            valueA = line[0];
            valueB = line[1];
            diff = valueA.length() - valueB.length();
            if (0 > diff) {
                System.out.println("nao encaixa");
            } else if (valueA.substring(diff).equals(valueB)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        System.out.close();
	}
}
