package state.artigo;

public class EstadoAprovado implements State{
	
	Artigo a = new Artigo();

	@Override
	public void publicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub
		
	}

	public EstadoAprovado(Artigo a) {
		super();
		this.a = a;
	}

}
