// The volume of a sphere is (4/3)πr^3 where r is the radius of the sphere where radius of earth is 6378 km.
public class Problem7 {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInMiles = volumeInKm * 0.621371;
        System.out.println(
                " The volume of earth in cubic kilometers is" + volumeInKm + " and cubic miles is " + volumeInMiles);
    }
}
