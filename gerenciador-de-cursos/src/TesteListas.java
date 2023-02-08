import java.util.ArrayList;

public class TesteListas {

	public static void main(String[] args) {
		String aula1 = "Aula 1";
		String aula2 = "Aula 2";
		String aula3 = "Aula 3";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		
		//Adicionando itens na lista.
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		//Removendo itens da lista.
		aulas.remove(0);
		
		System.out.println(aulas);
		
		System.out.println("-----------------");
		
		//Mostrando as aulas separadas da forma tradicional
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println("-----------------");
		
		//Mostrando as aulas separadas usando um lambda
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("-----------------");
		
		//Mostrando as aulas separadas usando o mesmo lambda porém de forma mais enxuta
		//method reference
		aulas.forEach(System.out::println);
		
	}

}
