import java.util.Scanner;
class DayOfWeek
{
	static boolean isLeapYear(int year)
	{
        if ((year%4==0 && year%100!=0)||(year%400==0))
        {
		return true;
        }
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};

		while (true)
		{
                        System.out.println("Enter the Year");
			int y=scan.nextInt();
			boolean leapYear=isLeapYear(y);
			if (leapYear)
			{
				monthDays[1]=29;
			}

			System.out.println("Enter the Month");
			int m=scan.nextInt();
			if (m<1 || m>12)
			{
				System.out.println("months are between 1 to 12");
				continue;
			}

			System.out.println("Enter the Day");
			int d=scan.nextInt();
			if (d<1 || d>monthDays[m-1])
			{
				System.out.println("Invalid Days");
				continue;
			}

			
			/*if (y<1 || y>10000)
			{
				System.out.println("Years are between 1 to 10000");
				continue;
			}*/


                int y0 = y - (14 - m) / 12;
                int x = y0 + y0/4 - y0/100 +y0/400;
                int m0 = m + 12 * ((14 - m) / 12) - 2;
                int d0 = (d + x + 31 * m0 / 12) % 7;  

		switch (d0)
		{
		     case 0:
			  System.out.println("Sunday");
			  break;
		     case 1:
			  System.out.println("Monday");
			  break;
		     case 2:
			  System.out.println("Tuesday");
		          break;
		     case 3:
			  System.out.println("Wednesday");
			  break;
		     case 4:
			  System.out.println("Thrusday");
			  break;
		     case 5:
			  System.out.println("Friday");
			  break;
		     case 6:
			  System.out.println("Saturday");
			  break;
                     default:
			  System.out.println("Day not exits");
               
		 }
                 break;
		}
	}
}
