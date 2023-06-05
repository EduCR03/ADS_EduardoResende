package avancado;

import java.util.Comparator;

public class ComparadorPeloId implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o2.getId().compareTo(o1.getId());
	}

}
