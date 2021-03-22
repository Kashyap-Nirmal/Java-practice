interface Area
{
	void area();
}
class Circle implements Area
{
	float r=2,a;
	public void area()
	{
		a=3.14f*r*r;
		System.out.println("Area of square is :"+a);
	}
}
class Square implements Area
{
	float l=5,a;
	public void area()
	{
		a=l*l;
		System.out.println("Area of square is :"+a);
	}
}
class P72
{
	public static void main(String a[])
	{
		Area x=new Circle();
		x.area();
		x=new Square();
		x.area();
	}
}
