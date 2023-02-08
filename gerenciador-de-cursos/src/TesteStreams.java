import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteStreams {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Aluno 2", 5646);
		Aluno a2 = new Aluno("Aluno 6", 5687);
		Aluno a3 = new Aluno("Aluno 98", 679);
		Aluno a4 = new Aluno("Aluno 63", 329);

		System.out.println("--------------------");
		System.out.println("Trabalhando com lambdas e streams!");
		System.out.println("--------------------");

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		System.out.println(alunos);
		// Usando lambda method reference
		alunos.sort(Comparator.comparing(Aluno::getNumero));
		System.out.println(alunos);

		System.out.println("--------------------");

		alunos.forEach(a -> System.out.println(a.getNome()));

		System.out.println("--------------------");
		
		//filtrando itens com stream
		alunos.stream()
			.filter(a -> a.getNumero() >= 5000)
			.forEach(a -> System.out.println(a.getNome()));

		System.out.println("--------------------"); 
		
		//filtrando itens com stream e devolvendo para o usuário seu número
		alunos.stream()
			.filter(a -> a.getNumero() >= 5000)
			.map(Aluno::getNumero)
			.forEach(System.out::println);

		System.out.println("--------------------");
		
		//voltando de uma stream para um collection usando Collectors
		List<Aluno> resultado = alunos.stream()
									.filter(a -> a.getNumero() >= 5000)
									.collect(Collectors.toList());
		
		System.out.println(resultado);
		
		System.out.println("--------------------");
		
		//podemos transformar o modelo de uma lista em outras usando Collectors
		Map<String, Integer> mapa = alunos.stream()
										.collect(Collectors.toMap(a -> a.getNome(), a -> a.getNumero()));
		
		//ou usando method reference
		Map<String, Integer> mapa2 = alunos.stream()
										.collect(Collectors.toMap(Aluno::getNome, Aluno::getNumero));
		
		System.out.println(mapa);
		System.out.println(mapa2);
		
		System.out.println("--------------------");
		
		//usando forEach em mapas
		mapa.forEach((nome, numero) -> System.out.println(nome + " " + numero));
		
		
	}

}