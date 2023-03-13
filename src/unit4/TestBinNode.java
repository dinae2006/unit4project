package unit4;

public class TestBinNode {

	public static void main(String[] args) {
		BinNode<Integer> tl = new BinNode<Integer>(89);
		BinNode<Integer> tr = new BinNode<Integer>(-5);
		BinNode<Integer> t = new BinNode<Integer>(tl,100,tr);	
		printTree(t);
	}
	public static void printTree(BinNode t){
		if( t!=null ){
			printTree(t.getLeft());
			System.out.println(t.getValue());
			printTree(t.getRight());
		}
	}

}
