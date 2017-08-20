package Amazon;

public class Tree {

	int value;
	Tree left;
	Tree right;

	{
		left = null;
		right = null;
	}

	public Tree(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return getValue()+"";
	}

}
