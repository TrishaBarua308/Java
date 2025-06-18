package inheritancePrivate;

public class Student 
{
	private String name;
	private int id;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id ;
	}
	
	
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
	}
	
}
