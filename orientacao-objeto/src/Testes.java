public class Testes {
	public static void main(String[] args) {
		
		//instanciando o objeto e
		//acessando o atributo saldo do objeto
		Conta conta1 = new Conta(206, 555);
		conta1.deposita(200);
		
		System.out.println("Saldo da conta 1: " + conta1.getSaldo());
		
		//usando metodos (funcoes)
		
		Conta conta2 = new Conta(330, 659);
		conta2.deposita(500);
		
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
		
		conta2.saca(30);
		System.out.println("Novo saldo da conta 2: " + conta2.getSaldo());
		
		conta2.transfere(100, conta1);
		System.out.println("Novo saldo apos transferencia conta 1: " + conta1.getSaldo());
		System.out.println("Novo saldo apos transferencia conta 2: " + conta2.getSaldo());
		
		//instanciando um objeto do tipo cliente
				
		Cliente nicolas = new Cliente();
		nicolas.setNome("Nicolas");
		conta1.setTitular(nicolas);

		
		System.out.println("Titular da conta: " + conta1.getTitular().getNome());
		
		//usando os metodos get e set
		
		conta1.setAgencia(206);
		conta1.setNumero(555);
		
		System.out.println("Agencia da conta 1: " + conta1.getAgencia());
		System.out.println("Numero da conta 1: " + conta1.getNumero());
		
		
	}
}