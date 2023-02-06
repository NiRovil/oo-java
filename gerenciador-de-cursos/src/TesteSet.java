import java.util.Collection;
import java.util.HashSet;

public class TesteSet {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Aluno 1");
		alunos.add("Aluno 3");
		alunos.add("Aluno 2");
		alunos.add("Aluno 4");
		alunos.add("Aluno 6");
		alunos.add("Aluno 5");
		alunos.add("Aluno 7");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos);
		
	}

}
