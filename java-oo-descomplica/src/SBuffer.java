
public class SBuffer {

	public static void main(String[] args) {
		
		String nome = "    Nicolas Robert        ";
		String sNome = "Vilela";
		String nomeCompleto;
		
		System.out.println(nome.trim());
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(sNome);
		
		nomeCompleto = buffer.toString();
		
		System.out.println(nomeCompleto);
		
	}

}
