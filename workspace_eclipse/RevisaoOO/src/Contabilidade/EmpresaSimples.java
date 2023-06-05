package Contabilidade;

public class EmpresaSimples implements Tributavel{
	private static final double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	private static final double TAXA_ISS_EMPRESA_SIMPLES = 0.08;
	
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * TAXA_IR_EMPRESA_SIMPLES;
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * TAXA_ISS_EMPRESA_SIMPLES;
	}
	
	
}
