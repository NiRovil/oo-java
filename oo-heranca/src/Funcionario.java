
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected define o escopo do atributo somente para a classe e os filhos dessa classe
	//protected double salario;
	private double salario;
	
	public abstract double getBonificacao(); 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
}
