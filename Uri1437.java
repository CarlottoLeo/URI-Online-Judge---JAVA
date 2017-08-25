package myproject;


import java.io.*;


public class Uri1437 {
	
	//TERMINAR
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[] directions = {'N', 'L', 'S', 'O'};
        String Line;

        int contD, contE, get, rotations;

        while (!(Line = read.readLine()).equals("0")) {
            Line = read.readLine();
            get = Line.length(); //saving original length of string
            Line = Line.replaceAll("E", "");
            contD = Line.length();
            contE = get - contD;

            if (contD >= contE) {
                rotations = (contD - contE) % 4;
            } else {
                rotations = (contE - contD) % 4;
                if (rotations % 2 != 0) {
                    rotations = (rotations == 3) ? 1 : 3;
                }
            }
            System.out.println(directions[rotations]);
        }
        out.close();
	}
}
