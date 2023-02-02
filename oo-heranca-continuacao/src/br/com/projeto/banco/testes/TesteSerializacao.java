package br.com.projeto.banco.testes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.projeto.banco.modelo.Cliente;
import br.com.projeto.banco.modelo.ContaCorrente;

public class TesteSerializacao{

	public static void main(String[] args) throws IOException{
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nicolas");
		cliente.setProfissao("Dev");
		
		ContaCorrente cc = new ContaCorrente(111, 333);
		cc.setTitular(cliente);
		cc.deposita(986.23);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("os.bin"));
		os.writeObject(cc);
		os.close();
		
	}

}
