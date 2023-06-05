package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_1 {
	public static void main(String[] args) {
		
		List<String> listaDeAlimentos = new ArrayList<>();
		
		listaDeAlimentos.add("Damasco");
		listaDeAlimentos.add("Bata");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Cenoura");
		
		
		System.out.println("> Pela Ordem de insercao dos Alimentos: ");
		System.out.println(listaDeAlimentos);
		
		System.out.println("> Por ordem alfabetica: ");
		Collections.sort(listaDeAlimentos);
		System.out.println(listaDeAlimentos);
		
		
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
		
		System.out.println("> Pela ordem de insercao dos Animais: ");
		System.out.println(listaDeAnimais);
		
		System.out.println("> Pela ordem alfabetica do nome do animal: ");
		Collections.sort(listaDeAnimais);
		System.out.println(listaDeAnimais);
	}
}
