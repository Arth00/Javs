package main;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
       		Scanner keys = new Scanner(System.in);
       		
       		System.out.println("Digite o valor de A: ");
       		int a = keys.nextInt();
       		
       		System.out.println("Digite o valor de B: ");
       		int b = keys.nextInt();
       		;
       		if(a != b) {
       		int c = a;
       		    a = b;
       		    b = c;
       		    
       		    System.out.println("Valores atualizados");
       		    System.out.println("Valor de A : " + a);
       		    System.out.println("Valor de B : " + b);
       		    
       		}
       				

	}

}
