package circularLL;

public class queuebycircularLinkedList {
private node front;
private node rear;
public queuebycircularLinkedList()
{
	front=null;
	rear=null;
}
public void enqueue(int element)
{
	node temp=new node();
	if(temp==null)
	{
		System.out.println("cant insert more");
		return;
	}
	else
	{
		temp.setData(element);
		if(rear==null)
		{
			rear=temp; //rear set on first node
			front=temp; //front set on first node
			rear.setNext(front); //first node pointing to itself
		}
		else
		{
			
			rear.setNext(temp); //previous node start pointing to the new node
			rear=temp;//new node is made rear
			rear.setNext(front);//newest node pointing to the first node
		}
	}
}
public void insertAtEnd(int element)
{
	node temp=new node();
	temp.setData(element);
	rear.setNext(temp); //last node next set to new node
    rear=temp;//rear assigned to new node
	temp.setNext(front);//new node next set to first node
}
public int deleteFromFront()
{
	int data=front.getData();
    node ref=front.getNext();// second node re stored in ref
	rear.setNext(front.getNext()); //last node next set to first node
	front=ref; //ref is assigned as front
    return data;
}
public void traverse()
{
	node temp=front;
	do
	{
		System.out.println(temp.getData());
		temp=temp.getNext();
	}while(temp!=front); //cant use while(front!=null) because front is already null
	                      //will not itterate even once
}
}
