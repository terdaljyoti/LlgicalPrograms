
public class Find_Prime_No
{
	public static void main(String[] args) 
	{
		int num=23,count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is palindrom");
		}	
	}
}
