package doublyLL;

public class doublyLinkedList {
	private doublyLLnode head;
	private doublyLLnode tail;

	public doublyLinkedList() {
		head = null;
		tail = null;
	}

	public void enqueue(int element) {
		doublyLLnode temp = new doublyLLnode();
		if (temp == null) {
			System.out.println("Cant push more elements");
		} // if
		else {
			temp.setData(element);
			if (head == null) {
				head = temp;     //head pointing to the first node 
				tail = temp;  //tail pointing to the first node
			} else {
				temp.setPrev(head);  //new temp previous pointing to the head
				head.setNext(temp);  //previous node next pointing to new node
                head=temp;  //new node made head
			}
		}
	}

	public void insertAtBegin(int element) {
		doublyLLnode temp = new doublyLLnode();
		temp.setData(element);
		tail.setPrev(temp); //tail previous point to temp
		temp.setNext(tail);//new node next point to tail
		tail = temp;//tail assigned to new node

	}

	public void insertAtEnd(int element) {
		doublyLLnode temp = new doublyLLnode();
		temp.setData(element);
		head.setNext(temp); //head next point to new node
		temp.setPrev(head);//new node previous point to head i.e previous node 
		head = temp;//new node is assigned as head
		temp.setNext(null);//new node next set to null as it is now the last node

	}

	public int dequeuelastElement(int element) {
		int data;
		doublyLLnode curr = head;
		while (curr.getData() != element) { //traverse till reaches the node of data
			curr = curr.getNext();
		}
		data = curr.getData(); //data put in variable
		head = curr.getPrev(); //target node previous is made head
		curr.getPrev().setNext(null); //target node previous node next is set to null
		curr.setPrev(null); //target node previous is set free
		return data; //data returned

	}

	public void dequeueFirstElement(int element) {
		doublyLLnode curr = tail; //as tail is already at first node
		doublyLLnode ref = curr.getNext();//target next node address put into variable
		tail = ref; //target next node is made tail
		ref.setPrev(null);//target next node's previous is set to null
	}

	public void traverseForward() {
		doublyLLnode curr;
		curr = tail;
		while (curr != null) { //traverse tail to head
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public void traverseBackward() {
		doublyLLnode curr = head;
		while (curr != null) {//traverse head to head
			System.out.println(curr.getData());
			curr = curr.getPrev();

		}
	}
}
