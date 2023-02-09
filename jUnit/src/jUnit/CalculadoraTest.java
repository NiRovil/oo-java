package jUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testeSomaPositivo() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(3, 7);
		
		assertEquals(10, soma);

		
	}
	
}
