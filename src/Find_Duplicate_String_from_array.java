
public class Find_Duplicate_String_from_array
{
	public static void main(String[] args) 
	{
		String ar[]= {"java","C++","C","C#","java","C++",".Net"};
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i].equals(ar[j]))
				{
					System.out.println(ar[i]);
				}
			}
		}
		
	}
}
