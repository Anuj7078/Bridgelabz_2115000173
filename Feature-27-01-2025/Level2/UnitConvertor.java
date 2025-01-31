
public class UnitConvertor{
	public static double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        return km * kmTomiles;
    }

    public static double convertMilesToKm(double miles) {
        double milesTokm = 1.60934;
        return miles * milesTokm;
    }

    public static double convertMetersToFeet(double meters) {
        double metersTofeet = 3.28084;
        return meters * metersTofeet;
    }

    public static double convertFeetToMeters(double feet) {
        double feetTometers = 0.3048;
        return feet * feetTometers;
    }

    public static void main(String[] args) {
        double km = 2.0;
        double miles = 5.0;
        double meters = 20.0;
        double feet = 10.0;

        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
    }
}
