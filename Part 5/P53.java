class Circle
{
	int x,y;
	double r;
	Circle(double r)
	{
		x=0;
		y=0;
		this.r=r;
	}
	Circle(int x,int y,double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	void disp()
	{
		System.out.println("For center :\nx = "+x+" y = "+y+"\nRadius = "+r+"\nArea = "+((double)1/2*r*r));
		
	}
}
class P53
{
	public static void main(String a[])
	{
			Circle c1=new Circle(3.3);
			Circle c2=new Circle(1,1,3.4);
			System.out.println("For circle 1");
			c1.disp();
			System.out.println("\nFor circle 2");
			c2.disp();
	}
}