package conhecimentos;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(66, 88);
		Cliente c = new Cliente("Nicolas", 55562, 88975);
		
		cc.setCliente(c);
		
		int cpf = cc.getCliente().getCpf();
		
		System.out.println(cpf);
		
		
		
		
	}

}
