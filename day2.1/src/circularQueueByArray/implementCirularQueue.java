package circularQueueByArray;
public class implementCirularQueue {

	public static void main(String[] args) {
		circularQueue obj=new circularQueue();
		obj.enqueue(34);
		obj.enqueue(23);
		System.out.println("Dequeue element-----------> "+obj.dequeue());
		obj.enqueue(76);
		obj.enqueue(45);
		obj.enqueue(42);
		System.out.println("Dequeue element-----------> "+obj.dequeue());
		obj.enqueue(88);
		obj.enqueue(45);
		obj.enqueue(22);
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println("Dequeue element-----------> "+obj.dequeue());
	}

}
