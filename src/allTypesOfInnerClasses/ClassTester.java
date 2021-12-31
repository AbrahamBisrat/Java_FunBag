package allTypesOfInnerClasses;

public class ClassTester {
	public static void main(String[] args) {
		
		System.out.println(Phone.staticField);
		System.out.println(++Phone.staticField);
		
		Phone smartPhone = new Phone(5);
		smartPhone.staticField++;
		System.out.println(++Phone.staticField);
		System.out.println(smartPhone.staticField);
		
		smartPhone.instanceField++; 
		System.out.println(smartPhone.instanceField);
		
		Phone.InnerStaticPhone nokia = new Phone.InnerStaticPhone();
		
		nokia.setStaticField(45);
		System.out.println(Phone.staticField);
		
		Phone.InnerPhone innerPhone = smartPhone.new InnerPhone();
		
		
		smartPhone.innerMethod();
	}
}
