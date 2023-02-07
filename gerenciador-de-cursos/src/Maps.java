
public class Maps {
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
		
		System.out.println(a1);
		
		System.out.println("Aluno matriculado sob o numero 5646");
		Aluno aluno = colecoes.buscaMatriculado(5646);
		System.out.println("Mapeado: " + aluno);
		
	}
}
