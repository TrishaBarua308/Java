package inheritance;

public class Test 
{
	public static void main(String[] args)
	{
		Student s1 = new Student() ;
		s1.name = "Trisha";
		s1.id = 1016;
		s1.dept = "BSc in CSE" ;
		s1.show();
		
		Student s2 = new Student() ;
		s2.name = "Mitu";
		s2.id = 16;
		s2.dept = "MSc in CSE" ;
		s2.show();
		
	}
}