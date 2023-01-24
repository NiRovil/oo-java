
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficiente{
		super.saca(valor + 2);
	}

}
