package state.artigo;

import java.time.LocalDate;

public class EstadoRevisado implements State {
	
	Artigo a = new Artigo();

	@Override
	public void publicar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		if(gerenteDeSeguranca.ehUsuarioModerador()){
			if(gerenteDeSeguranca.ehUsuarioModerador()) {
				this.a.transitarEstadoPara(new EstadoAprovado(a));
				this.a.getLogHistorico().add("Trasnitado para Revisando em " + LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario nao tem permissao para publicar");
			}
			
		}
		
	}

	@Override
	public void reprovar() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		if(gerenteDeSeguranca.ehUsuarioModerador()){
			if(gerenteDeSeguranca.ehUsuarioModerador()) {
				this.a.transitarEstadoPara(new EstadoRascunho(a));
				this.a.getLogHistorico().add("Trasnitado para RASCUNHO em " + LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario nao tem permissao para reprovar");
			}
			
		}
		
	}

	public EstadoRevisado(Artigo a) {
		super();
		this.a = a;
	}

}
