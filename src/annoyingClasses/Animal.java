package annoyingClasses;

public class Animal {
	private static Animal singletonInstance;
	String x;
	
	private Animal(){
		System.out.println("Animal Object Created !");
	}
	
	public void roar() {
		System.out.println("This is me roaring ! ");
	}
	
	public static Animal getInstance() {
		if(singletonInstance == null) {
			singletonInstance = new Animal();
		}
		return singletonInstance;
	}
}
