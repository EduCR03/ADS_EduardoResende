package avancado;

import java.util.Iterator;

public class SobreArrays {
	public static void main(String[] args) {
		Animal[] arrayDeAnimais = new Animal[4];
		
		arrayDeAnimais[0] = new Animal(1L, "Taruga");
		arrayDeAnimais[1] = new Animal(2L, "Cunelo");
		arrayDeAnimais[2] = new Animal(3L, "Chorro");
		arrayDeAnimais[3] = new Animal(4L, "Gato");
		
		System.out.println("Array de aniamis: ");
		
		//for (int i = 0; i<arrayDeAnimais.length; i++) {
			//System.out.println(arrayDeAnimais[i].getNome());
		//}
		
		for (Animal indice : arrayDeAnimais) {
			System.out.println(indice.getNome());
		}
		

	}
}