package increaselist;

public class TesterList {

	public static void main(String[] args) {
		
		IncreaseList list = new IncreaseList();
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.insert(4);
		list.sortLL();

	}

}
