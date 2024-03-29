package state.artigo;

import java.util.ArrayList;
import java.util.List;

public class Artigo {
	private State estado;
	private List<String> logHistorico = new ArrayList<>();
	
	public Artigo() {
		this.estado = new EstadoRascunho(this);
	}
	
	public void publicar() {
		estado.publicar();
	}
	
	public void reprovar() {
		estado.reprovar();
	}
	
	protected void transitarEstadoPara(State estado) {
		this.estado = estado;
	}

	public State getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	
}
