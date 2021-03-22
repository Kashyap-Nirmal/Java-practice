class Season
{
	void display(int m)
	{
		int c;
		if(m>0 && m<3 || m==12)
			c=1;
		else if(m>2 && m<6)
			c=2;
		else if(m>5 && m<9)
			c=3;
		else if(m>8 && m<12)
			c=4;
		else
			c=5;
		switch(c)
		{
			case 1:
			System.out.print("Winter");
			break;
			case 2:
			System.out.print("Spring");
			break;
			case 3:
			System.out.print("Summer");
			break;
			case 4:
			System.out.print("Autumn");
			break;
			case 5:
			System.out.print("Invalid month entered.");
			break;
		}
	}
}
class P27m
{
	public static void main(String a[])
	{
		Season s=new Season();
		int m=Integer.parseInt(a[0]);
		s.display(m);
	} 
}