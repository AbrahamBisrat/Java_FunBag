package Comprende;

import java.util.ArrayList;
import java.util.List;

public class Expedia {

	 public static List<String> missingWords(String s, String t) {
			
			List<String> missing = new ArrayList<>();;
			String[] a = s.split(" ");
			String[] b = t.split(" ");
			
			for(int i=0, j=0; i < a.length; i++){
//				if(j >= b.length) missing.add(a[i]);
//				else 
					if(j < b.length && a[i].equals(b[j])) {
					j++;
				} else {
					missing.add(a[i]);
				}
			}
			
			return missing;
		}
		    public static void main(String args[]) {
		      List<String> missing = missingWords("I am using hackerrank to improve programming", "am hackerrank to improve");

		      System.out.println(missing);
		    }
}
