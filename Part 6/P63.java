import java.util.*;
abstract class Figure
{
	double l,b;
	Scanner s=new Scanner(System.in);
	Figure( int a)
	{
		System.out.println("Inside figure Class.");
	}
	Figure()
	{System.out.println("Inside default of Figure.");}
	void get_data()
	{
	l=s.nextDouble();
	b=s.nextDouble();
	}
	abstract void area();
}
class Triangle extends Figure
{
	void area1(){}
	Triangle(int a)
	{
		super();
	}
	Triangle()
	{
		
		System.out.println("Inside default of Triangle.");
	}
	void area()
	{
		System.out.println(1.0/2*l*b);
	}
}
class Square extends Figure
{
	Square()
	{
		System.out.println("Inside default of Square.");
	}
	void area()
	{
		System.out.println(l*l);
	}
}
class P63
{
	public static void main(String a[])
	{
		Figure s=new Triangle(1);
		s=new Triangle();
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