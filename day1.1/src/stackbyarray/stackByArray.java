//Application of stack-
//parenthesis matching,infix to prefix,browser next & back,undo redo,tower of hanoi,back tracking,recursion

package stackbyarray;
public class stackByArray {

private int arr[];       //declaring array  
private int top=0;     //setting top as 0 because stack is empty
public stackByArray()  //making default constructor of stackByArray class to set size of array 
{
   arr=new int[5];
}
public stackByArray(int size)  //making parameterized constructor of stackByArray 
{                             //class to set size of array according to user demand
arr=new int[size];           //defining array
}
public boolean isfull()      
{
	return top==arr.length;    //when top will reach at the stack top means array is full
}
public boolean isempty()
{
	return top==0;            //when stack is empty and top has not moved up even once
}
public void push(int element)
{
	if(!isfull())              //checking if stack is full before pushing
	{
		arr[top++]=element; //first putting value at current position then incrementing it to next
		System.out.println("pushed element "+arr[top-1]); 
	}
	else
		System.out.println("cant push into the stack more"); //stack is empty
}
public int pop()
{
	if(isempty())              //checking empty condition before pop
	{
		System.out.println("cant pop from the stack more");
		return -1;
	}
	else
		return arr[--top]; //first decrement then put the value at position as due to pushing the
	                       //top has moved to next position where no element is present
}
public int peek() 
{
	if(isempty()) //empty checking is required to because we can't peek if there is nothing present
	{
		System.out.println("stack is empty");
		return -1;
	}
	else
		return arr[top-1]; //sending top-1 value becoz top has moved to next position 
	                      //where no element is present
}
}
