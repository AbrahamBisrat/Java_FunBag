package lists;

public class Main {
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifffth");
		System.out.println(list);
		
		list.insertByIndex("fuck", 1);
		System.out.println(list);
		// code
		
	}
}
