package shape;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("1.Trianle\n2.Circle\n3.Rectangle\n4.Exit");
		System.out.print("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n<4)
		{
			switch (n)
			{
			case 1 : System.out.print("Enter the dimensions of the triangle : ");
					 Triangle t = new Triangle(sc.nextDouble(),sc.nextDouble());
					 t.area(); break;
			case 2 : System.out.print("Enter the radius of the circle : ");
					 Circle c = new Circle(sc.nextDouble());
					 c.area(); break;
			case 3 : System.out.print("Enter the dimensions of the rectangle : ");
					 Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
					 r.area(); break;
			}
			System.out.println("1.Triangle\n2.Circle\n3.Rectangle\n4.Exit");
			System.out.println("Enter your choice : ");
			n = sc.nextInt();
		}
	}

}
