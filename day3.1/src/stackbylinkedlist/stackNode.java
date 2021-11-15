package stackbylinkedlist;

public class stackNode {
	private int data;
	private stackNode next;
public stackNode()
{
	data=0;
	next=null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public stackNode getNext() {
	return next;
}
public void setNext(stackNode next) {
	this.next = next;
}

}
