package exceptions;

public class Main {
	public static void main(String[] args) throws firstLayer, SecondLayer{

//		try {
			System.out.println(getX());
//		} catch (firstLayer f) {
//			System.out.println(f.getMessage() + " This is the first layer catch");
//		} catch (SecondLayer s) {
//			System.out.println(s.getMessage() + " This is the second layer catch");
//		} finally {
//			System.out.println("Do this finally anyways ! :)) ");
//		}

	}
	static int x = 8;
	
	public static int getX() throws firstLayer, SecondLayer {
		if (x > 9)
			throw new firstLayer("bummer first failed !");
		if (x < 9)
			throw new SecondLayer("bummer second layer failed !");
		return x;
	}
}
