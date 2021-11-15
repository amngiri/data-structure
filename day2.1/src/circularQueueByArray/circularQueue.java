package circularQueueByArray;

public class circularQueue {
	private int front;
	private int rear;
	private int[] arr;
	int count=0;
	public circularQueue()
	{
		arr=new int[5];
		front=-1;
		rear=-1;
	}
	public boolean isfull()
	{
		return count==arr.length;
	}
	public boolean isempty()
	{
		return count==0;
	}
	public void enqueue(int element)
	{
		if(isfull())
		{
			System.out.println("cant insert more elements as queue is full");
		}
		else {
			rear=(++rear)%arr.length;
			arr[rear]=element;
			
			System.out.println("enqueue element "+arr[rear]);
			count++;
		}
	}
	public int dequeue()
	{
		if(isempty())
		{
			System.out.println("cant pop more elements as queue is empty");
			return 0;
		}
		else {
			front=(++front)%arr.length;
			
			int removedelement=arr[front];
			count--;
			return removedelement;
		}
	}
}
