
public class Check_ArmstrongNo_UsingWhile_Loop 
{
	 public static void main(String[] args) 
	{
		 int num=1634,rem,sum=0;
		 
		 int i=num;
		 while(i>0)
		 {
			 rem=i%10;
			 sum=sum+(rem*rem*rem*rem);
			 i=i/10;
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
