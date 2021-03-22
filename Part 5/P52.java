class Person
{
	int age;
	float salary;
	String name;
	Person(String n,int a,float s)
	{
		name=n;age=a;salary=s;
		System.out.print("Name = "+name+"\nAge = "+age+"\nSalary = "+salary);
	}
}
class P52
{
	public static void main(String a[])
	{
		Person p=new Person("Akki",20,20000.99f);
	}
}