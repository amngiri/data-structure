package stackbylinkedlist;

public class stackByLinkedList {
	private stackNode head;
	public stackByLinkedList() {
		head = null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void push(int element) {
		stackNode temp = new stackNode();
		temp.setData(element);
		if (temp == null) {
			System.out.println("cant insert more element stack full");
			return;
		} else {
			
			if (head == null) {
				//System.out.println("inside else");
				head = temp;
				System.out.println("pushing element is: "+head.getData());
			}
			else
			{
				//System.out.println("inside else else");
				temp.setNext(head);
				head=temp;
				System.out.println("pushing element is: "+head.getData());
			}
		}
	}
	public void traverse()
	{
		stackNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("cant pop more");
			return -1;
		}
		else
		{
		if(head.getNext()==null)
		{
		  int data=head.getData();
		  head.setNext(null);
		  head=null;
		  return data;
		}
		else
		{
        int data=head.getData();
        stackNode temp=head.getNext();
        head.setNext(null);
        head=temp;
        return data;
		}
		}
	}
}
