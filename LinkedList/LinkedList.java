
public class LinkedList<T> implements LinkedListInterface<T>{

	private Node<T> head;
	private Node<T> tail;
	
	@Override
	public void addToFront(T t) {
		Node <T> newNode = new Node<T> (t);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		// 1. create a temporary pointer at the old head
		Node<T> temp = head;
		// 2. set the head to the new node
		head = newNode;
		// 3. set the new head to the old head
		head.setNext(temp);
	}

	@Override
	public void addToBack(T t) {
		// 1. create the new node
		Node<T> newNode = new Node<T> (t);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
			
		// 2. set tail to point to new node
		tail.setNext(newNode);
	    // 3. set tail = new node
		tail = newNode;
		
	}

	@Override
	public T removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		if (head.equals(tail)) {
			T nodeData = head.getData();
			head = null;
			tail = null;
			return nodeData;
		}
		
		// 1. create the temp (for the head)
		Node<T> newNode = head;
		// 2. set head to point at the next node in the list
		head = head.getNext();
		// 3. return the data from the 
		return newNode.getData();
	}

	@Override
	public T removeFromBack() {	
		if(isEmpty()) {
			return null;
		}
		
		if (head.equals(tail)) {
			T nodeData = head.getData();
			head = null;
			tail = null;
			return nodeData;
		}
		
		Node<T> newNode = head;
		while (!newNode.getNext().equals(tail)) {
			newNode = newNode.getNext();
		}
		T tailData = tail.getData();
		newNode.setNext(null);
		tail = newNode;
		return tailData;
	}

	@Override
	public T[] toList() {
		@SuppressWarnings("unchecked")
		T[] newArray = (T[])(new Object[size()]); //creating a new array
		int count = 0; //set count=0 because we are starting at the head
		Node<T> temp = head;
		// while the next node is NOT null, get the data
		while (temp.getNext()!=null) {
			newArray[count] = temp.getData();
			count ++;
			temp = temp.getNext();
		}
		// exit when at the last node (bc next is null), now get the data from that last node
		newArray[count] = temp.getData();
		return newArray;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {	
		int count = 1;
		Node<T> currNode = head;
		while (currNode.getNext() != null) {
			currNode = currNode.getNext();
			count ++; 
		}
		
		return count;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
	}
	
	public T getHeadData() {
		if (head == null) {
			return null;
		}
		return head.getData();
	}

	public T getTailData() {
		if (tail == null) {
			return null;
		}
		return tail.getData();
	}

	/**
	 * The node class. Remember that this is a singularly linked list.
	 * 
	 * @author Steven Wojcio
	 */
	private class Node<T>{
		private T data;
		private Node<T> next;
		private Node(T data) {
			this.data = data;
			this.next = null;
		}
		
		T getData(){
			return this.data;
		}
		
		Node<T> getNext(){
			return this.next;
		}
		
		void setData(T newData) {
			this.data = newData;
		}
		
		void setNext(Node<T> newNext) {
			this.next = newNext;
		}
	}

}
