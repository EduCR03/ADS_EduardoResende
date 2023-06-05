package avancado;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o2.getNome().compareTo(o1.getNome());
	}
	

}
