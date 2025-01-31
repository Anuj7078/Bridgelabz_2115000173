// Write a program to divide 14 pens among 3 students. The program should display the number of pens each student gets and the number of pens left over.
public class Problem5 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int pensLeft = pens % students;
        System.out.println(
                "The Pens per Student is:" + pensPerStudent + "and the remaining pens not distributed is:" + pensLeft);
    }
}
