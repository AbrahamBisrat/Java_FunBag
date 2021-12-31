package allTypesOfInnerClasses;

public class Phone {
	int instanceField;
	static int staticField = 3;
	
	public Phone(int instanceField) {
		this.instanceField = instanceField;
	}
	
	public static class InnerStaticPhone{
		
		public InnerStaticPhone(){
			System.out.println("hellow from the inside of the Phone class");
		}
		public static void setStaticField(int x) {
			staticField = x;
		}
	}
	
	public class InnerPhone{
		int instanceField;
		
		public InnerPhone() {
			instanceField = 345;
			System.out.println("Hellow from the Inner member class ! " + ++staticField);
			System.out.println("InnerPhone instance Field : " + ++instanceField);
			
		}
	}
	public void innerMethod() {
		int innerMethodVar = 10;
		
		class me{
			public me() {
				System.out.println("hellow from the inner class me inside the innerMethod");
			}
		}
		me you = new me();
	}
}
