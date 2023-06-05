package open_closed;

public class ContratoCLT implements Remuneravel {
	private Double salario;

	
	public ContratoCLT(Double salario) {
		super();
		this.salario = salario;
	}
	
	@Override
	public Double getRemuneracao() {
		return this.salario;
	}

	public Double getSalario() {
		return salario;
	}
	
	
	
	
}
