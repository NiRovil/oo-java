
public class Adm extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}
	
	private Autenticador autenticador;
	
	public Adm() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador = new Autenticador();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	

}
