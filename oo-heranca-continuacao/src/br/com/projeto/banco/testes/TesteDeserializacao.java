package br.com.projeto.banco.testes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.projeto.banco.modelo.*;

public class TesteDeserializacao {

	public static void main(String[] args) throws Exception{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("os.bin"));
		ContaCorrente cc = (ContaCorrente) is.readObject();
		
		is.close();
		
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular().getNome());
	}

}
