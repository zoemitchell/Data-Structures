/**
 * Your stack implementation. Don't add any new public methods.
 * 
 * @author Steven Wojcio
 *
 */
public class Stack<T> implements StackInterface<T> {

	private LinkedListInterface<T> stack = new LinkedList<T>();

	@Override
	public void push(T t) {
		stack.addToBack(t);
		
	}

	@Override
	public T pop() {
		return stack.removeFromBack();	
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	

	
}
