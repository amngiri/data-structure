package singlyLL;

public class singlyLinkedList {
	private Node head; //head of node type can hold data as well as reference
	public singlyLinkedList()
	{
		head = null; //when a object is made because of constructor head will be null
	}
	public void insertAtFront(int element)
	{
		// Only a reference variable is created
		// temp is a local ref. variable
		Node temp;
		// Memory is allocated and the ref. of that memory block
		// is assigned to temp
		temp = new Node(); //temp is of type node
		temp.setData(element); //data is set into the newly made node
		//temp.setNext(null); //no require to do this as temp is already pointing to null
		if (head == null) //if it is a first node the head will be null
		{
			// Reference of temp will be copied in head
			head = temp; //first node make it head
		}
		else
		{
			//Reference of head will be stored in temp's next field
			temp.setNext(head);   //[node3]-->[node2]-->[node1]-->NULL  ,new node will be
			                     //inserted at back
			head = temp;  //head will be the last node made
			//The above 4 steps are best for stack
			
			//head.setNext(temp);   //[node1]-->[node2]-->[node3]-->NULL  ,new node will be
                                    //inserted in between null and previous node
			                        //previous node which is head will poin to new node
			//temp.setNext(null);  //pointing to newly made node in between to null
			//head=temp;
			//The above 4 steps are best for queue
			}	
	}
	
	public void traverse()
	{
		Node temp = head;  //A node type local variable which can hold only addresses
		while (temp!= null) // As long as temp's ref. is not null / when we need to excess 
			                //till end of the node
		{
			System.out.println(temp.getData()); //as temp!=null will pass the last node and print
			                        //last node,temp.getNext() will go only till last node
			temp = temp.getNext(); //traversing by temp.getNext() either will miss first node data
			                       //ot last node data
		}
	}
	public void insertBeforeElement(int data,int element) 
	{                       //0     1     2
	   	Node curr=head;    //[8]-->[2]--->[3]-->[5]-->NULL
	   	Node prev=null;
	   	Node temp=new Node();
	   	temp.setData(element);
	   	while(curr.getData()!=data) //moving up on that node
	   	{
	   		prev=curr; //maintaining the previous position
	   		curr=curr.getNext();
	   	}
	   	prev.setNext(temp); //previous node set to new node
	   	temp.setNext(curr); //new node set to current
	}
	public void insertAfterElement(int aElement,int element) 
	{
	   	Node curr=head;   //[8]-->[2]--->[3]-->[5]-->NULL
	   	Node after=null;
	   	Node temp=new Node();
	   	temp.setData(element);
	   	while(curr.getData()!=aElement)
	   	{   		
	   		curr=curr.getNext(); //current will move up on the node
	   		after=curr.getNext(); //after will hold next node address
	   	}
	   	curr.setNext(temp);//current set to new node
	   	temp.setNext(after);//new node set to after
	}
	public void insertAtEnd(int element)
	{
		Node temp=new Node();  //[8]-->[2]--->[3]-->[5]-->[7]--->NULL
		Node curr=head;
		temp.setData(element);
		while(curr.getNext()!=null) //will go till last node
		{
			curr=curr.getNext();
		}
		curr.setNext(temp); //as curr should be second last node so curr should point to temp
		temp.setNext(null); //as temp should be last node so temp should point to null
	}
	public void insertAtPosition(int position,int element)
	{
		Node curr=head;
		Node after=null;      //[8]-->[2]--->[3]-->[5]-->[7]--->NULL
		//                     [8]-->[2][3]--->null [5]-->[7]--->NULL
		Node temp=new Node();
		temp.setData(element);
		int i=1;
		while(i != position) //wil go till that position
		{
		   curr=curr.getNext();	
		   after=curr.getNext();
		   i++;
		}
		curr.setNext(temp);
		temp.setNext(after);
		
	}
    public void deleteAtPosition(int data)
    {
    	Node curr=head;
    	Node prev=null;
    	while(curr.getData()!=data) //will go till that position
    	{
    		prev=curr;
    		curr=curr.getNext();
    	}
    	prev.setNext(curr.getNext()); //prev will point to curr next node
    	curr.setNext(null); //curr next set to null
    }
	}

