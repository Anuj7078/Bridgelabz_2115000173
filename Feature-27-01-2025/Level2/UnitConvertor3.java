public class UnitConvertor3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double poundsTokilograms = 0.453592;
        return pounds * poundsTokilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTopounds = 2.20462;
        return kilograms * kilogramsTopounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallonsToliters = 3.78541;
        return gallons * gallonsToliters;
    }

    public static double convertLitersToGallons(double liters) {
        double litersTogallons = 0.264172;
        return liters * litersTogallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 120.6;
        double celsius = 56.0;
        double pounds = 120.0;
        double kilograms = 79.0;
        double gallons = 15.0;
        double liters = 50.0;

        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
