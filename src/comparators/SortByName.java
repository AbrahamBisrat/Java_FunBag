package comparators;

import java.util.Comparator;

public class SortByName implements Comparator<People>{
	
	@Override
	public int compare(People a, People b) {
		return a.name.compareTo(b.name);
	}
}
