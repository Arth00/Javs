package main;

import java.lang.module.ModuleDescriptor.Exports;
import java.util.Scanner;

public class Tabuada1 {
    public static void main(String[]args) {
        
        Scanner Keys= new Scanner(System.in);
        int i , n ;

        System.out.printf("Informe o Numero da Taboada :");
        n = Keys.nextInt();

        System.out.printf("+-----------Resultado--------------+");

        for(i=1; i<=10;i++ ){
            System.out.println(i + " x "+ n + " = " + (i*n));
        }
        System.out.println("+--------------------------------+");


        }
    }