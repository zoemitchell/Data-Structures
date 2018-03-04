/**
 * Node class for the Doubly Linked List
 */
public class Node<E> {
	
	private E data;
	private Node<E> next;
	private Node<E> prev;
	
	public Node(E data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public E getData() {
		return this.data;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	public void setNext(Node<E> node) {
		this.next = node;
	}
	
	public Node<E> getPrev(){
		return this.prev;
	}
	
	public void setPrev(Node<E> node) {
		this.prev = node;
	}
	
	@Override
	public String toString() {
		String prevData = "none";
		String nextData = "none";
		if (this.getPrev() != null) {
			prevData = this.getPrev().getData().toString();
		}
		if (this.getNext() != null) {
			this.getNext().getData().toString();
		}
		
		return "prev is" + prevData + "and next is" + nextData;
	}
	// Implement Methods
}