package towerofhanoi;

public class towerOfHanaoiPowerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
		System.out.println(power(2,4));
		towerofhanoi(5,'A','B','c');

	}
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
			return n*factorial(n-1);
	}
	public static int power(int base,int power)
	{
		if(power==0)
		{
			return 1;
		}
		else
		{
			return base*power(base,power-1);
		}
	}
	public static void towerofhanoi(int n,char src,char aux,char tar)
	{
		if(n==0)
		{
			return;
		}
		else
			towerofhanoi(n-1,src,tar,aux);
		    System.out.println("move disk "+ n + " from "+ src + "to "+ tar);
		    towerofhanoi(n-1,aux,src,tar);
	}
}
