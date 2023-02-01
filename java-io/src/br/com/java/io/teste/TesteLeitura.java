package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException{
		
		//Fluxo de Entrada com Arquivo
		InputStream file = new FileInputStream("lorem.txt");
		Reader reader = new InputStreamReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		
		buffer.close();
		
		//Fluxo de Saida com Arquivo
		OutputStream file1 = new FileOutputStream("file.txt");
		Writer writer = new OutputStreamWriter(file1);
		BufferedWriter wbuffer = new BufferedWriter(writer);
		
		wbuffer.write("texto teste");
		wbuffer.newLine();
		wbuffer.write("mais texto teste");
		
		wbuffer.close();
		
		
		//forma mais simplificada de escrever um arquivo de texto
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Texto testeeeee");
		bw.close();
		
		//outra forma de escrever um arquivo de texto
		PrintStream ps = new PrintStream("lorem3.txt");
		ps.println("Texto teste 3");
		ps.println();
		
		ps.close();
		
	}

}
