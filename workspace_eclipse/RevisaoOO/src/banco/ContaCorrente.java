package banco;

public class ContaCorrente extends Conta{

	@Override
	void rentabilizar() {
		this.saldo *= 1.01;
	}
	
	
	//Polimorfismo chama de baixo para cima, ou seja esse vai reescrever na classe conta
	//O oposto do 
	@Override
	public String toString() {
		return "Reescrito na ContaCorrente [saldo=" + saldo + "]";
	}
	
	
	
	
	
	

}
