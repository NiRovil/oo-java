package br.com.projeto.banco.util;

import java.util.ArrayList;
import br.com.projeto.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int numero = 5;
		int n2 = 4;
		int n3 = 7;
		
		lista.add(numero);
		lista.add(n2);
		lista.add(n3);
		
		boolean ex = lista.contains(4);
		
		System.out.println(ex);
		
		System.out.println(lista.size());
		
		for(int ref : lista) {
			System.out.println("Numero: " + ref);
		}
		
		
		ArrayList<Conta> lista2 = new ArrayList<Conta>();
		
		Conta c1 = new ContaCorrente(45, 45);
		Conta c2 = new ContaCorrente(45, 45);
		
		
		lista2.add(c1);
		lista2.add(c2);
		
		System.out.println(c1.equals(c2));
		
		
	}

}
