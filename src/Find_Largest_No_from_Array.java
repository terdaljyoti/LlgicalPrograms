import java.util.Arrays;

public class Find_Largest_No_from_Array
{
	public static void main(String[] args)
	{
		int num[]= {80,50,30,50,20,40,90};
		Arrays.sort(num);
		System.out.println(num[num.length-1]);
	}

}
