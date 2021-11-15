package studentDay8;

public class LinkedListStudent {
	public static void main(String[] args) {
	StudentLL list=new StudentLL();
		
		Student s1=new Student(10,"Amit",740);   //student object is made 
	    list.insert(s1);  //student object is sent as element for parametre studentLL
		Student s2=new Student(11,"Rohan",700);
        list.insert(s2);
        Student s3=new Student(8,"Keshav",600);
        list.insert(s3);
        Student s4=new Student(99,"Aman",800);
        list.insert(s4);
       list.decendingTraverse();
     
        
		
		
	}
}

