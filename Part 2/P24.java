class Large
{
	void check(int m,int n,int o)
	{
		if(m>n)
		{
			if(m>o)
				System.out.print(m);
			else
				System.out.print(o);
		}
		else
		{
			if(n>o)
				System.out.print(n);
			else
				System.out.print(o);
		}
	}
}
class P24
{
	public static void main(String a[])
	{
		Large l=new Large();
		int m=Integer.parseInt(a[0]);
		int n=Integer.parseInt(a[1]);
		int o=Integer.parseInt(a[2]);
		System.out.print("The largest among the entered numbers is :");
		l.check(m,n,o);
	}
}