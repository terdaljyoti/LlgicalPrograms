
public class Find_Prime_No_From_Array 
{
	public static void main(String[] args) 
	{
		int ar[]= {13,15,17,19,21,23,27,25,29};
		for(int i=0;i<=ar.length-1;i++)
		{
			int count=0;
			for(int j=1;j<=ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(ar[i]+" ");
			}
		}	
	}
}
