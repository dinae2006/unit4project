package unit4;

public class Node<T> {
	private T value;
	private Node next;
	
	
	public Node(T x){
		this.value = x;
		this.next = null;
	}
	
	public Node(T x, Node<T> next){
		this.value = x;
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public boolean hasNext(){
		return next != null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value+"";
	}

}
