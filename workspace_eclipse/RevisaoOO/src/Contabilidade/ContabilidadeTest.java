package Contabilidade;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {
	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresa = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresa.getValorIR());
		
		Double valorISSEsperado = 0.0;
		assertEquals(valorISSEsperado, empresa.getValorISS());
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresa = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresa.getValorIR());
		
		Double valorISSEsperado = 8.0;
		assertEquals(valorISSEsperado, empresa.getValorIR());
		
	}
}
