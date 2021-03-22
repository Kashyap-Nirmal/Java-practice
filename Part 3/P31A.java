class Arithmetic
{
	void arithmetic(int m,int n,String o)
	{
		switch(o)
		{
			case '+':
			System.out.println(m+"+"+n+" = "+(m+n));
			break;
			case '-':
			System.out.println(m+"-"+n+" = "+(m-n));
			break;
			case '*':
			System.out.println(m+"*"+n+" = "+(m*n));
			break;
			case '/':
			System.out.println(m+"/"+n+" = "+(m/n));
			break;
			case '%':
			System.out.println(m+"%"+n+" = "+(m%n));
			break;
		}
	}
}
class P31A
{
	public static void main(String z[])
	{
		Arithmetic a=new Arithmetic();
		int m=Integer.parseInt(z[0]);
		int n=Integer.parseInt(z[2]);
		//String o=z[1];
		char o=z[1].charAt(0);
		a.arithmetic(m,n,o);
	}
}