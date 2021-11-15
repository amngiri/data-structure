package BFT;

public class NodeBFT {
	private int data;
	private NodeBFT left;
	private NodeBFT right;
	public NodeBFT()
	{
		data = 0;
		left = right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeBFT getLeft() {
		return left;
	}
	public void setLeft(NodeBFT left) {
		this.left = left;
	}
	public NodeBFT getRight() {
		return right;
	}
	public void setRight(NodeBFT right) {
		this.right = right;
	}
	
}
