package increaselist;

public class increasingNode {
	private int data;
	private increasingNode next;
	public increasingNode()
	{
		this.data = 0;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public increasingNode getNext() {
		return next;
	}
	public void setNext(increasingNode next) {
		this.next = next;
	}
	

}
