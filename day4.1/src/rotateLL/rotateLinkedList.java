package rotateLL;

public class rotateLinkedList {
private rotateNode head;
private rotateNode tail;
public rotateLinkedList()
{
	head=null;
	tail=null;
}
public void makingLinkedList(int element)
{
	rotateNode temp=new rotateNode();
	temp.setData(element);
	if(head==null)//if head is the first node
	{
		head=temp; //first node made head
		tail=temp; //first node made tail
		temp.setNext(tail); //first node pointing to itself
	}
	else
	{
		head.setNext(temp);   //previous node next set to temp
		head=temp;            //new node is made head
		temp.setNext(tail);  //new node next set to tail

	}
}

public void traverse(int element) //method to traverse by element given by user
{
	rotateNode curr=head;  //set current as head
	while(curr.getData()!=element) //current moves till reaches the data
	{
		curr=curr.getNext();
	}
	head=curr;                   //now current node is made head
	while(curr.getNext()!=head) //traverse till current again to head, cant use curr!=head becoz it 
		                        //already head so loop will not rul even once
	{
		System.out.println(curr.getData());
		curr=curr.getNext();
	}
	System.out.println(curr.getData());//last node left which is displayed
}

public void traverse()  //method to traverse normally
{
	rotateNode curr=head;
	while(curr.getNext()!=head)//traverse till current again to head, cant use curr!=head becoz it 
                              //already head so loop will not rul even once
	{
		System.out.println(curr.getData());
		curr=curr.getNext();
	}
	System.out.println(curr.getData());//last node left which is displayed
}
}
