
public class ControleBonificacao {
	private double soma;
	
	//aplicando o conceito de polimorfismo declarando uma variável do tipo Funcionario	
	//ou seja, declarando um tipo mais generico da classe
	//assim que o método for chamado o compilador vai análisar qual classe específica chamar
	public void registro(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}
