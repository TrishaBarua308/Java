package First;

public class varag 
{
	void add(int ... n)
	{
		int sum = 0;
		for(int i : n)
		{
			sum += i;
		}
		System.out.println("Sum = "+sum);
	}
}