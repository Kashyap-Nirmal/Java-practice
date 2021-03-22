class Pattern
{
	void pat()
	{
	for(int i=4;i>0;i--)
	{
		for(int j=0;j<i;j++)
			System.out.print("1");
		System.out.println("");
		}
	}
}
class P26
{
	public static void main(String a[])
	{
		Pattern p=new Pattern();
		p.pat();
	}
}