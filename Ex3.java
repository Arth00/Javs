package main;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		System.out.println("Didite a distancia percorrida");
		int distancia = keys.nextInt();
		
		System.out.println("Agora,  digite a quantidade de gasolina no tanque");
		int gasolina = keys.nextInt();
		
		int mediaG = distancia / gasolina ;
		System.out.printf("a media gasta por KM pelo seu carro é " + mediaG + " litros !");
		 
		
		

	}

}
