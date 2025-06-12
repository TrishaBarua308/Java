package First;

public class BoxNew
{
	double height, width, depth;
	
	BoxNew(double height, double width, double depth)
	{ //instance      /Local
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	void displayVol()
	{
		System.out.println("Volume = "+(height*width*depth));
		System.out.println();
	}
}