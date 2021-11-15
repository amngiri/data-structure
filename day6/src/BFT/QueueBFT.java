package BFT;

public class QueueBFT {
	private int front;
	private int rear;
	private int count;
	private NodeBFT[] arr;
	public QueueBFT()
	{
		front =-1;
		rear = -1;
		count = 0;
		arr = new NodeBFT[10];
	}
	public boolean isEmpty()
	{
		return (count==0);
	}
	public boolean isFull()
	{
		return (count == arr.length);
	}
	public void enqueue(NodeBFT n)
	{
		if (!isFull())
		{
			rear = (++rear)%arr.length;
			arr[rear] = n;
			count++;
		}
		else
		{
			System.out.println("Queue is full.");
		}
	}
	
	public NodeBFT dequeue()
	{
		if (!isEmpty())
		{
			front = (++front)%arr.length;
			NodeBFT temp = arr[front];
			count--;
			return temp;
		}
		else
		{
			System.out.println("Queue is empty.");
			return null;
		}
	}
	
	public NodeBFT frontNode()
	{
		if (!isEmpty())
		{
			NodeBFT temp = arr[front-1];
			return temp;
		}
		else
		{
			System.out.println("Queue is empty.");
			return null;
		}
	}
}
