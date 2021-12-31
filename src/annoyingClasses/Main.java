package annoyingClasses;

public class Main {
	public static void main(String[] args) {
		Burzerk me = new Burzerk();
		me.getAge();
		
		Burzerk someone = new Burzerk() {
			@Override
			public void getAge() {
				System.out.println("Your hardwork is paying off, but you need to more systematic about how you spen your energy");
				System.out.println("You are " + x + " years old!");
			}
		};
		someone.getAge();
	}
}