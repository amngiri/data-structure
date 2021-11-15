package queueByArray;
//what is 
//Application of queue

//1.os uses it CPU scheduling purpose
//2.Resource allocation / sharing
//3.synchronous data transfer
//4.BFT traversal of tree
public class implementQueueByArray {

	public static void main(String[] args) {
		queueByArray obj=new queueByArray();
		obj.enqueue(34);
		System.out.println();
		System.out.println("Dequeue element-----------> "+obj.dequeue());
		System.out.println();
		obj.enqueue(23);
		System.out.println();
		obj.enqueue(76);
		System.out.println();
		obj.enqueue(45);
		System.out.println();
		obj.enqueue(49);
		System.out.println();
		System.out.println("peeked Element= "+obj.peek());
		System.out.println();
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println();
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println();
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println();
        System.out.println("Dequeue element-----------> "+obj.dequeue());
        System.out.println();
        System.out.println("peeked Element= "+obj.peek());
	}

}
