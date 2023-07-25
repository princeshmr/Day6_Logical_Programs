import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int count=0;
		if (n<=1)
		{
			System.out.println("Not a prime number");
			return;
		}
		for (int i=2;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				count++;
				break;
				
			}
		}
		//System.out.println(count);
		if (count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
