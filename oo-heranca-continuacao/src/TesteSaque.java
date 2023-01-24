
public class TesteSaque {

	public static void main(String[] args) {
		
		Conta cp = new ContaPoupanca(206, 63);
		cp.deposita(100);
		
		try {
			cp.saca(150);
		} catch (SaldoInsuficiente ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
