package unit4;

public class Queue<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public Queue(){
		head = tail = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(T x){
		if( head == null ){
			head = new Node<T>(x);
			tail = head;
		}else{
			Node<T> p = new Node<T>(x);
			tail.setNext(p);
			tail = tail.getNext();
		}
	}
	
	public T remove(){
		T x = head.getValue();
		head = head.getNext();
		return x;
	}
	public T head(){
		return head.getValue();
	}
	
	@Override
	public String toString() {
		String st="[";
		Node<T> p = head;
		while(p!=null && p.hasNext()){
			st = st + p.getValue() +",";
			p=p.getNext();
		}
		if( p!=null ){
			st = st + p.getValue() + "]";
		}else
			st = st+"]";
		
		return st;
	}
}
