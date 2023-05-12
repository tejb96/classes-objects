
/**
 * Class Name: Temperature
 * 
 * Contains a temperature in Fahrenheit and is able to retrieve it in Celsius or Fahrenheit.
 * 
 * @author Tejpreet Bal
 * @version 1.0
 * @Date May 11, 2023
 *
 */
public class Temperature {
	
	 double degrees; //temperature in Fahrenheit
	 
	 //Parameterized constructor
	 Temperature(double deg){
		 degrees = deg;
	 }
	
	//Return the temp in F
	double getFahrenheit() {
		return degrees;
	}
	
	//Return the temp in C
	double getCelsius() {
		return (5 *(degrees - 32) /9); 
	}
	

	public static void main(String[] args) {
		
		Temperature thermometer1 = new Temperature(20.0);
		Temperature thermometer2 = new Temperature(98.6);
		
		
		double thermometer1Cels = thermometer1.getCelsius();
		double thermometer2Cels = thermometer2.getCelsius();

		double thermometer1CelsRounded = Math.round(thermometer1Cels*100)/100.0;
		
			
			
		
		
		System.out.print("The temperature of thermometer1 is  " + thermometer1.degrees + " Fahrenheit"); 
		System.out.print("\n"+"The temperature of thermometer1 is  " + thermometer1CelsRounded + " Celsius"); 
		System.out.print("\n"+"The temperature of thermometer2 is  " + thermometer2.degrees + " Fahrenheit"); 
		System.out.print("\n"+"The temperature of thermometer2 is  " + thermometer2.getCelsius() + " Celsius"); 

	}

}
