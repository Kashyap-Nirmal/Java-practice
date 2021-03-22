class Factorial
{
	static int g;	
	void factorial(int m)
	{
		g=m;
		while(m>1)
		{
			g*=(m-1);
			m--;
		}	
		System.out.print(g);
	}
}
class P23
{
	public static void main(String a[])
	{
		Factorial f=new Factorial();
		int n=Integer.parseInt(a[0]);
		System.out.print("The factorial of "+n+" is ");
		f.factorial(n);
	}
}