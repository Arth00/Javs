package main;

import java.util.Scanner;

public class prog1 {
	/* public static void main(String[]args) {
           int num1 = 12 ;
           int num2 = 17 ;
           int resl = num1 + num2;
           
           System.out.print(resl);
 	 };*/
	
	
	 public static void main(String[]args) {
		 
		 Scanner tkey = new Scanner(System.in);
		 int num1,num2 ;
		 
		 
		 System.out.println("Digite um número");
		 num1 = tkey.nextInt();
		 
		 System.out.println("Digte outro número");
		 num2 = tkey.nextInt();
		 
		 int resl = num1 + num2;
		 System.out.println("o Resultado é: "+ resl );
		 
		 
	 }
}
