
/*  
	In this task you will get a set of instructions to get from a home location to a destination location.
	You have to give the instructions which begin at the destination location and return to the
	home location. In other words, you need to reverse the directions. Sometimes a mistake will be
	make with the directions, meaning that the latest direction should be deleted. The possible set of
	directions is "Go North", "Go South", "Go East" and "Go West". Another possible instruction is
	"Go Back" which means to undo the latest step. The instruction "Arrived" means the sequence of
	directions is complete.
	The way to solve this problem is to push all the instructions onto the stack, pop when you get
	"Go Back", and then pop them all off at the end (flipping North <-> South and East <-> West) to
	have a reversed set of instructions to get you home.

   	@author Joao Pedro Affonso de Almeida 
   	@author 18145957
   	@version 20/11/2018
*/

import java.util.*;

public class Lab7_Stack {

	class Node { // Node class
		String data; // field variable data
		Node next; // field variable next

		public Node(String s) { // Node constructor
			data = s;
		}
	}

	Node head;

	// method to check if the stack is empty
	public boolean isEmpty() {
		return (head == null);
	}

	// method to check what is in the top of the stack
	public String peek() {
		return head.data;
	}

	// method to push (insert) a node
	public void push(String s) {
		Node newNode = new Node(s);
		// in case there is no node in the stack
		if (head == null) {
			head = newNode;
		}
		// otherwise
		else {
			Node oldhead = head;
			head = newNode;
			head.next = oldhead;
			return;
		}
	}

	// method to pop (remove) a node
	public String pop() {
		// if the stack is empty
		if (head == null) {
			System.out.println("There is no directions!");
			return "";
		}
		// in case there is at least one more node
		else {
			Node returnhead = head;
			head = head.next;
			return returnhead.data;
		}
	}

	// print method
	public void print() {
		Node current = head;
		if (current == null) {
			return;
		} else {
			System.out.println();
			// swap the values of every direction
			while (current != null) {
				if (current.data.matches("North")) {
					System.out.println("Go South");
				}
				if (current.data.matches("South")) {
					System.out.println("Go North");
				}
				if (current.data.matches("West")) {
					System.out.println("Go East");
				}
				if (current.data.matches("East")) {
					System.out.println("Go West");
				}
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {

		Lab7_Stack stack = new Lab7_Stack(); // create a new stack

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the directions: "); // print this in the screen
		System.out.println("");
		String[] line = scan.nextLine().split(" "); // store every first and second word of every line in a array of
													// Strings

		while (line[0].matches("Arrived") == false) { // while the first word doesn't match "Arrived"
			if (line[1].matches("Back")) { // check if if the second word of of every line match "Back"
				stack.pop(); // if so, pop the last node to the stack
			} else { // otherwise
				stack.push(line[1]); // push the second word to the stack
			}
			line = scan.nextLine().split(" "); // split the next line and store the first and second element into the
												// array
		}
		stack.print(); // call print method
	}
}
