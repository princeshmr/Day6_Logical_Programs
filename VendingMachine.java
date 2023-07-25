import java.util.Scanner;
class VendingMachine 
{
	static void countCurrency(int amount)
	{
		int []note={1000,500,100,50,10,5,2,1};
		int []noteCount=new int[note.length];
		for (int i=0;i<note.length ;i++ )
		{
			if (amount>=note[i])
			{
                                noteCount[i]=amount/note[i];
				amount=amount%note[i];
			}
		}
		System.out.println("Currency Count...");
		for (int i=0;i<noteCount.length ;i++ )
		{
			if (noteCount[i] != 0)
			{
				System.out.println(note[i]+" : "+noteCount[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount");
                int amount=scan.nextInt();
		countCurrency(amount);
	}
}
