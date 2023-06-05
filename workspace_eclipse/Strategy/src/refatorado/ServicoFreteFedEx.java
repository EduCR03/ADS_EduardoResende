package refatorado;

public class ServicoFreteFedEx implements Fretavel{

	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 20)
			return 0;
		else if(pesoEmKg > 20 && pesoEmKg < 30)
			return 45.00;
		else
			return 75.00;
	}

}
