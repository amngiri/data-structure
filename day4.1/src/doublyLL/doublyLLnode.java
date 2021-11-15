package doublyLL;

public class doublyLLnode {
private int data;
private doublyLLnode next;
private doublyLLnode prev;
public doublyLLnode getPrev() {
	return prev;
}
public void setPrev(doublyLLnode prev) {
	this.prev = prev;
}
public doublyLLnode()
{
  data=0;
  next=null;
  prev=null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public doublyLLnode getNext() {
	return next;
}
public void setNext(doublyLLnode next) {
	this.next = next;
	
}

}
