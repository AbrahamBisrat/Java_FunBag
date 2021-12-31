package innerClasses;

public class Outside {
	public static int a = 5;
	Inside insideObject = new Inside();
	Inside.Deep deepObject = insideObject.new Deep();
	Inside.Deep.Underneath underObject = deepObject.new Underneath();
	
	public String sumOutside() {
		return a + " " + Inside.b + " " + Inside.Deep.c + " " + Inside.Deep.Underneath.u;
	}
	
	
	public class Inside{
		public static int b = 8;
		public int sumInside() {
			return a+b;
		}
		
		public class Deep{
			public static int c = a * b;
			
			public class Underneath{
				public static int u = 7;
				
				public String underAll() {
					return a + " " + b + " " + c + " " + u;
				}
				
				public static String show() {
					return a + " " + b + " " + c + " " + u;
				}
			}
		}
	}
}
