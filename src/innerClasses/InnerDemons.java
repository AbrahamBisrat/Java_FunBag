package innerClasses;

public class InnerDemons {
	public static void main(String[] args) {

		Outside a = new Outside();
		Outside.Inside b = a.new Inside();
		Outside.Inside.Deep c = b.new Deep();

		System.out.println(a.a + b.b + " " + c.c);

		System.out.println(a.sumOutside());
		System.out.println(Outside.Inside.Deep.Underneath.show());

		Simple x = new Simple();

		InterfaceExec simpleSample = new InterfaceExec() {
			public void show() {
				System.out.println("hellow from the interface!");
			}
		};
		simpleSample.show();

		// using lambda expression

		InterfaceExec modernSample = () -> System.out.println("this is the hi from the modern object");
	}
}
