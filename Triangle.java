package shape;

public class Triangle extends Shape{
	Triangle (double height, double base)
	{
		dim1 = height;
		dim2 = base;
	}
	public void area ()
	{
		double area_of_triangle = 0.5*dim1*dim2;
		System.out.println("The area of the triangle is "+area_of_triangle);
	}
}
