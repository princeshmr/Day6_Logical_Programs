import java.util.Scanner;
class SwapNibble 
{
	static boolean isCheckPowerOfTwo(int n)
	{
                if (n==0)
                    return false;
		while (n%2==0)
		{
		   n=n/2;
		}
		if (n==1)
		   return true;
		else
		   return false;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int num=scan.nextInt();

		//1> Swap nibbles and find the new number.

		int newNum;
		newNum=((num & 0x0F) << 4 | (num & 0xF0) >> 4);

		System.out.println("Before Swapping "+num);
		System.out.println("After Swapping "+newNum);

		//2> Find the resultant number is the number is a power of 2.

		Boolean res=isCheckPowerOfTwo(newNum);

		if (res)
		   System.out.println(newNum+" is the Power of 2");
		else
		   System.out.println(newNum+" is not the power of 2");

	}
}

