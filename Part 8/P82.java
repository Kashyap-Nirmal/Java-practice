import java.util.*;
class AgeLimitException extends Exception
{
	public AgeLimitException(String message)
	{
		super(message);
	}
	public static void check(int p)throws AgeLimitException
	{
		if(p<18)
			throw new AgeLimitException("You are underage.So you are not elligible for voting.");
	}
}
class P82
{
	public static void main(String z[])throws AgeLimitException,InterruptedException,ArrayIndexOutOfBoundsException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		AgeLimitException.check(a);
		}
}