class A
{
	float a=1;
}
class B extends A
{
	float b=2;
}
class C extends B
{
	float c=3;
}
class D extends C
{
	float d=4;
}
class P66
{
	public static void main(String a[])
	{
		D o=new D();
		float avg=(o.a+o.b+o.c+o.d)/4;
		System.out.println("Average of 4 variables of different classes is :\n"+avg);
	}
}
