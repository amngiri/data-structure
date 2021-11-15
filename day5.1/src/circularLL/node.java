package circularLL;

public class node {
private int data;
private node next;
public node()
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
public node getNext() {
	return next;
}
public void setNext(node next) {
	this.next = next;
}
}
