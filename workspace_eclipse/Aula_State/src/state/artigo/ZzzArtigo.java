package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {
	private String estado;
	private List<String> logHistorico = new ArrayList<>();
	
	public ZzzArtigo() {
		this.estado = "RASCUNHO";
	}
	
	public String getEstado() {
		return estado;
	}
	
	public List<String> getLogHistorico(){
		return logHistorico;
	}
	
	public void publicar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(gerenteDeSeguranca.ehUsuarioAutor()) {
				this.estado = "REVISADO";
				this.logHistorico.add("Trasnitado para Revisando em " + LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario nao tem permissao para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)){
			if(gerenteDeSeguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Trasnitado para Revisando em " + LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario nao tem permissao para publicar");
			}
			
		}
		if("APROVADO".equals(estado)) {
			return;
		} 
	}
}
 