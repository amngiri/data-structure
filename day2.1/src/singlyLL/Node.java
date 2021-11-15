package singlyLL;

public class Node {
	private int data; //node data
	private Node next; //node which ref of next node
	public Node()  
	{
		data = 0;   //when every node is made data will be initialized to 0
		next = null; //when every node is made ref will be initialized to null
	}
	public int getData() {    //getter to get data of node
		return data;
	}
	public void setData(int data) {  //setter to set data of node
		this.data = data;
	}
	public Node getNext() {       //getter to get next node ref
		return next;
	}
	public void setNext(Node next) {  //setter to set next node ref
		this.next = next;
	}
}
