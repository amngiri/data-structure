package queuebyLL;

public class QueueUsingLinkedList {
	private queueNode rear; //at the end head be the last node made
	private queueNode front; ////at the end tail be the first node made

	public QueueUsingLinkedList() {
		rear = null;
		front = null;
	}

	public boolean isempty() {
		return rear==null; //At the end head will be the last node made
	}

	public void enqueue(int element) {
		queueNode temp = new queueNode();

		if (temp == null) //if temp cant be made so null be returned by JVM 
		{
			System.out.println("cant insert more");
			return;
		} else {
			temp.setData(element);
			if (rear == null) {
				rear = temp;
				front = temp;
				System.out.println("enqueue element are: "+rear.getData());
			} else {
				rear.setNext(temp);
				temp.setNext(null);
				rear = temp;
				System.out.println("enqueue element are: "+rear.getData());
			}
		}
	}

	public int dequeue() {
		
		if (isempty()) { //if rear==null means node is made
			System.out.println("cant pop element");
			return 0;

		}

		else {

			if (front.getNext() == null) { //in case if there only single node exist
				int data=front.getData(); //take data of target node
				front.setNext(null); //set tail next to null
				rear=null; //this line is not necessary
				return data; //return data which is dequeued
			} else {
				int data = front.getData(); //this line means there is more than 1 node
				queueNode temp = front.getNext(); //get ref of target node
				front.setNext(null); //target node set to null
				front = temp; //next of target node is made null
				return data; //return data of target node
			}
		}

	}

	public void traverse() {
		queueNode temp = front; //tail was the first node made
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
