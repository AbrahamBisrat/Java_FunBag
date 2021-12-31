package recursion;

import java.util.Arrays;

public class recurssionSearch {
	
	public static void main(String[] args) {
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		int targetNumber = 9;
		System.out.println(searchInArray(myArray, targetNumber) + "\n");
		
		int singleNum = 1234567;
		System.out.println(findInInt(singleNum, -3));
		
	}
	static boolean findInInt(int x, int targetNum) {
		System.out.println(x);
		if(x == 0)
			return false;
		if(x == targetNum || x % 10 == targetNum)
			return true;
		return findInInt(x/10, targetNum);
	}
	static boolean searchInArray(int[] x, int targetNum) {
		if(x.length == 0)
			return false;
		if(x[0] == targetNum)
			return true;
		System.out.println(Arrays.toString(x));
		int[] temp = Arrays.copyOfRange(x, 1, x.length);
		return searchInArray(temp, targetNum);
	}
}
