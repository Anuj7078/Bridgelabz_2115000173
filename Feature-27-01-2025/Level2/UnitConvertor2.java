
public class UnitConvertor2{
    public static double convertYardsToFeet(double yards) {
        double yardsTofeet = 3.0;
        return yards * yardsTofeet;
    }

    public static double convertFeetToYards(double feet) {
        double feetToyards = 0.333333;
        return feet * feetToyards;
    }

    public static double convertMetersToInches(double meters) {
        double metersToinches = 39.3701;
        return meters * metersToinches;
    }

    public static double convertInchesToMeters(double inches) {
        double inchesTometers = 0.0254;
        return inches * inchesTometers;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inchesTocm = 2.54;
        return inches * inchesTocm;
    }

    public static void main(String[] args) {
        double yards = 15.0;
        double feet = 6.0;
        double meters = 22.0;
        double inches = 32.0;

        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
