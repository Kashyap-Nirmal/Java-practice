import java.util.*;
class Array
{
	float [][] a={{-50.5f},{500.1f,70.70f},{100.9f,0.5f,20.2f}};
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
class P43
{
	public static void main(String a[])
	{
		Array b=new Array();
		System.out.println("\nThe elements of the array are:");s
		b.display();
	}
}