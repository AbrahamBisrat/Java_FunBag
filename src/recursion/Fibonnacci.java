package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonnacci {
	public static void main(String[] args) {
		System.out.println(fib(5));

		Fibonnacci f = new Fibonnacci();

		Fibonnacci.List listy = f.new List();
		for (int i = 0; i < 6; i++)
			listy.add(i);

		System.out.println(listy);
		System.out.println("####################################################");
		printReverseList(listy.head);
		System.out.println("\n");

		String simpleText = "Born and raised in Bonga!";
		System.out.println(simpleText);
		simpleText = stringReverser(simpleText);
		System.out.println(simpleText);

		String palTest = "abcba";
		System.out.println(isPalindrome(palTest));

		int x = 233;
		System.out.println(decToBin(x));

		x = 10;
		System.out.println(sumOfNaturalNumbers(x));

		int sortedArray[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		x = 2;

		System.out.println(binarySearch(sortedArray, x));
		
		System.out.println("####################################################");
		
		Scanner inputField = new Scanner(System.in);
		System.out.println("enter your life code -- ");
		
		boolean loop = true;
		
		do{
			x = inputField.nextInt();
			if(x == 42) {
				loop = false;
				return;
			}else {
				System.out.println(x);
			}
		}while(loop);
		
	}

	public static int fib(int x) {
		if (x == 0)
			return 0;
		if (x == 1)
			return 1;
		return fib(x - 1) + fib(x - 2);
	}

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	class List {
		Node head;

		void add(int x) {
			Node temp = new Node(x);
			if (head == null) {
				head = temp;
				return;
			}
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(x);
		}

		@Override
		public String toString() {
			String s = "";
			Node temp = head;
			while (temp != null) {
				s += temp.data + " -> ";
				temp = temp.next;
			}
			return s;
		}
	}

	public static void printReverseList(Node head) {
		if (head == null)
			return;
		printReverseList(head.next);
		System.out.print(head.data + " > ");
	}

	public static int sumOfNaturalNumbers(int x) {
		if (x <= 1)
			return x;
		return x + sumOfNaturalNumbers(x - 1);
	}

	public static String stringReverser(String inputText) {
		// when should I stop?
		// what is the one step required, that can be done over and over again till the
		// base case applies?
		// the base case can be, stop when reaching the middle of the string.
		// the smallest possible step would be to swap chars at left and right and then
		// update the index

		if (inputText.equals(""))
			return "";

		return stringReverser(inputText.substring(1)) + inputText.charAt(0);
	}

	public static boolean binarySearch(int[] valueArray, int targetValue) {
		targetValue = 12;
		System.out.println(Arrays.toString(valueArray));
		int size = valueArray.length;
		if (size <= 1 && valueArray[0] != targetValue) {
			System.out.println("terminated in the base case!");
			return false;
		} else if (valueArray[0] == targetValue)
			return true;

		if (valueArray[size / 2] == targetValue)
			return true;

		if (targetValue > valueArray[size / 2]) {
			valueArray = Arrays.copyOfRange(valueArray, (size % 2 == 0) ? size / 2 : (size / 2) - 1,
					valueArray.length - 1);
			binarySearch(valueArray, targetValue);
		} else {
			valueArray = Arrays.copyOfRange(valueArray, 0, (size % 2 == 0) ? size / 2 : (size / 2) + 1);
			binarySearch(valueArray, targetValue);
		}

		return false;
	}

	public static String swapChars(String x, int from, int to) {
		char[] temp = new char[x.length()];
		for (int i = 0; i < x.length(); i++)
			temp[i] = x.charAt(i);

		char tempChar = temp[from];
		temp[from] = temp[to];
		temp[to] = tempChar;

		x = String.valueOf(temp);
		return x;
	}

	public static String decToBin(int x) {
		if (x == 1 || x == 0)
			return "" + x;
		return (x % 2) + decToBin(x / 2);
	}

	public static boolean isPalindrome(String inputText) {
		if (inputText.length() == 1 || inputText.length() == 0)
			return true;

		if (inputText.charAt(0) != inputText.charAt(inputText.length() - 1))
			return false;

		return isPalindrome(inputText.substring(1, inputText.length() - 1));
	}
}