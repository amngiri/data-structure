package queuebyLL;

public class queueNode {
private int data;
private queueNode next;
public queueNode()
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
public queueNode getNext() {
	return next;
}
public void setNext(queueNode next) {
	this.next = next;
}

}
