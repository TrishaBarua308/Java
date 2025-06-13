package First;

public class check 
{
	void  add()
	{
		System.out.println("Sorry!!!");
	}
	
	 void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	 void add(double a, double  b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}



	
	
	public static void main(String[] args)
	{
		check a = new check();
		a.add();
		a.add(10,20);
		a.add(5.5, 3.1);
		a.add(2,5,8);
	}

}