package paranthesisMatchingByStack;

public class paranthesisMatching {
	private int top = -1; //top is set at -1
	private char characterstack[];
	private String str;
	public paranthesisMatching(int size)
	{
	  str= "{([])}";                 //braces defined
	  characterstack= new char[size]; //new character array is made
	}
	public boolean isfull() {
		return top == characterstack.length; 
		//top is equal to character array means stack is full
	}

	public boolean isempty() { 
		return top == -1;               //top=-1 means only even a single element has not pushed yet
	}

	public char checkparenthesis() {
		for (int i = 0; i < str.length(); i++) { 
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				
				//checking str[i] & if it is a opening braces push it into stack
				push(str.charAt(i)); //pushing character at i into stack
				
			} else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
				
				//checking str[i] & if it is a closing braces pop a element from stack 
				//and putting it into matching character
				
				char matchingcharacter = pop();
				if (!matchingBraces(matchingcharacter, str.charAt(i))) { 
					//This condition will work for if there is unmatched character like {([)}
					//This will work also when only closing bracket left like ({[]}){   or  [ 
					
					System.out.println("Parenthesis dont match");
					System.exit(0); 
					
					//system exit is required because because if any unmatching character found 
					//the program should terminate
				}

			}
		}
		if (isempty()) {
			System.out.println("Parenthesis matching");	
			//checking if the stack is empty because the program execution is here means 
			//all elements are poped and pushed
		} else {
			System.out.println("parenthesis are not matching");
			//program execution here means stack has some thing after all pop & push
		}
		return 0;
	}

	public boolean matchingBraces(char matchingcharacter, char i) {  
		//receiving poped character & current character in for loop
		
		if (matchingcharacter == '(' && i == ')') {  //checking poped character & current character
			return true;
		} else if (matchingcharacter == '{' && i == '}') { //checking poped character & current character
			return true;
		} else if (matchingcharacter == '[' && i == ']') { //checking poped character & current character
			return true;
		}
		return false; //otherwise return false
	}

	public void push(char i) { //receiving character from string 
		if (!isfull()) {
			characterstack[++top] = i; //pushing opening braces into stack
		}
		else
			System.out.println("cant push as the stack is full");
	}

	public char pop() {
		if (!isempty()) {
			return characterstack[top--]; //poping & then decrementing
		} 
		return 0;
	}
}
