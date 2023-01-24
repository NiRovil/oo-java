
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.Dados();
		} catch (TesteExcecao ex) {
			System.out.println("Erro no sistema");
		}
		
		
	}

}
