package unit4;

public class Stack<T> {
	private Node<T> list;
	
	public Stack(){
		list = null;
	}
	
	public boolean isEmpty(){
		return list == null;
	}
	public void push(T x){
		list = new Node<T>(x,list);
	}
	public T pop(){
		T x = list.getValue();
		list = list.getNext();
		return x;
	}
	public T top(){
		return list.getValue();
	}
	
	@Override
	public String toString() {
		String st="[";
		Node<T> p = list;
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
