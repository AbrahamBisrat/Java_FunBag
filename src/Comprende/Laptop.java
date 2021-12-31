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
	
	public void setBrandName(String bName) {
		brandName = bName;
	}
	public void setHdd(int newHdd) {
		hdd = newHdd;
	}
	public void setCpu(String newCpu) {
		cpu = newCpu;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public String getBrandName() {
		return brandName;
	}
	public String getCpu() {
		return cpu;
	}
	public int getPrice() {
		return price;
	}
	public int getHdd() {
		return hdd;
	}
	
	public static Comparator<Laptop> compByHdd = new Comparator<Laptop>() {
		@Override
		public int compare(Laptop x, Laptop y) {
			if (x.getPrice() > y.getPrice())
				return 1;
			else if (x.getPrice() < y.getPrice())
				return -1;
			else
				return 0;
		}
	};
	
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", hdd=" + hdd + ", cpu=" + cpu + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptop x) {
		if(this.hdd > x.hdd)
			return 1;
		else if(this.hdd < x.hdd)
			return -1;
		else return 0;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		System.out.println("This is the compare method inside the overriden compartor interface");
//		return 0;
//	}
}