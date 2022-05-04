package main;
import java.util.Scanner ;


public class EnderecoKeys {
    public static void main(String[] args) {
        
    Scanner Keys = new Scanner(System.in);
    
        System.out.print("Digite seu Nome: ");
        String nome = Keys.nextLine();
        
        System.out.print("Informe o nome da sua Cidade: ");
        String cidade=Keys.nextLine();
        
        System.out.println("---------------------------");
        System.out.println("ola " + nome);
        System.out.println("Voce mora em: " + cidade);
        Keys.close();
        
    }
               
};