package br.com.projeto.banco.modelo;

public class GuardaConta {
	
	//criação literal de um array
	//Object[] lista = new Object[5];
	
	//definindo um array
	//int[] array = {2,3};

	
	private Conta[] referencias;
	private int elemento;
	
	public GuardaConta() {
		this.referencias = new Conta[10];
	}
	
	public void adiciona(Conta ref) {
		this.referencias[elemento] = ref;
		this.elemento++;
	}

	public Conta getRef(int pos) {
		return this.referencias[pos];
	}
	
}
