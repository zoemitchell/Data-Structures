import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class LinkedListTests {
	
	
	@Test
	public void testAddToEmpty() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addToFront("Sam");
		
		assertEquals(linkedList.getHeadData(), "Sam");
	}
	
	@Test
    public void testAddToBack() { 
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.addToFront("sam");
    linkedList.addToBack("zoe");
    
    assertEquals(linkedList.getTailData(), "zoe");
    
	}
	
	@Test
	public void testRemoveFromFront () {
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.addToFront("zoe");
    linkedList.removeFromFront();
    
    assertEquals(linkedList.getHeadData(), null);
	}
	
	@Test
	public void testRemoveFromBack () {
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.addToFront("sam");
    linkedList.removeFromBack();
	 
    assertEquals(linkedList.getTailData(), null);
	}
	
	@Test
	public void testEnqueue () {
		Queue<String> queue = new Queue<String>();
		queue.enqueue("zoe");
		queue.enqueue("pho");
		assertEquals(queue.dequeue(), "zoe");
		assertEquals(queue.dequeue(), "pho")	;
	}
	
	@Test
	public void testQueueSize() {
	Queue<String> queue = new Queue<String>();
	queue.enqueue("zoe");
	queue.enqueue("pho");
	queue.enqueue("mole");
	queue.dequeue();
	assertEquals(queue.size(), 2);
	}
	
	@Test
	public void testQueueIsEmpty() {
	Queue<String> queue = new Queue<String>();
	queue.enqueue("zoe");
	queue.enqueue("pho");
	queue.dequeue();
	queue.dequeue();
	
	assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testStackPush() {
		Stack<String> stack = new Stack<String>();
		stack.push("zoe");
		stack.push("pho");
		stack.pop(); //returns what is left
		
		assertEquals(stack.pop(), "zoe");
	}
	
	@Test
	public void testStackSize() {
		Stack<String> stack = new Stack<String>();
		stack.push("zoe");
		stack.push("pho");
		stack.push("mole");
		
		assertEquals(stack.size(), 3);
	}
	
	@Test
	public void testStackIsEmpty() {
	Stack<String> stack = new Stack<String>();
	stack.push("zoe");
	stack.push("pho");
	stack.pop();
	stack.pop();
	
	assertTrue(stack.isEmpty());
	}
	
}
