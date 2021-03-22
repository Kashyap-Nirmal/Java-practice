import java.util.*;
abstract class Shape
{
	double l,b;
	void get_data()
	{
	Scanner s=new Scanner(System.in);
	l=s.nextDouble();
	b=s.nextDouble();
	}
	Shape()
	{
			l=0.0;
			b=0.0;
	}
	abstract void display_area();
}
class Triangle extends Shape
{
	void display_area()
	{
		System.out.println(1.0/2*l*b);
	}
}
class  Rectangle extends Shape
{
	void display_area()
	{
		System.out.println(l*b);
	}
}
class P61
{
	public static void main(String a[])
	{
		Shape s=new Triangle();
		System.out.println("Enter height and base for triangle.");
		s.get_data();
		System.out.println("Area of Triangle:");
		s.display_area();
		s=new Rectangle();
		System.out.println("Enter length and breadth for rectangle.");
		s.get_data();
		System.out.println("Area of Rectangle:");
		s.display_area();
	}
}