package main;

import java.util.Scanner;

public class prog2 {
      public static void main(String[]args) {
    	  Scanner tkeys = new Scanner(System.in);
    	  
    	  System.out.println("Digite um valor");
    	  float va1 = tkeys.nextInt();
    	  
    	  System.out.println("Digite um segundo valor");
    	  float va2 = tkeys.nextInt();
    	  
    	  float Soma = va1 + va2;
    	  float Subtrair = va1 - va2;
    	  float Multiplique = va1 * va2;
    	  float Dividir = va1 / va2;
    	  
    	  if(va2 <= 0 || va1 <=0 ) {
    		  
    	  }
      }
     	
}
