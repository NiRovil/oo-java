package br.com.projeto.banco.util;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int numero = 5;
		int n2 = 4;
		int n3 = 7;
		
		lista.add(numero);
		lista.add(n2);
		lista.add(n3);
		
		
		System.out.println(lista.size());
		
		for(int ref : lista) {
			System.out.println("Numero: " + ref);
		}
		
		
	}

}
