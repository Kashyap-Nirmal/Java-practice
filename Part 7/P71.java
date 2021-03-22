interface K1
{
	void mK();
	int i=1;
}
interface K2 extends K1
{
	void mK();
} 
interface K3 extends K2
{
	void mK();
} 

class U implements K3
{
	public void mK()
	{
		System.out.println("i = "+i);
	}
}
class P71
{
	public static void main(String a[])
	{
		K3 k=new U();
		k.mK();
	}
}