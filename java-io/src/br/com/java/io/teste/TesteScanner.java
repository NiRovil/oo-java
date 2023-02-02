package br.com.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		System.out.println(scan.hasNextLine()); 
		
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			System.out.println(linha);
			
			Scanner linhas = new Scanner(linha);
			linhas.useDelimiter(",");
			System.out.println(linhas.next());
			
			linhas.close();
			
			
			//Iterando para mostrar os itens
//			for (String string : linha.split(",")) {
//				System.out.println(string);
//			}
			
			//Criando um array dos itens
//			System.out.println(Arrays.toString(linha.split(",")));
			
			System.out.println();
		}
		
		
		scan.close();
		
	}

}
