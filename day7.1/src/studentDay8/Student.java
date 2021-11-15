package studentDay8;
public class Student { 
	private int rollNo;
	private String name;
	private int marks;
	

	public Student(int rollNo, String name, int marks) {
		//every time a student object is created this parametres are set
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


	public int getRollNo() { 
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	


}
