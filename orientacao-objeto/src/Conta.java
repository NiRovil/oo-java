class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	//static compartilha atributos com todos os objetos, ou seja, faz referencia a classe como um todo
	//torna em um atributo da classe.
	//Cliente.totalDeContas;
	private static int totalDeContas;
	//definindo um atributo do tipo cliente
	private Cliente titular;
	
	
	//construtor, geralmente inicializado automaticamente
	public Conta(int agencia, int numero) {
		totalDeContas++;
		System.out.println("O total de contas criadas é de: " + totalDeContas);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;	
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//método da classe
	public static int getTotalDeContas() {
		return totalDeContas;
	}
}