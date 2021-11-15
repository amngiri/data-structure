package queuebyLL;

public class implementQueueusinglinkedList {

	public static void main(String[] args) {
		
		QueueUsingLinkedList obj=new QueueUsingLinkedList();
		obj.enqueue(45);
		obj.enqueue(34);
		obj.enqueue(13);
		obj.enqueue(53);
		System.out.println("Traverse element are:");
		obj.traverse();
		System.out.println("dequeue element is: "+obj.dequeue());
		System.out.println("dequeue element is: "+obj.dequeue());
		System.out.println("dequeue element is: "+obj.dequeue());
		System.out.println("dequeue element is: "+obj.dequeue());
		obj.enqueue(100);
		System.out.println("dequeue element is: "+obj.dequeue());	
		System.out.println("dequeue element is: "+obj.dequeue());
		obj.enqueue(200);
		obj.enqueue(300);
		System.out.println("dequeue element is: "+obj.dequeue());
		System.out.println("dequeue element is: "+obj.dequeue());
		System.out.println("dequeue element is: "+obj.dequeue());
	}

}
