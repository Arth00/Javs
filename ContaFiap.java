package main;

import java.util.Calendar;

public class ContaFiap {
		//variavieis de instancia =  são variaveis universais no cód;
		int numero;
		int agencia;
		double saldo;
		Calendar dataAbertura;
		String tipo;
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
			// this = usado pra referenciar uma variável do mesmo nome, criada universalmente;
		};
		public void retirar(double valor) {
			saldo = saldo - valor;
			// void = usado quando o método não necessita usar RETURN;
			// sobrecarga de método = criar dois métodos com nomes iguais mas com parametros diferentes;
		};
		public void retirar(double valor,double taxa) {
			saldo = saldo -valor - taxa;
			// sobrecarga de método = criar dois métodos com nomes iguais mas com parametros diferentes; 
		}
		
		public ContaFiap(){
			
			new ContaFiap();
			
			ContaFiap cc = new ContaFiap();
			ContaFiap poupanca = new ContaFiap();
			
		};
		
		public double recupSaldo() {
			return saldo;
		};
		
		public void depositar(double valor) {
			saldo = saldo + valor;
		};
		
		public class Conta{
			
			double saldo;
			
			public Conta(double valor){
					
				saldo = valor;
				System.out.println("Criando uma instancia de conta...");
			}	
		};
		
		
}
