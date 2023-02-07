
public class Aluno {

	private String nome;
	private int numero;

	public Aluno(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumero() {
		return this.numero;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	//Quando trabalhando com equals, devemos sobrescrever também o método
	//hashcode para que falicite a identificacao do objeto
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
