import java.util.PriorityQueue;
class Patient implements Comparable<Patient> {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public String getName() {
        return name;
    }

    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
public class HospitalTriageSys {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("Anuj", 3));
        queue.add(new Patient("Ashu", 5));
        queue.add(new Patient("Babli", 2));

        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
