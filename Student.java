package First;
import java.util.Scanner;
public class Student 
{
	String name;
	int id;
	
	Scanner input = new Scanner(System.in);
	
	void get()
	{
		System.out.print("Input  name = ");
		name = input.nextLine();
		System.out.print("Input ID = ");
		id = input.nextInt();
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
	}
}
