package main;

public class Conta {
		
				String cliente ;
				double saldo ;
				
				void exibeSaldo() {
					if(cliente =="Daniel" || cliente == "Pedro" ) {
						if(saldo > 0) {
					System.out.println(cliente + " Seu Saldo é " + saldo );
					}else {
						System.out.println(cliente + ", Você não tem saldo suficiente.");
						}
					}else {
						System.out.println("Acesso não autorizado , faça login na sua conta");
						}
	
				};
				void saque( double valorSaq) {
					saldo -= valorSaq;
					System.out.println("Saque efetuado no valor de :" + valorSaq);
				};
				void deposito(double valorDep ) {
					saldo += valorDep;
					System.out.println("Depósito efetuado no valor de : "+ valorDep);
				};
				void TransfValor(Conta Destino , double valorDestino) {
					this.saque(valorDestino);
					Destino.deposito(valorDestino);
				}

		}
