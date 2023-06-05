package avancado;

import java.util.ArrayList;
import java.util.List;

public class SobreList_2 {
	
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		Animal t = new Animal(1L, "Tartaruga");
		Animal c = new Animal(2L, "Colho");
		Animal dog = new Animal(3L, "Cachorro");
		Animal cat = new Animal(4L, "Gato");
		Animal g = new Animal(5L, "Girafa");
		Animal gato = new Animal(6L, "Gato");
		
		listaDeAnimais.add(t);
		listaDeAnimais.add(c);
		listaDeAnimais.add(dog);
		listaDeAnimais.add(cat);
		listaDeAnimais.add(g);
		listaDeAnimais.add(gato);
		
		System.out.println(listaDeAnimais);
	}

}
