class Base
{
	int a;
	Base()
	{
		a=1;
	}
	void show()
	{
		System.out.println(a);
	}
}
class Derived extends Base
{
	int a;
	Derived()
	{
		super();							//To invoke base class constructor
		a=2;
	}
	void show()
	{
		
		a+=super.a;							//To specify attribute of base class
		System.out.println("Using super.a");
		System.out.println(super.a);
		System.out.println("Using super.show()");
		super.show();						//To invoke method of base class 
		System.out.println("Using this.a");
		System.out.println(this.a);
	}
}
class P65
{
	public static void main(String a[])
	{
		Derived d=new Derived();
		d.show();
	}
}