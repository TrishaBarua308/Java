package First;

public class Professor
{
	String name, dept;
	int id;
	
	Professor() //Default constructor
	{
		System.out.println("No output. Sorry!!!");
		 System.out.println();
	}
	
	Professor(String d, int i)
	{
		dept = d;
		id = i;
	}
	
	Professor(String n, String d, int i)
	{
		name = n;
		dept = d;
		id = i;
	}
	
	void display()
	{
		System.out.println("Name           = "+name);
		System.out.println("Department = "+dept);
		System.out.println("ID                 = "+id);
	    System.out.println();
	}
	
}