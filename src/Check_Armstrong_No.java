
public class Check_Armstrong_No 
{
	public static void main(String[] args)
	{
		int num=153,rem,sum=0;         //num=1634,8208,9474
		
		for(int i=num;i>0;i=i/10)
			
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			
		}
		if(sum==num)
		{
			System.out.println(num+" is armstrong no");
		}
		else
		{
			System.out.println(num+" is not armstrong no");
		}
	
	}

}
