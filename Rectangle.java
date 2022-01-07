package shape;

public class Rectangle extends Shape{
	Rectangle (double length, double breadth)
	{
		dim1 = length;
		dim2 = breadth;
	}
	public void area()
	{
		double area_of_rectangle = dim1*dim2;
		System.out.println("The area of the rectangle is : "+area_of_rectangle);
	}
}
