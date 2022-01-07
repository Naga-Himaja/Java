package shape;

public class Circle extends Shape{
	Circle(double radius)
	{
		dim1 = radius;
	}
	public void area()
	{
		double area_of_circle = 3.14*dim1*dim1;
		System.out.println("The area of the Circle is "+area_of_circle);
	}
}
