package Comprende;

import java.util.Comparator;

public class Laptop implements Comparable<Laptop>{
	
	private String brandName;
	private int hdd;
	private String cpu;
	private int price;
	
	public Laptop(String bName, int harddisk, String pCpu, int pPrice) {
		brandName = bName;
		hdd = harddisk;
		cpu = pCpu;
		price = pPrice;
	}
	
	public void setBrandName(String bName) { brandName = bName; }
	
	public void setHdd(int newHdd) { hdd = newHdd; }
	
	public void setCpu(String newCpu) { cpu = newCpu; }
	
	public void setPrice(int newPrice) { price = newPrice; }
	
	public String getBrandName() { return brandName; }
	
	public String getCpu() { return cpu; }
	
	public int getPrice() { return price; }
	
	public int getHdd() { return hdd; }
	
	public static Comparator<Laptop> compByHdd = new Comparator<Laptop>() {
		
		// In case you are back, Comparator is a decision maker for two items
		// like the name suggests compare A with B, it doesn't have relation 
		// to the calling object. The inputs are two.
		// Whereas in Comparable, You are comparing A with the object that
		// invoked the comparaTOR method.     Able-To for short but, It would 
		// make more sense to just think about how one would normally compare
		// things. let's assume, we are comparing names. Naturally you would
		// sort them alphabetically because we know the alphabet implicitly.
		// but if you are to explain that process to someone else who doesn't
		// what you are trying to do, You would tell him to ** compare ** them
		// by taking their names and figure out which goes where. 
		// The first example is Comparable's compareTo -->> Implicitly defined
		// in the class object calling it. it may also be an anonymous class.
		// whereas in the case of the later, We would be using ** Comparator **
		// This is like a scale, input 1 and input 2, are weighed on the specs
		// given to weighing machine. -- I hope this makes it clearer.
		
		@Override public int compare(Laptop x, Laptop y) {
			if (x.getPrice() > y.getPrice())
				return 1;
			else if (x.getPrice() < y.getPrice())
				return -1;
			else
				return 0;
		}
	};
	
	@Override public String toString() {
		return "Laptop [brandName=" + brandName 
				+ ", hdd=" + hdd 
				+ ", cpu=" + cpu 
				+ ", price=" + price 
				+ "]";
	}
	
	@Override public int compareTo(Laptop x) {
	
		if(this.hdd > x.hdd)
			return 1;
		else if(this.hdd < x.hdd)
			return -1;
		return 0;
	}
	
	public static void main(String[] args) {
		Laptop l = new Laptop("hp", 200, "intel core i 9", 3242);
		System.out.println(l);
	}
}