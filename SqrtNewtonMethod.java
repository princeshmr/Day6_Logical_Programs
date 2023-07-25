import java.util.Scanner;
class SqrtNewtonMethod 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double c=scan.nextInt();
		double epsilon=1e-15;
		double t=c;
		while (Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t + t)/2.0;
		}
		System.out.println("Square root of a nonnegative number c = "+t);
	}
}
