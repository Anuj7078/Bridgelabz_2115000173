import java.util.*;

public class WindChillTemp{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temp:");
		double temp = sc.nextDouble();
		System.out.print("Enter Wind Speed:");
		double windSpeed = sc.nextDouble();
		double ans = WindChillFunc(temp,windSpeed);
		System.out.println("Wind Chill: "+ans);
	}
	public static double WindChillFunc(double temp, double windSpeed){
		return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
	} 
}