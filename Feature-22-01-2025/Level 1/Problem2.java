//this program calculates the average marks of Sam in physics, chemistry and maths
public class Problem2 {
    public static void main(String[] args) {
        int physicsMarks = 94;
        int chemistryMarks = 95;
        int mathsMarks = 96;

        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        int averageMarks = totalMarks / 3;
        System.out.println("The average marks of Sam is " + averageMarks);
    }
}
