import java.util.*;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String t="";
		while (n>0)
		{
			int r=n%2;
			t=r+t;
			n=n/2;
		}
		System.out.println(t);
		
	}
}
