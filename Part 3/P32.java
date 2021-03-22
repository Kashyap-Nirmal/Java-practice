class P32
{
	public static void main(String a[])
	{
		int i=1;
		String s="123";
		char c='A';
		float f=1.1f;
		byte b=12;
		short s2=150;
		double d=3.9999;
		long l=10000000;
		System.out.println("Few of the example of type casting are as below:\n");
		System.out.println("int i = "+i);
		System.out.println("String s = "+s);
		System.out.println("\nString to Integer Parsing:");
		i=Integer.parseInt(s);
		System.out.println("i=Integer.parseInt(s) is:"+i);
		System.out.println("\nInteger to String Parsing:");
		String s1=Integer.toString(i);
		System.out.println("String s1=Integer.toString(i) is:"+s1);
		int c1=c;
		System.out.println("\nchar to int casting:");
		System.out.println("char c = "+c);
		System.out.println("int c1 = c is:"+c1);
		int x=66;
		System.out.println("\nint to char casting :");
		System.out.println("int x = "+x);
		char c2=(char)x;
		System.out.println("char c2 =(char)x is:"+c2);
		System.out.println("\nFloat to int casting:");
		System.out.println("flaot f = "+f);
		int f1=(int)f;
		System.out.println("int f1 = (int)f is:"+f1);
		byte b1=(byte)s2;
		System.out.println("\nshort to byte casting:");
		System.out.println("short s2 = "+s2);
		System.out.println("byte b1=(byte)s2 is:"+b1);
	}
}