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
		
		//Mostrando as aulas separadas
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		aulas.forEach(aula -> System.out.println(aula));
		
	}

}
