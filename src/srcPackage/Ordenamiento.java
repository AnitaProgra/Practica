package srcPackage;

import java.util.Comparator;

public class Ordenamiento implements Comparator<Productos> {


	@Override
	public int compare(Productos o1, Productos o2) {
		return o2.name().compareTo(o1.name()); 
	}

	
}
