import java.util.Scanner;
class TemperaturConversion 
{
	static double findCelsius(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
	static double findFahrenheit(double celsius)
	{
		return (celsius *9/5)+32;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                System.out.println("Enter the Fahrenheit Temperature");
		double fahrenheit=scan.nextDouble();
		double resCelsius=findCelsius(fahrenheit);
		System.out.println("Celsius Temperature is = "+resCelsius);

		System.out.println("Enter the Celsius Temperature");
		double celsius=scan.nextDouble();
		double resFahrenheit=findFahrenheit(celsius);
		System.out.println("Fahrenheit Tempearature is = "+resFahrenheit);
	}
}
