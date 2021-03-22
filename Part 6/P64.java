abstract class Test
{
	abstract void callme();
	void callmetoo()
	{
		System.out.println("Inside Test class.");
	}
}
class Test2
{
	void callme()
	{
		System.out.println("Inside Test2 class method callme().");
	}
	void callmetoo()
	{
		System.out.println("Inside Test2 class method callmetoo().");
	}
}
class P64
{
	public static void main(String a[])
	{
		Test2 t=new Test2();
		t.callme();
		t.callmetoo();
	}
}