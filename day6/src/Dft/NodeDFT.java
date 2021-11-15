package Dft;

public class NodeDFT {
	private int data;
	private NodeDFT left;
	private NodeDFT right;
	public NodeDFT()
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
	public NodeDFT getLeft() {
		return left;
	}
	public void setLeft(NodeDFT left) {
		this.left = left;
	}
	public NodeDFT getRight() {
		return right;
	}
	public void setRight(NodeDFT right) {
		this.right = right;
	}
	
}
