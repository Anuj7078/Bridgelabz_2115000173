import java.util.Scanner;
class HotelBookingSys{
   String guestName;
   String roomType;
   int nights;

   public HotelBookingSys(){
       this.guestName = "Unknown";
       this.roomType = "Standard";
       this.nights = 1;
   } 

   public HotelBookingSys(String guestName, String roomType, int nights){
       this.guestName = guestName;
       this.roomType = roomType;
       this.nights = nights;
   }

   public HotelBookingSys(HotelBookingSys other) {
       this.guestName = other.guestName;
       this.roomType = other.roomType;
       this.nights = other.nights;
   } 

   public void displayBooking() {
       System.out.println("Guest Name: " + guestName);
       System.out.println("Room Type: " + roomType);
       System.out.println("Nights: " + nights);
   }
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

       System.out.print("Enter Guest Name: ");
       String name = sc.nextLine();

       System.out.print("Enter Room Type: ");
       String roomType = sc.nextLine();
      
       System.out.print("Enter Number of Nights: ");
       int nights = sc.nextInt();
      
       HotelBookingSys booking1 = new HotelBookingSys(name, roomType, nights);
       HotelBookingSys booking2 = new HotelBookingSys(booking1);
      
       System.out.println("\nBooking Details:");
       booking1.displayBooking();
      
       System.out.println("\nCopied Booking Details:");
       booking2.displayBooking();
   }
}


