package queueByArray;

public class queueByArray {
private int front=0;  //initial position of front user for dequeue
private int rear=0;  //initial position of rear user for enqueue
private int arr[];
public queueByArray()
{
	arr=new int[4];
}
public boolean isfull()
{
	return rear==arr.length;   //rear will move from 0 to 3 & will return true when rear=4
}
public boolean isempty()
{
	return front==rear; //This condition will only be true when front=rear=0, at end rear will
	                   //be at in next position of array size so front go upto last element
}
public void enqueue(int element)
{
	if(isfull())
	{
		System.out.println("cant insert more element");
	}
	else
	{
		arr[rear++]=element; //putting value first then incrementing
		System.out.println("enqueue element is: "+element);
	}
}
public int peek()
{
	if(isempty())
	{
		System.out.println("cant peek as stack is empty");
		return 0;		
	}	
	return arr[rear-1]; //getting value at the rear-1 becoz rear has moved to the next element
	
}
public int dequeue()
{
	if(isempty())
	{
		System.out.println("cant remove elements as the queue is empty");
		return 0;
	}
	int removedelement=arr[front++]; //removing value first then incrementing
	return removedelement;
	
	
	
}

}
