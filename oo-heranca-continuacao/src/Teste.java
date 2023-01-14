
public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(206, 26);
		cc.deposita(120.20);
		
		ContaPoupanca cp = new ContaPoupanca(26, 206);
		cp.deposita(500);
		
		//cp.saca(5);
		cc.transfere(50, cp);
		cp.transfere(50, cc);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
