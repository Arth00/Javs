package main;

import java.util.Calendar;

public class ContaFiap {
		//variavieis de instancia =  s�o variaveis universais no c�d;
		int numero;
		int agencia;
		double saldo;
		Calendar dataAbertura;
		String tipo;
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
			// this = usado pra referenciar uma vari�vel do mesmo nome, criada universalmente;
		};
		public void retirar(double valor) {
			saldo = saldo - valor;
			// void = usado quando o m�todo n�o necessita usar RETURN;
			// sobrecarga de m�todo = criar dois m�todos com nomes iguais mas com parametros diferentes;
		};
		public void retirar(double valor,double taxa) {
			saldo = saldo -valor - taxa;
			// sobrecarga de m�todo = criar dois m�todos com nomes iguais mas com parametros diferentes; 
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
