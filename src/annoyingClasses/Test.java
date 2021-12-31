package annoyingClasses;

public class Test {
	public static void main(String[] args) {
		Animal meaw = Animal.getInstance();
		meaw.x = "This is meaw object !	";
		
		Animal woof = Animal.getInstance();
//		Animal woof = new getInstance() {
//			@Override
//			public void roar() {
//				System.out.println("Woof Woof ! ");
//			}
//		};

		meaw.roar();
		System.out.println(meaw.x);
		woof.x = "this is the woofing !";
		System.out.println(woof.x);
		
	}
}
