package conhecimentos;

public abstract class Conta {
	
	private int numero;
	private int agencia;
	private int saldo;
	
	private Cliente cliente;
	
	public Conta(int newNumero, int newAgencia) {
		System.out.println("Criando uma nova conta com agencia: " + newAgencia + ", e numero: " + newNumero);
		this.setNumero(newNumero);
		this.setAgencia(newAgencia);
	}
	
	public void setCliente(Cliente newCliente) {
		this.cliente = newCliente;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(int newSaldo) {
		this.saldo = newSaldo;
	}
	
	public void setNumero(int newNumero) {
		this.numero = newNumero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int newAgencia) {
		this.agencia = newAgencia;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
