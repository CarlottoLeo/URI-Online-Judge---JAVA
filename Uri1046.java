package myproject;

import java.io.*;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
        String read = input.readLine();
        String[] value = read.split(" ");
 
        int timeI = Integer.parseInt(value[0]);
        int timeF = Integer.parseInt(value[1]);
 		int total = ((24 - timeI) + timeF) > 24 ? (timeF - timeI) : ((24 - timeI) + timeF);
        System.out.println("O JOGO DUROU " + total + " HORA(S)");
	}
}