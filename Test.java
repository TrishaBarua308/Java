package abstract_class_method;

public class Test
{
    public static void main(String[] args)
    {
        Shape s;

        s = new Rectangle(10,20);
        s.area();

        s = new Circle(10);
        s.area();

        s = new Triangle(10,20);
        s.area();
    }
}
