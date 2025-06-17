package inheritance;

public class Student extends Person
{	
	//name, id, display()
	String dept;
	
	void show()
	{
		display();
		System.out.println("Department = "+dept);
	}
}