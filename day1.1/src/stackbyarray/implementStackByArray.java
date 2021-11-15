package stackbyarray;

public class implementStackByArray {

	public static void main(String[] args) {
		stackByArray obj=new stackByArray();      //making object of stackByArray
		System.out.println(obj.peek());           //peek means getting element at top
		System.out.println();
		System.out.println(obj.pop());            //pop pulling element at top
		System.out.println();
		obj.push(30);                             //pushing element on top
		System.out.println();
		obj.push(34);
		System.out.println();
		obj.push(31);
		System.out.println();
		System.out.println("poped element "+obj.pop());
		System.out.println();
		obj.push(36);
		System.out.println();
		obj.push(35);
		System.out.println();
		obj.push(31223);
		System.out.println();
		obj.push(3);
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		System.out.println();
		System.out.println("peeked element------> "+obj.peek());
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		System.out.println();
		System.out.println("poped element------> "+obj.pop());
		}
}
