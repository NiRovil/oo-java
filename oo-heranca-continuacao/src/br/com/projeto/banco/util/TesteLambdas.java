package br.com.projeto.banco.util;

import java.util.*;
import br.com.projeto.banco.modelo.*;

public class TesteLambdas {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
        
        //Lambda
        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        
        System.out.println("-----------");
        
        
        //Lambda
        lista.forEach((conta) -> System.out.println(conta.getNumero()));
        
        System.out.println("------------");
        
        for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
        
	}

}
