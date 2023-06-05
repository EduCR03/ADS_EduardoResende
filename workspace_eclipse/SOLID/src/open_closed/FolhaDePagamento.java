package open_closed;

public class FolhaDePagamento {
	
	private double saldo = 0.0;
	
	//Codigo alinhado ao principio Open-Closed
	public void calcular(Remuneravel r) {
		saldo += r.getRemuneracao();
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Codigo que fere o principio Open-Closed
	//public void calcular(Object f) {
		//if(f instanceof ContratoCLT ) {
			//ContratoCLT clt = (ContratoCLT) f;
			//this.saldo += clt.getSalario();
		//}else if(f instanceof Estagio) {
			//Estagio e = (Estagio) f;
			//this.saldo += e.getBolsaAuxilio();
		//}else {}
	//}
	
	
	
}
