package deletefromarray;
import java.util.*;
public class deleteAnElementFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int arr[]=new int[5];
		System.out.println("Enter elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter in which position from where you want to delete");
		int pos=sc.nextInt()-1;
		for(i=pos+1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[i-1]=0;
		System.out.println("After deleting in array at desired position");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
