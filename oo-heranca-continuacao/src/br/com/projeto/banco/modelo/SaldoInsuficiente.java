package br.com.projeto.banco.modelo;

//usando exceptions checked
public class SaldoInsuficiente extends Exception {
	
	public SaldoInsuficiente (String msg) {
		super(msg);
	}

}
