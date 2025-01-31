import java.util.*;

class TotalTravel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of City");
        System.out.print("From City: ");
        String fromCity = sc.nextLine();
        System.out.println("Via City:");
        String viaCity = sc.nextLine();
        System.out.print("To City: ");
        String toCity = sc.nextLine();
        System.out.println("Enter the Distance between the cities in Miles");
        System.out.print("distanceFromToVia:");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("viaToFinalCity:");
        double distanceViaTo = sc.nextDouble();
        System.out.println("Time taken to travel between the cities in minutes");
        System.out.print("timeFromToVia:");
        int timeFromToVia = sc.nextInt();
        System.out.print("timeViaToFinalCity:");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = distanceFromToVia + distanceViaTo;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled from " + fromCity + " to " + toCity + " via "+viaCity+" is "+totalDistance*1.609344 + " km and the Total time taken is " + totalTime + " minutes");
    }
}