import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class TreeSetImplementation {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new  TreeSet<>();
		treeSet.add("Vikram");
		//treeSet.add(null);
		
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	
		Stack<String> stack = new Stack<>();
		stack.push("Vikram");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
