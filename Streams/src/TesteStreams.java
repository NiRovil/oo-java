import java.util.ArrayList;
import java.util.List;

public class TesteStreams {

	public static void main(String[] args) {

		Curso colecoes = new Curso("Curso1", "Inst1");
		colecoes.adiciona(new Aula("Aula1", 21));
		colecoes.adiciona(new Aula("Aula5", 56));
		colecoes.adiciona(new Aula("Aula4", 23));
		colecoes.adiciona(new Aula("Aula3", 16));
		colecoes.adiciona(new Aula("Aula2", 98));
		
		Aluno a1 = new Aluno("Aluno 2", 5646);
		Aluno a2 = new Aluno("Aluno 6", 5687);
		Aluno a3 = new Aluno("Aluno 98", 679);
		Aluno a4 = new Aluno("Aluno 63", 329);
		
		colecoes.matricula(a1);
		colecoes.matricula(a2);
		colecoes.matricula(a3);
		colecoes.matricula(a4);
		
		System.out.println("Alunos matriculados: ");
		colecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		System.out.println(colecoes.matriculado(a1));
		
		//Trabalhando com o método equals
		Aluno novo = new Aluno("Aluno2", 5646);
		System.out.println(novo.equals(a1));
		
		System.out.println("--------------------");
		System.out.println("Trabalhando com lambdas e streams!");
		System.out.println("--------------------");
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
	
	}

}