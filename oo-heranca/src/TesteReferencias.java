
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(2500.00);
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.setSalario(3000.00);

		ControleBonificacao controle = new ControleBonificacao();
		
		//passando para o método registro duas referencias que respondem a mesma classe
		//que no caso é a Funcionario, já que Gerente é uma classe filha
		controle.registro(gerente);
		//controle.registro(funcionario);
		
		System.out.println(controle.getSoma());
	}

}
