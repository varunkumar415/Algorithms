public class Temperature{
	
	private double ftemp;
	
	//constructor
	public Temperature(double ftempGiven)
	{
		ftemp=ftempGiven;
	}
	
	public void setFahrenheit(double ftempGiven)
	{
		ftemp=ftempGiven;
	}
	
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelcius()
	{
		return ((double)5/9)*(ftemp - 32);
	}
	
	public double getKelvin()
	{
		return (5/(double)9)*(ftemp - 32)+273;
	}
	
	//main method
	public static void main(String[] args)
	{
		Temperature temp = new Temperature(82);
		System.out.println("Class Name: "+temp.getClass().getSimpleName());
		System.out.println("Temperature in Fahrenheit: "+temp.getFahrenheit());
		System.out.println("Temperature in Celsius: "+temp.getCelcius());
		System.out.println("Temperature in Kelvin: "+temp.getKelvin());
	}
	
}//class