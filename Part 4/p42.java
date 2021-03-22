class Sort
{
	int a[]={1,5,3,4,2};
	int i,j;
	void display()
	{
		for(int i:a)
			System.out.println(i);
	}
	void sort()
	{
		display();
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		System.out.println("Array after sorting:\n");
		display();
	}
}
class p42
{
	public static void main(String a[])
	{
		System.out.println("Array before sorting:\n");
		Sort s=new Sort();
		s.sort();
	}
}