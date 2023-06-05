package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SobreCollections_1 {
	public static void main(String[] args) {
		Collection<String> colecao = extracted();
	
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leao");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);

 	}

	private static Collection<String> extracted() {
		Collection<String> colecao = new HashSet<String>(); // -> Ordem aleatoria
		return colecao;
		
	}
	
	//private static Collection<String> extracted() {
	//	Collection<String> colecao = new TreeSet<String>(); -> MOstra em ordem alfabetica ou em ordem crescent
	//	return colecao;
		
	//}
	

}

