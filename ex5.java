package main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex5 {

	public static void main(String[] args) {
		
            Scanner keys = new Scanner(System.in);
            DecimalFormat decimal = new DecimalFormat("00.0");
            
            
            System.out.println("Informe o nome do aluno :");
            String NmA = keys.nextLine();
            
            System.out.println("Informe a primeira nota :");
            float Nt1 = keys.nextFloat();
            
            System.out.println("Informe a segunda nota :");
            float Nt2 = keys.nextFloat();
            
            System.out.println("Informe a terceira nota : ");
            float Nt3 = keys.nextFloat();
            
            float Media = (((Nt1 + Nt2) + Nt3)/3) ;
            
            System.out.println("Nome do aluno: " + NmA);
            System.out.println("Média de Notas: "+ (decimal.format(Media)) );
            
            
            

	}

}
