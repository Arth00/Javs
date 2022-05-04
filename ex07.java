package main;

import java.util.Scanner;

public class ex07 {
          
	public static void main(String[]args) {
		
		Scanner keys = new Scanner(System.in);
	    
		float C,F,vrl;
		
		System.out.println("Digite a temperatura em Celsius : ");
		C = keys.nextFloat();
		
		vrl = (F=(9*C+160)/5);
		
		System.out.println("A temperatua convertida de Farenheit é : " + vrl);
		
	}
	
	
	
}
