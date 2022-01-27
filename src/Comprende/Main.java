package Comprende;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("MacBook Pro", 500, "m1", 240 * 67));
		laptops.add(new Laptop("Dell Inspiron", 460, "Intel", 12000));
		laptops.add(new Laptop("Toshiba crap", 480, "toshiba cpu", 6000));
		laptops.add(new Laptop("Dell Latitude D600", 200, "latitude Cpu", 4000));
		
		Laptop[] laps = laptops.toArray(new Laptop[laptops.size()]);

		display(laptops);

		Comparator<Laptop> compByPrice = new Comparator<Laptop>() {
			
			@Override public int compare(Laptop x, Laptop y) {
				if (x.getPrice() > y.getPrice())
					return 1;
				else if (x.getPrice() < y.getPrice())
					return -1;
				else
					return 0;
			}
		};
		
		// Jan 26, 2022
		
		Comparator<Laptop> lambdaByPrice = (l1, l2) -> {
			return -1 * ((l1.getPrice() > l2.getPrice()) ? 1 : 
			(l1.getPrice() < l2.getPrice()) ?
					-1: 0);
		};
		
		
		// end of Jan 26, 2022
		
		Comparator<Laptop> compByBrandName = new Comparator<Laptop>() {
			
			@Override public int compare(Laptop x, Laptop y) {
				return x.getBrandName().compareTo(y.getBrandName());
			}
		};
		
		
		Comparator<Laptop> lambdaByBrandName = (l1, l2) -> { 
			return -1 * (l1.getBrandName().compareTo(l2.getBrandName()));
		};
		
//		Comparator<Laptop> compByHdd = new Comparator<Laptop>() {
//			@Override
//			public int compare(Laptop x, Laptop y) {
//				if (x.getPrice() > y.getPrice())
//					return 1;
//				else if (x.getPrice() < y.getPrice())
//					return -1;
//				else
//					return 0;
//			}
//		};

		ArrayList<Comparator<Laptop>> comparatorList = new ArrayList<Comparator<Laptop>>();
		comparatorList.add(compByBrandName);
//		comparatorList.add(compByHdd);
		comparatorList.add(compByPrice);

		for (int i = 0; i < comparatorList.size(); i++) {
			Collections.sort(laptops, comparatorList.get(i));
			display(laptops);
		}
		System.out.println("This is the comparable method !");
		Collections.sort(laptops);
		display(laptops);

		System.out.println("This is Arrays.sort() ");
		Arrays.sort(laps, compByPrice);

		Comparator<Laptop> trial = new Comparator<Laptop>() {
			@Override public int compare(Laptop b, Laptop c) {
				return 0;
			}
		};
		
		Arrays.sort(laps);
		Collections.sort(laptops, trial);
		
		System.out.println("this is the static comparator !");
		Collections.sort(laptops, Laptop.compByHdd);
		display(laptops);
		
		System.out.println("The comparable debate");
		
		Collections.sort(laptops);
		display(laptops);
		
		System.out.println("\n\n The MIT bang!");
//		class compByPrice implements Comparator<Laptop>{
//			@Override public int compare(Laptop f, Laptop s) {
//				return f.getPrice() - s.getPrice();
//			}
//		};
		System.out.println("\n\n########################################################");
		
		Collections.sort(laptops, lambdaByPrice);
		display(laptops);
		
		
		System.out.println("\n\n########################################################");
		
		Collections.sort(laptops, lambdaByBrandName);
		display(laptops);
		
		System.out.println("\n\n\n########################################################");
		
		Collections.sort(laptops, (l1, l2) -> {
			return -1 * (l1.getBrandName().compareTo(l2.getBrandName()));
		});
		display(laptops);
		
		
	}

	Laptop test = new Laptop("MacBook Pro", 500, "m1", 240 * 67) {
		@Override
		public int compareTo(Laptop y) {
			return 0;
		}
	};

	public static void display(ArrayList<Laptop> x) {
		for (Laptop index : x)
			System.out.println(index);
		System.out.println("_______________________________________________________________________________\n"
				+ "_______________________________________________________________________________");
	}
}
