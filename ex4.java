package main;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
    
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Informe o Nome do Vendedor :");
	    String Nmv = keys.nextLine();
     	
	    System.out.println("Informe o Salário do Vendedor :");
	    float Slv = keys.nextFloat();
	    
	    System.out.println("agora,Especifique o total de vendas do funcionário :");
	    float Tlv = keys.nextFloat();
	    
	   double Cmv = (Tlv * 0.15 + Slv); 
	   
	   System.out.print(" vendedor:  "+Nmv+
			            " Salário Atual: "+Slv+
			            " Salário no final deste mês: "+ Cmv);
		
     }
}