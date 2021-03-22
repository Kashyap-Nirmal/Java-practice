import java.util.Scanner;
class Operator
{
	void operator(int m,int n,String o)
	{
			switch(o)
			{
				case "+":
				System.out.println(m+"+"+n+" = "+(m+n));
				break;
				case "-":
				System.out.println(m+"-"+n+" = "+(m-n));
				break;
				case "*":
				System.out.println(m+"*"+n+" = "+(m*n));
				break;
				case "/":
				System.out.println(m+"/"+n+" = "+(m/n));
				break;
				case "%":
				System.out.println(m+"%"+n+" = "+(m%n));
				break;
				case "&":
				System.out.println(m+" & "+n+" = "+(m & n));
				break;
				case "|":
				System.out.println(m+" | "+n+" = "+(m|n));
				break;
				case "^":
				System.out.println(m+" ^ "+n+" = "+(m^n));
				break;
				case "==":
				System.out.println(m+" == "+n+" = "+(m==n));
				break;
				case ">=":
				System.out.println(m+" >= "+n+" = "+(m>=n));
				break;
				case "<=":
				System.out.println(m+" <= "+n+" = "+(m<=n));
				break;
				case "!=":
				System.out.println(m+" != "+n+" = "+(m!=n));
				break;
				case ">":
				System.out.println(m+" > "+n+" = "+(m>n));
				break;
				case "<":
				System.out.println(m+" < "+n+" = "+(m<n));
				break;
				case "<<":
				System.out.println(m+" << "+n+" = "+(m<<n));
				break;
				case ">>":
				System.out.println(m+" >> "+n+" = "+(m>>n));
				break;
				case "~":
				System.out.println(m+" >> "+n+" = "+(~m));
				break;
				case "&&":
				System.out.println(m+" > "+n+" && "+m+" - "+n+" >0 = "+((m>n) && (m-n)>0));
				break;
				case "||":
				System.out.println(m+" > "+n+" || "+m+" < "+n+"  = "+((m>n) || (m<n) ));
				break;
				default: 
				boolean a=true,b=false;
				System.out.println(m+" > "+n+" = "+((m>n)?a:b));
				
			}	
	}
}
class P31
{
	public static void main(String v[])
	{
		System.out.println("Enter c for conditional operator as 2nd argument.");
		Scanner s=new Scanner(System.in);
		Operator a=new Operator();
		int m=s.nextInt();
		String o=s.next();
		int n=s.nextInt();
		a.operator(m,n,o);
	}
}