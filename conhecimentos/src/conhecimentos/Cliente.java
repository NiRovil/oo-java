package conhecimentos;

public class Cliente {
	private String nome;
	private int cpf;
	private int cep;
	
	public Cliente(String newNome, int newCpf, int newCep) {
		System.out.println("Criando um novo cliente: " + newNome);
		this.setNome(newNome);
		this.setCep(newCep);
		this.setCpf(newCpf);
	}
	
	private void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public String getNome() {
		if (this.nome.isEmpty()) {
			System.out.println("Cliente não cadastrado!");
			return "";
		}
		return this.nome;
	}
	
	private void setCpf(int newCpf) {
		this.cpf = newCpf;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
	private void setCep(int newCep) {
		this.cep = newCep;
	}
	
	public int getCep() {
		return this.cep;
	}
	
	
}
