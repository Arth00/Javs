package main;

import java.util.Scanner;


public class imc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int peso ;
		float altura;
		
		try {
			System.out.println("Digite o seu peso");
			peso = sc.nextInt();
			
			System.out.println("Digite a sua altura ");
			altura =sc.nextFloat();
		 
			var imc =  altura * altura / peso; 
			
			if(imc >= 18.5 && imc <= 25 ) {
					System.out.print("Voc� est� no peso ideal seu IMC � :" + imc);
			}else { 
				System.out.print("Voc� n�o est� no peso ideal, seu IMC � : " + imc);
			}
			
	    } finally {
	    	System.out.println();
			System.out.println("Programa finalizado... Criado por Arthur Ribeiro. ");
			System.out.println();
		}

	}

}
