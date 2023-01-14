
public class TestaGerente {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		
		nico.setNome("Nicolas Vilela");
		nico.setCpf("12345678910");
		nico.setSalario(3200.00);
		nico.setSenha(123);
		
		//metodos comuns da classe funcionario
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());
		
		//metodos exclusivos da classe gerente
		System.out.println(nico.autentica(123));
		
		System.out.println(nico.getBonificacao());
		
	}
}
