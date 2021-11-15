package BST;

public class nodeBST {
private int data;
private nodeBST left;
private nodeBST right;
public nodeBST()
{
	data=0;
	left=null;
	right=null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public nodeBST getLeft() {
	return left;
}
public void setLeft(nodeBST left) {
	this.left = left;
}
public nodeBST getRight() {
	return right;
}
public void setRight(nodeBST right) {
	this.right = right;
}


}
