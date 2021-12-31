package lists;

public class SinglyList {
	Node head;
	int size;
	
	public SinglyList() {
		size = 0;
	}
	
	public void add(String inputString) {
		Node newHead = new Node(inputString);
		if(head == null) {
			head = newHead;
			size++;
			return;
		}
		newHead.next = head;
		head = newHead;
		size++;
	}
	public void removeByValue(String inputString) {
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data.equals(inputString)) {
				temp.next = temp.next.next;
				size--;
			}
			temp = temp.next;
		}
	}
	public void removeByIndex(int index) {
		Node temp = head;
		int i = 0;
		
		while(temp.next != null) {
			if(i == index) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	public void insertByIndex(String inputString, int index) {
		if(index >= size) {
			System.out.println("Index is over the size of the list");
			return;
		}
		Node temp = head;
		Node insertNode = new Node(inputString);
		
		int i = 0;
		while(temp.next != null) {
			if(i == index) {
				insertNode.next = temp;
				temp.next = insertNode;
				size++;
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	public void insertStack(String x, int index) {
		Node newInput = new Node(x);
		if(index < 0 || index > size)
	        throw new IllegalArgumentException();
	    Node temp = head; //Save original head
	    for(int i=0;i<index-1;i++)
	        temp = temp.next;
	    newInput = temp.next;
	    temp.next = newInput;
	    size++;
	}
	public void replace(String inputString, int index) {
		if(index >= size) return;
		Node temp = head;
		int i = 0;
		
		while(temp.next != null	) {
			if(i == index) {
				temp.data = inputString;
			}
			temp = temp.next;
			i++;
		}
	}
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		System.out.println("here");
		String s = "";
		Node temp = head;
		
		while(temp != null) {
			s += temp.data + ", ";
			temp = temp.next;
		}
		return s;
	}
}






