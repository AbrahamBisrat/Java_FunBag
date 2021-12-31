package doublyFuckeers;

public class DSTester {
	public static void main(String[] args) {
		
		DoublyList dList = new DoublyList();
		dList.addFirst("First Element");
		System.out.println(dList);
		dList.add("Second");
		dList.add("Third");
		dList.add("Fourth");
		System.out.println(dList);
		dList.remByValue("Second");
		System.out.println(dList);
		dList.remByIndex(1);
		System.out.println(dList);
		dList.insertAfter("Fourth", "really !?");
		System.out.println(dList);
		
		for(String index : dList)
			System.out.println(index);
		
//		System.out.println(dList.get(2));
	}
}
