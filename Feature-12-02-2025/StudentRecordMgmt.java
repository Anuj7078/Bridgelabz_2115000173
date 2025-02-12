import java.util.*;
class Student{
    int RollNumber;;
    String name;
    int age;
    String grade;
    Student next;
    Student(int RollNumber, String name,int age,String grade){
        this.RollNumber = RollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentList{
    Student head;
    StudentList(){
        this.head = null;
    }
    void addAtBeginning(int RollNumber,String name,int age,String grade){
        Student newStudent = new Student(RollNumber,name,age,grade);
        if(head==null){
            head = newStudent;
        }else{
            newStudent.next = head;
            head = newStudent;
        }
    }
    void addAtEnd(int RollNumber,String name,int age,String grade){
        Student newStudent = new Student(RollNumber,name,age,grade);
        if(head==null){
            head = newStudent;
        }else{
            Student temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }
    void addAtposition(int position, int RollNumber,String name,int age,String grade){
        if(position == 0){
            addAtBeginning(RollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(RollNumber,name,age,grade);
        Student temp = head;
        int i=0;
        while(i<position-1 && temp!=null){
            i++;
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Position not found");
        }else{
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
    }
    void display(){
        Student temp = head;
        while(temp!=null){
            System.out.println("Roll Number:"+temp.RollNumber);
            System.out.println("Name:"+temp.name);
            System.out.println("Age:"+temp.age);
            System.out.println("Grade:"+temp.grade);
            System.out.println("******** next node ********");
            temp = temp.next;
        }
    }
    void delete(int RollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Student temp = head;
        Student prev = null;
        while(temp!=null && temp.RollNumber!=RollNumber){
            prev = temp;
            temp = temp.next;
        }
        if(temp!=null){
            if(temp.next == null) prev.next = null;
            else prev.next = prev.next.next;
        }
    }
    void search(int RollNumber){
        Student temp = head;
        while(temp!=null && temp.RollNumber!=RollNumber){
            temp = temp.next;
        }
        if(temp!=null){
            System.out.println("******** Student Found ********");
            System.out.println("Roll Number:"+temp.RollNumber);
            System.out.println("Name:"+temp.name);
            System.out.println("Age:"+temp.age);
            System.out.println("Grade:"+temp.grade);
        }
    }
    void updateGrade(int RollNumber ,String newgrade){
        Student temp = head;
        while(temp!=null && temp.RollNumber!=RollNumber){
            temp = temp.next;
        }
        if(temp!=null){
            temp.grade = newgrade;
        }
    }
}
public class StudentRecordMgmt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        list.addAtBeginning(1, "Anuj", 21, "O");
        list.addAtBeginning(2, "Kunal", 21, "D");
        list.addAtEnd(3, "Bhagoaday", 22, "E");
        list.addAtposition(1, 4, "Aman", 20, "B");
        list.display();
        System.out.println("Enter Roll Number to delete");
        list.delete(sc.nextInt());
        System.out.println("*********After Deletion**********");
        list.display();
        System.out.println("Enter Roll Number to search");
        list.search(sc.nextInt());
        System.out.println("Enter Roll Number to update grade");
        int RollNumber = sc.nextInt();
        System.out.println("Enter new grade");
        String grade = sc.next();
        list.updateGrade(RollNumber, grade);
        System.out.println("*********After Updation**********");
        list.display();
        sc.close();
    }
}
