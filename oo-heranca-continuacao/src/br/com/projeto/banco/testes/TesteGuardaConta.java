package br.com.projeto.banco.testes;

import br.com.projeto.banco.modelo.*;

public class TesteGuardaConta {

	public static void main(String[] args) {
		
		GuardaConta	guarda = new GuardaConta();
		
		Conta cc = new ContaCorrente(10, 50);
		
		guarda.adiciona(cc);
		
		Conta ref = guarda.getRef(0);
		System.out.println(ref.getNumero());
		
	}

}
