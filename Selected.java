package inheritancePrivate;

public class Selected extends Student
{
	//getname,setname, display()
	
	private String dept;
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	void displayMore()
	{
		display();
		System.out.println("Department = "+dept);
		System.out.println();
	}
	
	
}
