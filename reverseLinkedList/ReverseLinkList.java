package reverseLinkedList;
/**
 * Reverse a linked list
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @author vthakur
 * 
 *
 */
class ReverseLinkedList {
 
	Node head;	
 
    // Function to reverse the linked list 
    public Node reverse(Node head) {
    	if(head == null) {
    		return null;
    	}
    	
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
 
    // prints content of double linked list
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}