package comparators;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<People> pList = new ArrayList<People>();
		pList.add(new People(15, "Ze Abraham", "Bonga"));
		pList.add(new People(40, "Mehari", "AdiGuEbd"));
		pList.add(new People(35, "Gebriela", "Godeyti"));
		display(pList);
		
		Collections.sort(pList, new SortByAge());
		display(pList);
		
		Collections.sort(pList, new SortByName());
		display(pList);
	}
	public static void display(ArrayList<People> x) {
		for(int i = 0; i < x.size(); i++)
			System.out.println(x.get(i));
		System.out.println("________________________________________");
	}
}