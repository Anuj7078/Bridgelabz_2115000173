import java.util.*;
class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    Ticket head;
    TicketReservationSystem() {
        this.head = null;
    }

    void add(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }
    void remove(int ticketID) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Ticket temp = head;
        Ticket prev = null;

        if (head.ticketID == ticketID && head.next == head) {
            head = null;
            System.out.println("Ticket removed.");
            return;
        }
        if (head.ticketID == ticketID) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            prev.next = head.next;
            head = head.next;
            System.out.println("Ticket removed.");
            return;
        }

        while (temp != null && temp.ticketID != ticketID) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Ticket ID not found.");
        } else {
            prev.next = temp.next;
            System.out.println("Ticket removed.");
        }
    }
    void display() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }
        Ticket temp = head;
        while (temp != null) {
            System.out.println("Ticket ID: " + temp.ticketID);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Seat Number: " + temp.seatNumber);
            System.out.println("Booking Time: " + temp.bookingTime);
            System.out.println("******** Next Ticket ********");
            temp = temp.next;
            if (temp == head) break;
        }
    }
    void searchByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("******** Ticket Found by Customer Name ********");
                System.out.println("Ticket ID: " + temp.ticketID);
                System.out.println("Customer Name: " + temp.customerName);
                System.out.println("Movie Name: " + temp.movieName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
            if (temp == head) break;
        }
        if (!found) {
            System.out.println("No ticket found for the customer name " + customerName);
        }
    }
    void searchByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("******** Ticket Found by Movie Name ********");
                System.out.println("Ticket ID: " + temp.ticketID);
                System.out.println("Customer Name: " + temp.customerName);
                System.out.println("Movie Name: " + temp.movieName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
            if (temp == head) break;
        }
        if (!found) {
            System.out.println("No ticket found for the movie name " + movieName);
        }
    }
    int totalBookedTickets() {
        if (head == null) {
            return 0;
        }
        Ticket temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
            if (temp == head) break;
        }
        return count;
    }
}
public class TicketReservationSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketReservationSystem list = new TicketReservationSystem();

        list.add(1, "Anuj", "Badass Ravikumar", "A1", "2025-02-15 18:30");
        list.add(2, "Hitesh", "Deva", "B7", "2025-02-15 19:00");
        list.add(3, "Kiran", "kantara", "C59", "2025-02-15 20:00");

        list.display();

        System.out.println("Enter Ticket ID to remove:");
        list.remove(sc.nextInt());

        System.out.println("******** After Removal ********");
        list.display();

        System.out.println("Enter Customer Name to search for ticket:");
        list.searchByCustomerName(sc.next());

        System.out.println("Enter Movie Name to search for ticket:");
        list.searchByMovieName(sc.next());

        System.out.println("Total Number of Booked Tickets: " + list.totalBookedTickets());

        sc.close();
    }
}
