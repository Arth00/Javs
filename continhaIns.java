package contaBanco;

public class continhaIns {

	public static void main(String[] args) {
		continhaBanco cc = new continhaBanco();
		
		//cc.autentic();
		cc.saldo1 = 1200;
		
		cc.deposit(2000);
		cc.saque(540);
		cc.verificarSaldo();
		
	}

}
