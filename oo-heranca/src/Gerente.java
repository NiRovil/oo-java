
public class Gerente extends Funcionario implements Autenticavel {
	
	//reescrevendo o método
	@Override
	public double getBonificacao() {
		//super para enxergar metodos e atributos da classe mae
		System.out.println("Testando o polimorfismo da classe Gerente!");
		return super.getSalario();
	}
	
	private Autenticador autenticador;
	
	public Gerente () {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
