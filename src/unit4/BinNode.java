package unit4;

public class BinNode <T>{
	private BinNode<T> left;
	private T value;
	private BinNode<T> right;
	
	public BinNode(T x){
		left = null;
		this.value = x;
		right = null;
	}

	public BinNode(BinNode<T> left, T x , BinNode<T> right){
		this.left = left;
		this.value = x;
		this.right = right;
	}
    
	public boolean hasLeft(){
		return left != null;
	}
	
	public boolean hasRight(){
		return right != null;
	}
	public BinNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinNode<T> left) {
		this.left = left;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BinNode<T> getRight() {
		return right;
	}

	public void setRight(BinNode<T> right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return value + "";

	}

	
}
