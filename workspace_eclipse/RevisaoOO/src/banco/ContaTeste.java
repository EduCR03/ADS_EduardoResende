package banco;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
	
	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101.0;
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.0);
		contaCorrente.rentabilizar();
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
		
	}
	@Test
	void testarContaPoupanca() {
		Double saldoEsperado = 102.0;
		
		ContaPoupanca pp = new ContaPoupanca();
		pp.depositar(100.0);
		pp.rentabilizar();
		
		assertEquals(saldoEsperado, pp.saldo);
	}
	
	@Test
	void testePolimorfismo() {
		boolean flagContaCorrenteComoDefault = false; //Consigo alternar qual 
		//classe eu vou criar utilizando esse flag
		
		Conta conta = null;
		if(flagContaCorrenteComoDefault) {
			conta = new ContaCorrente(); // Se for true eu crio uma classe conta do tipo Corrente
		}else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(1000.00);
		
		conta.rentabilizar();
		
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
	}
	
	@Test
	void testaConta_toString() {
		Conta conta = new ContaCorrente();
		
		conta.depositar(100.00);
		conta.sacar(10.0);
		
		//Utilizando o metodo toString como polimorfismo para invocar uma String
		System.out.println(conta);
		
	}

}

