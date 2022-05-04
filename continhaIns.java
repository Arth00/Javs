package contaBanco;

public class continhaIns {

	public static void main(String[] args) {
		continhaBanco cc = new continhaBanco();
		
		cc.cliente.nomeCliente = "Arthur Ribeiro";
		cc.cliente.idade = 19;
		cc.cliente.senhaCliente = 14112002;
		
		cc.autentic();
		cc.saldo1 = 1200;
		cc.saldo();
		
		cc.deposit(2000);
		cc.saque(540);
		cc.verificarSaldo();
		
		System.out.println(cc.cliente.nomeCliente);
		
	}

}
