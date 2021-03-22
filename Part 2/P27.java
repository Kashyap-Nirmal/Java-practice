class Season
{
	void display(int c)
	{
		switch(c)
		{
		case 1:
		case 2:
		case 12:
		System.out.print("Winter");
		break;
		case 3:
		case 4:
		case 5:
		System.out.print("Spring");
		break;
		case 6:
		case 7:
		case 8:
		System.out.print("Summer");
		break;
		case 9:
		case 10:
		case 11:
		System.out.print("Autumn");
		break;
		default:
		System.out.print("Invalid month entered.");
		break;
		}
	}
}
class P27
{
	public static void main(String a[])
	{
		Season s=new Season();
		s.display(4);
	} 
}