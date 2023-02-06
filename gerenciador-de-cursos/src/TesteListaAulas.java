import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas {

	public static void main(String[] args) {

		Aula a1 = new Aula("Aula1", 50);
		Aula a2 = new Aula("Aula2", 15);
		Aula a3 = new Aula("Aula3", 23);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//Chama o método toString
		System.out.println(aulas);
		
		//Chama o método compareTo
		Collections.sort(aulas);
		
		//Usando sem implementar o método comapareTo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//ou usando somente o metodo sort()
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}
