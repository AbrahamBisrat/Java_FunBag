package arrays;

import java.util.Arrays;

public class ArraysUtil {
	public static void main(String[] args) {

      // initializing int array
      int arr[] = new int[] {1, 6, 3};

      // let us print the values
      System.out.println("Actual values: ");
      System.out.println(Arrays.toString(arr));

      // using fill for placing 18
      Arrays.fill(arr, 1);

      // let us print the values
      System.out.println("New values after using fill() method: ");
      System.out.println(Arrays.toString(arr));
      
	}
}
