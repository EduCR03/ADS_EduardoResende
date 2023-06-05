package Contabilidade;

public class EmpresaMEI implements Tributavel{
	
	private static final double TAXA_IR_EMPRESA_MEI = 0.275;
	private static final double TAXA_ISS_EMPRESA_MEI = 0.0;
	Double faturamentoMensal;

	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * TAXA_IR_EMPRESA_MEI;
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * TAXA_ISS_EMPRESA_MEI;
	}
}
