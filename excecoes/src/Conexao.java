

//implementando AutoCloseable para omitir um finally e melhorar a legibilidade do código
public class Conexao implements AutoCloseable{
	public Conexao (){
		System.out.println("Abrindo conexao");
	}
	
	public void Dados() {
		System.out.println("Recebendo dados");
		throw new TesteExcecao("Conexao falhou");
	}
	
	@Override
	public void close() {
		System.out.println("Fechando a conexão");
	}
}
