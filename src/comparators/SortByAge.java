package comparators;

import java.util.Comparator;

public class SortByAge implements Comparator<People>{
	@Override
	public int compare(People x, People y) {
		return x.age - y.age;
	}
}
