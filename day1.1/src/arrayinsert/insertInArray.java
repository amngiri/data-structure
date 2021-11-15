package arrayinsert;
import java.util.*;
public class insertInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to add");
		int element=sc.nextInt();
		System.out.println("Enter in which position you want to add");
		int pos=sc.nextInt();
		for(int i=arr.length-1;i>pos-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=element;
		System.out.println("After inserting in array at desired position");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
