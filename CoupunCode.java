import java.util.Scanner;
public class CoupunCode {
   public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Coupon number");
		int n=scan.nextInt();
		int []ar=new int[n];
		for (int i=0;i<ar.length ;i++ )
		{
		    int index=(int)(Math.random()*100)%10;
			ar[i]=index;
			
		}
                for (int i=0;i<ar.length ;i++ )
                {
			System.out.print(ar[i]);
                }
		System.out.println();
   }
}