package myproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1214 {
	
	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("0.000");		
		Scanner scan = new Scanner(System.in);

		int nCase = 0;
		int nPerson = 0;
        int soma=0, acima=0;
        double media = 0.0;
		int i;
		int[] vetor;
		
        vetor = new int[1001];
		nCase = scan.nextInt();
		
		for(int j = 0; j < nCase; j++) {
			nPerson = scan.nextInt();
			media = 0;
            soma=0; 
            acima=0;
            
            for(i=0;i<nPerson;i++){
                vetor[i] = scan.nextInt();
            }
            for(i=0;i<nPerson;i++){
                soma+=vetor[i];
            }
            media=soma/nPerson;
            for(i=0;i<nPerson;i++){
                if(vetor[i]>media)
                    acima++;
            }
            media=((double)acima/nPerson);
            media = media *100;
           
            System.out.println(formatter.format(media) + "%");            
		}
		
	}
}
