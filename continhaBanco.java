package contaBanco;

import java.util.*;

public class continhaBanco {
	        
	Scanner sc = new Scanner(System.in);
			
	        
	        double saldo1 ;
			int agencia ;
			int numeroConta ;			
			String nomeCliente;
			int senhaCliente;
			boolean clienteAutenticado;
			
			
			public continhaBanco() {};
			
			
			public continhaBanco(double saldo,double saldo1,int numeroConta,int agencia) {
				this.saldo1 = saldo1;
				this.agencia = agencia;
				this.numeroConta = numeroConta;
			};
			public void deposit( double valorD) {
				if(this.clienteAutenticado == true)
				this.saldo1 = saldo1 + valorD;
				else {
					System.out.println("A��o n�o permitida!!, O usu�rio n�o foi autenticado.");
					System.runFinalization(this.autentic());
				}
			};
			public void saque(double valorS) {
				if(this.clienteAutenticado == true)
				this.saldo1 = saldo1 - valorS;
				else{
					System.out.println("A��o n�o permitida!!, O usu�rio n�o foi autenticado.");
					System.runFinalization();
				}
					
			};
			public void verificarSaldo() {
				if(this.clienteAutenticado == true)
				System.out.println("Seu saldo atual � : " + this.saldo1);
				else {
					System.out.println("A��o n�o permitida!!, O usu�rio n�o foi autenticado.");
					System.runFinalization();
				}
			};
			public void autentic(){	
				System.out.println("Fa�a a autentica��o...");
				System.out.println("Digite o seu Nome");
				this.nomeCliente = sc.nextLine();
				System.out.println("Digite a sua senha");
				this.senhaCliente = sc.nextInt();
							
				if(nomeCliente == "Jo�o pedro" || senhaCliente == 10032022){
				   System.out.println("Bem vindo " + nomeCliente + ". Usu�rio Autenticado. ");
				   this.clienteAutenticado = true;
				  }
				else {
						this.clienteAutenticado = false;
					    System.out.println("Usu�rio n�o Identificado,acesso bloqueado");
						System.runFinalization();
					 }
			};			
		
}
