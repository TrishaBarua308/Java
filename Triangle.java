package abstract_class_method;

public class Triangle extends Shape
{
    Triangle(double a, double b)
    {
        super(a,b);
    }

    @Override
    void area()
    {
        System.out.println("Area of Triangle = "+(0.5*a*b));
    }
}
