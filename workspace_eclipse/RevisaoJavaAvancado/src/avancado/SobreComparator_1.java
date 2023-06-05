package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1{
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		Animal t = new Animal(3L, "Tartaruga");
		Animal c = new Animal(5L, "Colho");
		Animal dog = new Animal(1L, "Cachorro");
		Animal cat = new Animal(6L, "Gato");
		Animal g = new Animal(2L, "Girafa");
		Animal gato = new Animal(4L, "Gato");
		
		listaDeAnimais.add(t);
		listaDeAnimais.add(c);
		listaDeAnimais.add(dog);
		listaDeAnimais.add(cat);
		listaDeAnimais.add(g);
		listaDeAnimais.add(gato);
		
		System.out.println("> Pela ordem do nome: ");
		Collections.sort(listaDeAnimais, new ComparadorPorNome());
		System.out.println(listaDeAnimais);
		
		System.out.println("> Pela ordem do id: ");
		Collections.sort(listaDeAnimais, new ComparadorPeloId());
		System.out.println(listaDeAnimais);
	}

}
