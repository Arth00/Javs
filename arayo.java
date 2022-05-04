package main;

import javax.swing.JOptionPane;
import java.util.Arrays;
//import java.util.Scanner;

/*CÓDIGO PARA CRIAÇÃO DE ARRAYS - CASO PRECISE*/

public class arayo {
			@SuppressWarnings("static-access")
			public static void main(String[]args) {
				
				String[] paises = {"Brasil","Rússia","India","China"};
				
				System.out.println(paises[0]);
				System.out.println(Arrays.toString (paises));
				
				int posicao = Arrays.binarySearch(paises,"Brasil");
				System.out.println(posicao);
				
				Arrays.sort(paises, 0 ,paises.length);//ordena o array a iniciar por zero 
				System.out.println(Arrays.toString(paises));// resultado na tela
				
	/*****************************Exercícios usando vetores, loop e InputDialog*******************************/							
				
				
				//Scanner sc = new Scanner(System.in);
				JOptionPane inp = new JOptionPane();
				
				//guardando as notas no vetor
				float num ;
				float aray[] = new float[10];
				for(int i=0; i< aray.length;i++) {
					
					num = Float.parseFloat(inp.showInputDialog("digite a nota do aluno ..."));
					
					aray[i] = num;
					
					System.out.println("nota salva com sucesso: " + aray[i]);					
				}
				//calculando as notas que estão no vetor
				float totalNotas = 0; 
				for (int i=0;i < aray.length;i++) {
					totalNotas += aray[i];
				}
				float media = totalNotas/aray.length;
				System.out.println(" ");
				System.out.println("A média dos alunos é : "+ media);
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
}
