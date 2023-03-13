package unit4;

public class StackInt {
	private static final int MAX = 100;
	private int[] values;
	private int top;
	
	public StackInt(){
		values = new int[MAX];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	public void push(int x){
		top++;
		if( top == values.length ){
			int[] temp = new int[values.length + 10];
			for(int i=0; i<values.length; i++)
				temp[i] = values[i];
			values = temp;
		}
		values[top] = x;
	}
	public int pop(){
		int x = values[top];
		top--;
		return x;
	}
	
	public int top(){
		return values[top];
	}
	
	@Override
	public String toString() {
		String st = "[ ";
		for(int i=top ; i>=0 ; i-- )
			st = st + values[i] + ",";
		
		st = st.substring(0, st.length()-1) + "]";
		
		return st;
	}
	
}
