package avancado;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SobreMap_1 {
	public static void main(String[] args) {
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		
		Map<String, Animal> mapaDeAnimais = new HashMap<>();
		
		mapaDeAnimais.put("TAR", a1);
		mapaDeAnimais.put("COE", a2);
		mapaDeAnimais.put("CAO", a3);
		mapaDeAnimais.put("GAT", a4);
		mapaDeAnimais.put("GIR", a5);
		
		//mapaDeAnimais.forEach((k,v) -> System.out.println(k + ": " + v));
		
		Set<String> setDasChaves = mapaDeAnimais.keySet();
		System.out.println(setDasChaves);
		
		Collection<Animal> valores = mapaDeAnimais.values();
		System.out.println(valores);
		
		Set<Entry<String,Animal>> setDeEntradas = mapaDeAnimais.entrySet();
		for(Entry<String,Animal> entry : setDeEntradas) {
			System.out.println("Chave: " + entry.getKey());
			System.out.println("Valor: " + entry.getValue());
		}
	}
}
