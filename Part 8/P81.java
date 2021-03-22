class P81
{
	public static void main(String z[])
	{
		try
		{
			int a=20,b=0,c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException i.e. division by zero.");
		}
		try
		{
			String s=null;
			s.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException i.e. performing some task onnull pointer.");
		}
		try
		{
			String s="a";
			int a=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException.");
		}
	}
}
