import java.util.*;
class Figure
{
	double l,b;
	Scanner s=new Scanner(System.in);
	void get_data()
	{
	l=s.nextDouble();
	b=s.nextDouble();
	}
	void area(){}
}
class Triangle extends Figure
{
	void area()
	{
		System.out.println(1.0/2*l*b);
	}
}
class Square extends Figure
{
	void area()
	{
		System.out.println(l*l);
	}
}
class P62
{
	public static void main(String a[])
	{
		Figure s=new Triangle();
		System.out.println("Enter height and base for triangle.");
		s.get_data();
		System.out.println("Area of Triangle:");
		s.area();
		s=new Square();
		System.out.println("Enter length for square.");
		s.get_data();
		System.out.println("Area of Square:");
		s.area();
	}
}