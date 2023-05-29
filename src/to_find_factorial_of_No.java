
public class to_find_factorial_of_No 
{
	public static void main(String[] args) 
	{
		int num=6,fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
