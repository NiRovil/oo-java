package application;

import java.util.Scanner;

/*
 * Aprendendo a trabalhar com vetores.
 */

public class Negativos {

	public static void main(String[] args) {
		
		int i = 0;
		int n;
	
		Scanner numeros = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar?");
		n = numeros.nextInt();
		int[] vetor = new int[n];
		
		while(i < n) {
			System.out.println("Digite um número: ");
			vetor[i] = numeros.nextInt();
			i++;
		}
		
		System.out.println("Numeros negativos: ");
		
		for (int j : vetor) {
			if (j < 0) {
				System.out.println(j);
			}
		}
		
		numeros.close();
		
	}

}
