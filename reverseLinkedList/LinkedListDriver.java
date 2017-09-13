package reverseLinkedList;

/**
 * Driver program to reverse and print the linked list
 * 
 * @author vthakur
 *
 */
public class LinkedListDriver {
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(22);
		list.head.next = new Node(1);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(7);
		list.head.next.next.next.next = new Node(71);
		
		System.out.println("Given Linked list");
		list.printList(list.head); //print Linked List before reverse
		list.head = list.reverse(list.head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(list.head); // print Linked List after reverse
	}
}
