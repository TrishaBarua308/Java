package First;

public class constructor_overloading {

	public static void main(String[] args) 
	{
		Professor p1 = new Professor(); // Default
		
		
		Professor p2 = new Professor("CSE",43);
		p2.display();
		
		Professor p3 = new Professor("Trisha","CSE",1016 );
		p3.display();
		
		
		
	}
}