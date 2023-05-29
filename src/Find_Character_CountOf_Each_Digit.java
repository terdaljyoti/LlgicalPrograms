
public class Find_Character_CountOf_Each_Digit
{
	public static void main(String[] args) 
	{
		String s1="Java program to find character count";
		String ch[]=s1.split(" ");
		
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]+" = "+ch[i].length());
		}
	}

}
