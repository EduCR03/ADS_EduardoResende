package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTeste {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		// 1. Rascunho > Revisando
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisado);
		
		// 2. Rascunho > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		artigo.getLogHistorico().forEach(System.out::println);

		
	}

}
