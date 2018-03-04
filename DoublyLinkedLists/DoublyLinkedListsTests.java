import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedListsTests {
	
	
	@Test
	public void testAddInvalidIndexTooSmall() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		boolean result = doublyLinkedList.add(-2, "zoe");
		
		Assert.assertFalse(result);
	}
	
	@Test
    public void testAddInvalidIndexTooBig() { 
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		boolean result = doublyLinkedList.add(2, "zoe");
		
		Assert.assertFalse(result);
	}
	
	@Test
	public void testAddToFront() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		
		doublyLinkedList.add(0, "new");

		assertEquals(doublyLinkedList.getHead().getData(), "new");
	}
	
	@Test
	public void testAddToEnd() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		
		doublyLinkedList.add(2, "new");

		assertEquals(doublyLinkedList.getTail().getData(), "new");
	}
	
	@Test
	public void testGetFromList() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		doublyLinkedList.add(2, "oof");
		
		assertEquals(doublyLinkedList.get(1), "pho");
	}
	
	@Test
	public void testGetIndexTooBig() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		doublyLinkedList.add(2, "oof");
		
		assertEquals(doublyLinkedList.get(7), null);
	}
	
	@Test
	public void testGetIndexTooSmall() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		doublyLinkedList.add(2, "oof");
		
		assertEquals(doublyLinkedList.get(-7), null);
	}
	
	@Test
	public void testAddToElsewhere() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		doublyLinkedList.add(2, "oof");
		
		doublyLinkedList.add(1, "new");
		
		assertEquals(doublyLinkedList.get(1), "new");
		
	}
	
	@Test
	public void testClear() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "first");
		doublyLinkedList.add(1, "second");
		
		doublyLinkedList.clear();
		
		assertEquals(doublyLinkedList.getHead(), null);
		assertEquals(doublyLinkedList.getTail(), null);
	}

	@Test
	public void testSize() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.add(0, "zoe");
		doublyLinkedList.add(1, "pho");
		doublyLinkedList.add(2, "oof");
		doublyLinkedList.add(3, "new");
		doublyLinkedList.add(4, "cod");
		
		assertEquals(doublyLinkedList.size(), 5);
	}
	
	
}
