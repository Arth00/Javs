package main;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
    
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Informe o Nome do Vendedor :");
	    String Nmv = keys.nextLine();
     	
	    System.out.println("Informe o Sal�rio do Vendedor :");
	    float Slv = keys.nextFloat();
	    
	    System.out.println("agora,Especifique o total de vendas do funcion�rio :");
	    float Tlv = keys.nextFloat();
	    
	   double Cmv = (Tlv * 0.15 + Slv); 
	   
	   System.out.print(" vendedor:  "+Nmv+
			            " Sal�rio Atual: "+Slv+
			            " Sal�rio no final deste m�s: "+ Cmv);
		
     }
}