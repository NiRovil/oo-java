
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente nicolas = new Gerente();
		nicolas.setNome("Nicolas Vilela");
		nicolas.setCpf("12345678910");
		nicolas.setSalario(2400.00);
		
		System.out.println(nicolas.getNome());
		System.out.println(nicolas.getBonificacao());
		
	}

}
