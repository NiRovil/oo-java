public class Condicionais {
	public static void main(String[] args) {

		int idade = 24;
		
		if (idade >= 18) {
			System.out.println("Maior de 18 anos!");
		} else if (idade < 18) {
			System.out.println("Menor de 18 anos!");
		}
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("For somando!");
		}
		
		int cont = 0;
		while (cont <= 10) {
			System.out.println("While somando!");
			cont++;
		}
	}
}