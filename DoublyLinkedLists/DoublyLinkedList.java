/**
 * This is a Doubly LinkedList that has both a head and tail pointer. This class also has next and 
 * previous pointers, whereas Singly Linked Lists have only next pointers. 
 */

public class DoublyLinkedList<T> implements LinkedListInterface<T>{

	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public boolean add(int index, T data) {
		Node<T> newNode = new Node<T> (data);
		//wrong cases
		if (index > size) {
			return false;
		}
		if (index < 0) {
			return false;
		}
		
		if (size == 0) {
			head = newNode;
			tail = newNode;
			size++;
			return true;
		}
		
		if (index == 0) {//adding to front
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
			size++;
			return true;
		}
		
		if (index == size) { //adding to end
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
			size++;
			return true;
		}
		
		int count = 0; //adding to other part of list
		Node <T> currNode = head;
		while (currNode.getNext() != null) {
			if (count == index) {
				Node<T> temp = currNode.getPrev();
				currNode.setPrev(newNode);
				newNode.setNext(currNode);
				newNode.setPrev(temp);
				temp.setNext(newNode);
				size++;
			}
			currNode = currNode.getNext();
			count ++;
		}
		
		return true;
	}
	
	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	
	@Override
	public boolean contains(Object o) {
		// TODO
		return false;
	}
	
	@Override
	public T get(int index) { //do edge cases too
		
		int count = 0; 
		Node <T> currNode = head;
		while (currNode != null) {
			if (count == index) {
				return currNode.getData();
			}
			currNode = currNode.getNext();
			count++;
		}
	
		if (index > size) {//if index is too big
		return null;	
		}
		
		if (index < 0) {//if index is negative
		return null;
		}
		
		return null;		
	}
	
	@Override
	public int indexOf(T data) {
		// TODO
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public T remove(Object o) {
		// TODO
		return null;
	}
	
	@Override
	public T remove(int index) {
		// TODO
		return null;
	}
	
	@Override
	public T replace(int index, T data) {
		// TODO
		return null;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public Node<T> getHead() {
		return head;
	}
	
	public Node<T> getTail() {
		return tail;
	}
	
	@Override
	public void reverseList() {
		// TODO
	}
	
}