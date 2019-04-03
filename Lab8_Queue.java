
/*  
	Creation and test of a Queue Class (FIFO - First in first out).
	
   	@author Joao Pedro Affonso de Almeida 
   	@author 18145957
   	@version 27/11/2018
*/

public class Lab8_Queue {

	class Node { // creation of a class Node
		int data; // field variable
		Node next; // field variable

		public Node(int n) { // contructor
			data = n;
		}
	}

	Node head; // We remove from here
	Node tail; // We add here

	public boolean isEmpty() { // method to check if the queue is empty
		return (head == null);
	}

	public int peekHead() { // method to check what is there in the head
		return head.data;
	}

	public void add(int n) { // method to add a new node
		Node newNode = new Node(n);
		if (head == null) { // if the queue is empty do this
			head = newNode;
			tail = newNode;
			tail.next = null;
		} else { // if it's not empty do this
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}

	public int remove() { // method to remove from the head
		Node returnHead = head;

		if (head == null) { // if there is no more node to remove
			System.out.println("The list is is empty!");
			return 0;
		} else { // otherwise
			head = head.next;
			return returnHead.data;
		}
	}

	public void print() { // method the data of all the nodes of the queue
		Node current = head;

		if (current == null) {
			return;
		} else {
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	// testing the class
	public static void main(String[] args) {

		Lab8_Queue queue = new Lab8_Queue();

		queue.add(5);
		queue.add(10);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		queue.remove();
		queue.print();

	}
}