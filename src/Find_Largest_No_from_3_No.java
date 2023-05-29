
public class Find_Largest_No_from_3_No 
{
	public static void main(String[] args) 
	{
		int a=40,b=60,c=90;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Largest No :"+a);
			}
			else
			{
				System.out.println("Largest No :"+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Largest No :"+b);
			}
			else
			{
				System.out.println("Largest No :"+c);
			}
		}
		
	}

}
