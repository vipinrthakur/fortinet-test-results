package reverseLinkedList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestReverseLinkedList {
	private ReverseLinkedList list;
	
	@Before
	public void setUp() {
		list = new ReverseLinkedList();
		list.head = new Node(5);
		list.head.next = new Node(3);
		list.head.next.next = new Node(10);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(8);
	}
	
	/*
	 * Input : 5 3 10 11 8
	 * Expected Result : 8(return the head value after reverse)
	 */
	@Test
	public void testReverse() {
		assertEquals(8, list.reverse(list.head).value);
	}
	
	@Test
	public void testReverseForNullHeadReturnsNull() {
		assertNull(list.reverse(null));
	}
}
