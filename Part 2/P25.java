class Swap
{
	void swap(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("\nAfter swapping:\n a = "+a+" b = "+b);
	}
	
}
class P25
{
	public static void main(String a[])
	{
		Swap s=new Swap();
		int m=Integer.parseInt(a[0]);
		int n=Integer.parseInt(a[1]);
		System.out.println("Before swapping:\n a = "+m+" b = "+n);
		s.swap(m,n);
	}
}