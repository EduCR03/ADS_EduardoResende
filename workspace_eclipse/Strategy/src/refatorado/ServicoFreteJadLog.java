package refatorado;

public class ServicoFreteJadLog implements Fretavel{

	@Override
	public double calcularValor(double pesoEmKg) {
		//JADLOG
			if(pesoEmKg < 30.00) 
				return 0.00;
			else
				return 150.00;
	
	}

}
