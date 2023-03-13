package unit4;

public class TestBinNode {

	public static void main(String[] args) {
		BinNode<Integer> tl = new BinNode<Integer>(89);
		BinNode<Integer> tr = new BinNode<Integer>(-5);
		BinNode<Integer> t = new BinNode<Integer>(tl,100,tr);	
		printTree(t);
		System.out.println(sum(t));
	}
	public static int sum(BinNode<Integer> t){
		if( t==null )
			return 0;
		return t.getValue() + sum(t.getLeft()) + sum(t.getRight());
	}
	public static void printTree(BinNode t){
		if( t!=null ){
			printTree(t.getLeft());
			System.out.println(t.getValue());
			printTree(t.getRight());
		}
	}

}
