package First;

public class CallByValueTest
{
	public static void main(String[] args)
	{
		callByValue a = new callByValue();
		int x  = 5;
		
		System.out.println("before calling x = "+x);
		
		a.call(x);
		System.out.println("after calling x = "+x);		
	}
}