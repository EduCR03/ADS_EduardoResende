package avancado;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SobreCollection_2 {
	public static void main(String[] args) {
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		
		engenhariasAtuais.add("Telecom");
		engenhariasAtuais.add("Bio");
		engenhariasAtuais.add("Comp");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Prod");
		
		System.out.println("Engenharias Atuais: " + engenhariasAtuais);
		
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		engenhariasFuturas.add("Mecanica");
		engenhariasFuturas.add("Mecatronica");
		
		System.out.println("Engenharias futuras: " + engenhariasFuturas);
		
		Collection<String> todas = new ArrayList<String>();
		
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as Engenharias: " + todas);
		
		
		System.out.println("");
		System.out.println(">> Entendendo isEmpty e size");
		
		Collection<String> engenharias = new ArrayList<>(todas);
		
		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Qto elementos engenharias tem? " + engenharias.size());
		
		System.out.println("");
		System.out.println(">> Entendendo clear()");
		
		imprimirStatusDaColecao(engenharias);
		
		System.out.println("...invocando clear()");
		engenharias.clear();
		
		imprimirStatusDaColecao(engenharias);
	
	}
	
	public static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if(engenharias.isEmpty()) {
			System.out.println("Vazio");
		}else {
			System.out.println("Tem elemento");
		}
		
		System.out.println("Hello World");
		
	}
}
