package open_closed;

import org.junit.jupiter.api.Test;

public class FolhaDePagamentoTest {
	
	@Test
	public void deveCalcular() {
		
		Remuneravel contrato = new ContratoCLT(1000.0);
		Estagio estagio = new Estagio(500.0);
		ContratoPJ contratoPJ = new ContratoPJ(2000.0);
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.calcular(contrato);
		folhaDePagamento.calcular(estagio);
		folhaDePagamento.calcular(contratoPJ);
		
		Double totalFolha = folhaDePagamento.getSaldo();
		
		assertEquals(3500.0, totalFolha);
	}

}
