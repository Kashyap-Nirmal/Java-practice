class OddEven
{
	void check(int m)
	{
		if(m%2==0)
			System.out.print("Enen.");
		else
			System.out.print("Odd.");
	}
}
class P22
{
	public static void main(String a[])
	{
		OddEven e=new OddEven();
		int m=Integer.parseInt(a[0]);
		e.check(m);
	}
}