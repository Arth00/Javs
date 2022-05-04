package main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("$000.00");
		
    	float myReal,cTotal,myDol;
    	
    	System.out.println("Digite a cotação do dólar: ");
    	myDol = keys.nextFloat();
    	
    	System.out.println("Digite o valor em Reais : ");
    	myReal = keys.nextFloat();
    	
    	cTotal = (myReal/myDol);
    	
    	System.out.println("Você tem  " + (df.format(cTotal)) + " Dólars.");
    	
    	
    	
			
         
	}

}
