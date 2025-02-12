import java.util.*;
class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class MovieList {
    Movie head;
    Movie tail;
    MovieList() {
        this.head = null;
        this.tail = null;
    }

    void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    void addAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        if (position == 0) {
            addAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        Movie temp = head;
        int i = 0;
        while (i < position - 1 && temp != null) {
            i++;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position not found");
        } else {
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
        }
    }
    void display() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println("******** next node ********");
            temp = temp.next;
        }
    }
    void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        } else {
            System.out.println("Movie with title " + title + " not found.");
        }
    }
    void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                found = true;
                System.out.println("******** Movie Found by Director ********");
                System.out.println("Title: " + temp.title);
                System.out.println("Director: " + temp.director);
                System.out.println("Year of Release: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.rating);
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found with director " + director);
        }
    }
    void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                found = true;
                System.out.println("******** Movie Found by Rating ********");
                System.out.println("Title: " + temp.title);
                System.out.println("Director: " + temp.director);
                System.out.println("Year of Release: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.rating);
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found with rating " + rating);
        }
    }
    void updateRatingByTitle(String title, double newRating) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.rating = newRating;
        } else {
            System.out.println("Movie with title " + title + " not found.");
        }
    }
}
public class MovieManagementSys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieList movieList = new MovieList();

        movieList.addAtBeginning("Avenger: EndGame", "Virat Kohli", 2018, 9.4);
        movieList.addAtEnd("Tu Khiladi mein Anadi", "Jaya Bacchan", 1997, 8.5);
        movieList.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addAtPosition(1, "Baddass Ravikumar", "Himesh", 2025, 9.8);

        System.out.println("Movie List in Order:--");
        movieList.display();

        System.out.println("Enter Movie Title to remove:");
        movieList.removeByTitle(sc.nextLine());
        System.out.println("********* After Removal **********");
        movieList.display();

        System.out.println("Enter Director Name to search:");
        movieList.searchByDirector(sc.nextLine());

        System.out.println("Enter Rating to search:");
        movieList.searchByRating(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter Movie Title to update rating:");
        String title = sc.nextLine();
        System.out.println("Enter new rating:");
        double newRating = sc.nextDouble();
        movieList.updateRatingByTitle(title, newRating);
        System.out.println("********* After Rating Update **********");
        movieList.display();

        sc.close();
    }
}
