package esporte;

public class Corredor extends Atleta{

	public Corredor(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
	}
	
	public void correr() {
		System.out.println("Correndo");
	}
}
