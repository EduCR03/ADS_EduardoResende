package esporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.junit.jupiter.api.Test;

public class AtletaTest {

	@Test
	void testarContrutor() {
		Pessoa pessoa = new Pessoa("Edson", 59);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 50, 80, false);
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
		
	}
	
	@Test
	void testarNadador() {
		Nadador nadador = new Nadador("Gustavo", 35, 90, true);
		nadador.nadar();
		
		assertEquals(nadador.idade, 30);
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		assertEquals(nadador.idade, 31);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Thiago", 44, 85, false);
		
		assertFalse(ciclista.aposentado);
		
		System.out.println("Esta aposentado");
		if(ciclista.aposentado) {
			System.out.println("SIM");
		}
		else {
			System.out.println("NAO");
		}
		
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		assertTrue(ciclista.aposentado);
		
		System.out.println("Agora esta aposentado");
		
		System.out.println(ciclista.aposentado ? "sim" : "nao");
	}
}
