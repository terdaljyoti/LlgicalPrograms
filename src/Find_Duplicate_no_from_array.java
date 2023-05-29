
public class Find_Duplicate_no_from_array
{
	public static void main(String[] args) 
	{
		int ar[]= {20,40,30,20,40,10,60};
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
		}
	}

}
