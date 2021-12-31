package doublyFuckeers;

import java.util.Iterator;

public class DoublyList implements Iterable<String>{
	Node header = new Node("");
	Node tail = new Node("");
	int size;

	public DoublyList() {
		header.next = tail;
		tail.prev = header;
		size = 0;
	}

	public void addFirst(String data) {
		Node newHead = new Node(data);
		newHead.next = tail;
		newHead.prev = header;
		header.next.prev = newHead;
		header.next = newHead;
	}

	public void add(String data) {
		Node n = new Node(data);
		n.next = header.next;
		n.prev = header;
		header.next.prev = n;
		header.next = n;
		size++;
	}

	public void remByValue(String data) {
		Node temp = header;
		while(temp.next != null) {
			if(temp.next.data.equals(data)) {
				temp.next = temp.next.next;
				temp.next.prev = temp;
				size--;
			}
			temp = temp.next;
		}
	}
	
	public void remByIndex(int index) {
		int i = 0;
		Node temp = header;
		while(temp.next != null) {
			if(i++ == index) {
				temp.next = temp.next.next;
				temp.next.prev = temp;
				size--;
			}
			temp = temp.next;
		}
	}
	public void insertAfter(String placerIndex, String toBePlaced) {
		Node temp = header;
		Node newInsert = new Node(toBePlaced);
		while(temp.next != null) {
			if(temp.data.equals(placerIndex)) {
				newInsert.next = temp.next;
				newInsert.prev = temp;
				temp.next.prev = newInsert;
				temp.next = newInsert;
				size++;
			}
			temp = temp.next;
		}
	}
	
	public String get(int index) {
		Node temp = header;
		int i = 0;
		while(temp.next != null) {
			if(i++ == index)
				return temp.next.data;
			temp = temp.next;
		}
		return "";
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node temp = header.next;
		while (temp.next != null) {
			if(temp.data != null)
				s += temp.data + ", ";
			temp = temp.next;
		}
		return s;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int pos = 0;
			
			@Override
			public boolean hasNext() {
				return pos <= size;
			}
			
			@Override
			public String next() {
				return get(pos++);
			}
		};
	}
}
