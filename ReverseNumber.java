import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();    //1234
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);   //4321
	}
}
