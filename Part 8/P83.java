class P83
{
	public static void main(String z[])
	{
		try
		{
			int[] a=new int[3];
			a[4]=0;
			int c=20,b=0,d=c/b;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException i.e. index used for array i larger than allocated size.");
		}
		try
		{
			int c=20,b=0,d=c/b;
			int[] a=new int[3];
			a[4]=0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nArithmeticException i.e. division by zero.");
		}
		finally
		{
			System.out.println("\nInside finally block.");
		}
	}
}