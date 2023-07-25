import java.util.Scanner;
class StopWatch 
{
	public static long start;
	public static long end;
	 
	public static void start()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Starting the point,to press the key");
		String s1=scan.nextLine();      //that means press the start click
		System.out.println("Start to press the key "+s1);
		//start=System.nanoTime();      // output in nano seconds
		start=System.currentTimeMillis();      //output in milli seconds
	}
	public static void stop()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Ending the point,to press the key");
                String s2=scan.nextLine();   //that means press the end click
		System.out.println("End to press the key "+s2);
		//end=System.nanoTime();    // output in nano seconds
		end=System.currentTimeMillis();    //output in milli seconds
	}
	public static void checkElapse()
	{
                long elapseTime=(end-start)/1000;   //to change milliseconds to seconds(divide by 1000)
	        System.out.println("the elapsed time : "+elapseTime +" Seconds");
	}
	
	public static void main(String[] args) 
	{
       
		StopWatch sw=new StopWatch();
		sw.start();
		sw.stop();
		sw.checkElapse();
	}
}

