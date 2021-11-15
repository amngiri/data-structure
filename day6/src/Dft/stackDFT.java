package Dft;

public class stackDFT {
private int top;
private NodeDFT[] arr;
public stackDFT()
{
	top=0;
	arr=new NodeDFT[10];
}
public boolean isEmpty()
{
	return top==0;
}
public boolean isFull()
{
	return top==arr.length;
}
public void enqueue(NodeDFT n)
{
	if(isFull())
	{
        System.out.println("Cant insert more elements");
        
	}
	else
	{
		arr[top++]=n;
	}
}
public NodeDFT dequeue()
{
	if(isEmpty())
	{
        System.out.println("Cant remove more elements");
        return null;
        
	}
	else
	{
		NodeDFT temp=arr[--top];
		return temp;
	}
}
}
