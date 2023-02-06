import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteRelacionamento {

	public static void main(String[] args) {

		Curso colecoes = new Curso("Curso1", "Inst1");
		colecoes.adiciona(new Aula("Aula1", 21));
		colecoes.adiciona(new Aula("Aula5", 56));
		colecoes.adiciona(new Aula("Aula4", 23));
		colecoes.adiciona(new Aula("Aula3", 16));
		colecoes.adiciona(new Aula("Aula2", 98));
		
		//trabalhando com uma lista imutável
		List<Aula> aulasImutaveis = colecoes.getAula();
		//ger uma exception do tipo UnsupportedOperation
		//Collections.sort(aulasImutaveis);
		System.out.println(aulasImutaveis);
		
		//Para definir uma nova lista, agora mutável basta atribuir um construtor passando a lista
		//imutável como parâmetro
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		
	}

}
