package main;

public class Conta {
		
				String cliente ;
				double saldo ;
				
				void exibeSaldo() {
					if(cliente =="Daniel" || cliente == "Pedro" ) {
						if(saldo > 0) {
					System.out.println(cliente + " Seu Saldo � " + saldo );
					}else {
						System.out.println(cliente + ", Voc� n�o tem saldo suficiente.");
						}
					}else {
						System.out.println("Acesso n�o autorizado , fa�a login na sua conta");
						}
	
				};
				void saque( double valorSaq) {
					saldo -= valorSaq;
					System.out.println("Saque efetuado no valor de :" + valorSaq);
				};
				void deposito(double valorDep ) {
					saldo += valorDep;
					System.out.println("Dep�sito efetuado no valor de : "+ valorDep);
				};
				void TransfValor(Conta Destino , double valorDestino) {
					this.saque(valorDestino);
					Destino.deposito(valorDestino);
				}

		}
