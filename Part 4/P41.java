import java.util.*;
class P41
{
	public static void main(String a[])
	{
		int i,j,k;
		Scanner s=new Scanner(System.in);
		double[] n=new double[5];
		double [][]d=new double[3][3];
		double [][][]t=new double[2][2][2];
		System.out.println("Enter the array elements for an array of 5 elements.");
		for(i=0;i<5;i++)
			n[i]=s.nextDouble();
		System.out.print("\nEntered elments of array are :");
		for(i=0;i<5;i++)
			System.out.print(" "+n[i]+" ");
		System.out.println("\nEnter the elements for 3x3 matrix.");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				d[i][j]=s.nextDouble();
		System.out.print("\nEntered elments of matrix of 3x3 are :\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(d[i][j]+"  ");
			System.out.println();
		}
		System.out.println("\nEnter the elements for 2x2x2 matrix.");
		for(i=0;i<2;i++)
			for(j=0;j<2;j++)
				for(k=0;k<2;k++)
					t[i][j][k]=s.nextDouble();
		System.out.println("\nEntered elements for 2x2x2 matrix:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				for(k=0;k<2;k++)
					System.out.print(t[i][j][k]+"  ");
		}
	}
}