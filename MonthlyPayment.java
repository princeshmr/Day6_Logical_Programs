import java.util.Scanner;
class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal");
		int p=scan.nextInt();   //principal
		System.out.println("Enter the year");
		int y=scan.nextInt();   //year
		System.out.println("Enter the rate of interest");
		double R=scan.nextDouble();   //rate of interest

		int n=12*y;
		double r=R/(12*100);

		double payment=(p*r)/(1-Math.pow((1+r),(-n)));

		System.out.println(payment);

	}
}
