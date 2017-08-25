package myproject;

import java.io.*;
import java.util.*;


public class Uri1021 {
	

		public static void main(String[] args) throws IOException {
	 
	 	Scanner scan = new Scanner(System.in);
	 	double value = 0.0;
	    int notesMoney100,notesMoney50=0,notesMoney20=0,notesMoney10=0,notesMoney5=0,notesMoney2=0,
	    		coins1=0,coins050=0,coins025=0,coins005=0,coins010=0,coins001=0;
	 	
	 	value = scan.nextDouble();
	 	
	 	notesMoney100=(int) (value/100);
	    value=value-(notesMoney100*100);
	    while(value>=50.00)
	    {
	        value=value-50.00;
	        notesMoney50++;
	    }
	    while (value>=20.00)
	    {
	        value=value-20.00;
	        notesMoney20++;
	    }
	    while (value>=10.00)
	    {
	        value=value-10.00;
	        notesMoney10++;
	    }
	    while (value>=5.00)
	    {
	        value=value-5.00;
	        notesMoney5++;
	    }
	    while (value>=2.00)
	    {
	        value=value-2.00;
	        notesMoney2++;
	    }
	    System.out.printf("NOTAS:\n");
	    System.out.printf("%d nota(s) de R$ 100.00\n",notesMoney100);
	    System.out.printf("%d nota(s) de R$ 50.00\n",notesMoney50);
	    System.out.printf("%d nota(s) de R$ 20.00\n",notesMoney20);
	    System.out.printf("%d nota(s) de R$ 10.00\n",notesMoney10);
	    System.out.printf("%d nota(s) de R$ 5.00\n",notesMoney5);
	    System.out.printf("%d nota(s) de R$ 2.00\n",notesMoney2);
	 	
	    while (value>=1.00)
	    {
	        value=value-1.00;
	        coins1++;
	    }
	    while (value>=0.50)
	    {
	        value=value-0.50;
	        coins050++;
	    }
	    while (value>=0.25)
	    {
	        value=value-0.25;
	        coins025++;
	    }
	    while (value>=0.10)
	    {
	        value=value-0.10;
	        coins010++;
	    }
	    while (value>=0.05)
	    {
	        value=value-0.05;
	        coins005++;
	    }
	    while (value>=0.001 && value<=0.999 )
	    {	
	        value=value-0.01;
	        coins001++;
	    }
	    System.out.printf("MOEDAS:\n");
	    System.out.printf("%d moeda(s) de R$ 1.00\n",coins1);
	    System.out.printf("%d moeda(s) de R$ 0.50\n",coins050);
	    System.out.printf("%d moeda(s) de R$ 0.25\n",coins025);
	    System.out.printf("%d moeda(s) de R$ 0.10\n",coins010);
	    System.out.printf("%d moeda(s) de R$ 0.05\n",coins005);
	    System.out.printf("%d moeda(s) de R$ 0.01\n",coins001);
	    
	}
}
