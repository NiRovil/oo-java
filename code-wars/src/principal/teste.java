package principal;

import java.util.ArrayList;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		for (Integer i = 0; i < 10; i++) {
			lista.add("paia");
		}
		
		for (String s: lista) {
			System.out.println(s);
		}
		
	}

}
