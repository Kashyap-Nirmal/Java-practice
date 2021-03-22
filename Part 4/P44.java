import java.util.*;
class Multiply
{
	Scanner s=new Scanner(System.in);
	int i,j,k;
	int [][]a=new int[3][3];
	int [][]b=new int[3][3];
	int [][]c=new int[3][3];
	void scan()
	{
		System.out.println("Enter the array elements for 3x3 matrix.");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=s.nextInt();
		System.out.println("Enter the array elements for second matrix.");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				b[i][j]=s.nextInt();
	}
	void display()
	{
		for(i=0;i<3;i++)
		{
				for(j=0;j<3;j++)
					System.out.print(c[i][j]+"  ");
			System.out.println();
		}
	}
	void mul()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		display();
	}
	
}
class P44
{
	public static void main(String a[])
	{
		Multiply m=new Multiply();
		m.scan();
		m.mul();
	}
}