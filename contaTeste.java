package main;

public class contaTeste {
	public static void main(String[]args) {
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 6_000.00 ;
		//conta.saque(2000.00);
		//conta.deposito(1500.00);
		conta.exibeSaldo();
		
		Conta Destino = new Conta();
		Destino.cliente = "Pedro";
		Destino.saldo = 500.00;
		//Destino.TransfValor(conta, 300);
		Destino.exibeSaldo();
		Destino.deposito(1500.00);
		
		
	}

}
