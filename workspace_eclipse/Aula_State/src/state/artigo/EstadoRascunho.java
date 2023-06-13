package state.artigo;

import java.time.LocalDate;

public class EstadoRascunho implements State{
	
	Artigo a = new Artigo();

	@Override
	public void publicar() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		if(gerenteDeSeguranca.ehUsuarioAutor()) {
			this.a.transitarEstadoPara(new EstadoRevisado(a));
			this.a.getLogHistorico().add("Transitado para REVISANDO em " + LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario nao tem permissao para publicar");
		}
		
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub
		
	}

	public EstadoRascunho(Artigo a) {
		super();
		this.a = a;
	}
	
	

}
