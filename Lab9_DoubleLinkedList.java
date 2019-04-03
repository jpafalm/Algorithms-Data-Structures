
/*  
    Create a program to find a maximum and minimum value node from a doubly linked list.
    
    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 04/12/2018
*/

public class Lab9_DoubleLinkedList {

    // represent a node of the doubly linked list
    class Node {
        int data; // property data
        Node previous; // property previous
        Node next; // property next

        public Node(int data) { // Node constructor
            this.data = data;
        }
    }

    // represent the head and tail of the doubly linked list
    Node head, tail = null;

    // addNode() will add a node to the list
    public void addNode(int data) { // add Node method
        // Create a new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode's previous will point to tail
            newNode.previous = tail;
            // newNode will become new tail
            tail = newNode;
            // as it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    // maximumNode() will find out maximum value node in the list
    public int maximumNode() {
        // node current will point to head
        Node current = head;
        int max;

        // checks if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        } else {
            // initially, max will store the value of head's data
            max = head.data;
            // iIf value of max is lesser than current's data
            // then, replace value of max with current node's data
            while (current != null) {
                if (current.data > max)
                    max = current.data;
                current = current.next;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Lab9_DoubleLinkedList dList = new Lab9_DoubleLinkedList();
        // add nodes to the list
        dList.addNode(5);
        dList.addNode(7);
        dList.addNode(9);
        dList.addNode(1);
        dList.addNode(2);

        // Prints the maximum value node in the list
        System.out.println("Maximum value node in the list: " + dList.maximumNode());
    }
}