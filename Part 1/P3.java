class Fibb
{
	public void fib(int n)
	{
		System.out.println("Fibonnaci series:");
		int a=-1,b=1,c;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
class P3
{
	public static void main(String ar[])
	{
		int n=Integer.parseInt(ar[0]);
		Fibb f=new Fibb();
		f.fib(n);
	}
}