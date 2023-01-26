package br.com.projeto.banco.testes;
import br.com.projeto.banco.modelo.Conta;
import br.com.projeto.banco.modelo.ContaPoupanca;
import br.com.projeto.banco.modelo.SaldoInsuficiente;

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
