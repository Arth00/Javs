package main;

public class stringos {

	public static void main(String[] args) {
		
	String nome = "FECAF";
	String slogan = "a melhor faculdade de Tecnologia � a cabe�a da ....";
	String Facul = nome.concat(" - ").concat(slogan);
	System.out.println(Facul);
	
	String nome1 = "FIAP";
	String nome2 = new String("FIAP");
	if (nome1.equals(nome2)){
	    System.out.println("As Strings s�o iguais");
	}else{
	    System.out.println("As Strings s�o diferentes");
	
	}


  }

}	
	
