package contaBanco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class continhaBanco {
	        
	Scanner sc = new Scanner(System.in);
	JOptionPane inp = new JOptionPane();
	
	clienteBanco cliente = new clienteBanco();
			
	        
	        float saldo1 ;
			int agencia ;
			int numeroConta ;			
			String nomeCliente = this.cliente.nomeCliente;
			int senhaCliente = this.cliente.senhaCliente;
			boolean clienteAutenticado;
			
			
			public continhaBanco() {};
			
			
			public float saldo() {
				return this.saldo1;
			}
			
			public continhaBanco(double saldo,float saldo1,int numeroConta,int agencia) {
				this.saldo1 = saldo1;
				this.agencia = agencia;
				this.numeroConta = numeroConta;
			};
			public void deposit(float valorD) {
				if(this.clienteAutenticado == true)
					this.saldo1 = saldo1 + valorD;
				else {
					System.out.println("A��o n�o permitida!!, O usu�rio n�o foi autenticado.");
					System.gc();
				}
			};
			public void saque(float valorS) {
				if(this.clienteAutenticado == true)
				this.saldo1 = saldo1 - valorS;
				else{
					System.out.println("A��o n�o permitida!!, O usu�rio n�o foi autenticado.");
					System.runFinalization();
				}
					
			};
			public void verificarSaldo() {
				if(this.clienteAutenticado == true)
				System.out.println("Seu saldo atual � : " + saldo());
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
							
				if(nomeCliente == "Arthur Ribeiro" || senhaCliente == 14112002){
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
