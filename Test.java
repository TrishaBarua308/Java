package inheritancePrivate;

public class Test extends Selected
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.setName("Trisha");
		t1.setId(1016);
		t1.setDept("BSc in CSE");
		
		t1.displayMore();
		
		
		Test t2 = new Test();
		t2.setName("Mitu");
		t2.setId(16);
		t2.setDept("MSc in CSE");
		
		t2.displayMore();
		
	}
}