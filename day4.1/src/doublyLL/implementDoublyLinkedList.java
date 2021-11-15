package doublyLL;

public class implementDoublyLinkedList {

	public static void main(String[] args) {
		doublyLinkedList obj=new doublyLinkedList();
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);
        System.out.println("Enqueue elements are: ");
        
        obj.traverseForward();
        System.out.println();
        obj.insertAtBegin(54);
        obj.insertAtEnd(54);
        System.out.println("After Enqueue at start and end, elements are: ");
        obj.traverseForward();
        System.out.println();
        //System.out.println(obj.dequeue(54));
        obj.dequeueFirstElement(54);
        obj.dequeuelastElement(54);
        System.out.println("After forward traverse ,elements are: ");
        obj.traverseForward();
        System.out.println();
        System.out.println("After backward traverse ,elements are: ");
        obj.traverseBackward();
        //obj.display();
	}

}
