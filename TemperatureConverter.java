public interface TemperatureConverter{

   double convert(double temperature);
}

class TemperatureConverterDemo{
	public static void main(String[] ar){
		
		TemperatureConverter obj = (celsius)-> (celsius * 9/5)+32;
		
		TemperatureConverter obj1 = (celsius)-> (celsius - 32)*5/9;
		
		double tempc=25;
		double tempf=77;
		
		System.out.println(tempc+"c is"+obj.convert(tempc)+"f");
		System.out.println(tempf+"f is"+obj.convert(tempf)+"c");
		
		
	}
}