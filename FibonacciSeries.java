import java.util.Scanner;
class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int[n];
		if (n>1)
		{
			ar[1]=1;
		}
		for (int i=2;i<ar.length ;i++ )
		{
			ar[i]=ar[i-1]+ar[i-2];
		}
		for (int data:ar )
		{
			System.out.print(data+" ");
		}
		System.out.println();
	}
}
