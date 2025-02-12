import java.util.*;
class Task {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskList {
    Task head;
    TaskList() {
        this.head = null;
    }

    void addAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; 
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head; 
            head = newTask;
        }
    }
    void addAtEnd(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;  
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;  
        }
    }
    void addAtPosition(int position, int taskID, String taskName, int priority, String dueDate) {
        if (position == 0) {
            addAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        Task temp = head;
        int i = 0;
        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp != null) {
            newTask.next = temp.next;
            temp.next = newTask;
        } else {
            System.out.println("Position not found");
        }
    }
    void remove(int taskID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Task temp = head;
        Task prev = null;

        if (head.taskID == taskID && head.next == head) {
            head = null;
            return;
        }
        if (head.taskID == taskID) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            prev.next = head.next;
            head = head.next;
            return;
        }
        while (temp != null && temp.taskID != taskID) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Task with ID " + taskID + " not found.");
        } else {
            prev.next = temp.next;
        }
    }
    void viewCurrentAndMoveNext() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Task temp = head;
        System.out.println("Current Task ID: " + temp.taskID);
        System.out.println("Task Name: " + temp.taskName);
        System.out.println("Priority: " + temp.priority);
        System.out.println("Due Date: " + temp.dueDate);
        System.out.println("******** Moving to next task ********");
        head = head.next;  
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskID);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println("******** next task ********");
            temp = temp.next;
        } while (temp != head);
    }
    void search(int priority) {
        Task temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null && temp.priority != priority) {
            temp = temp.next;
        }
        if(temp!=null && temp.priority == priority) {
            System.out.println("******** Task Found by Priority ********");
            System.out.println("Task ID: " + temp.taskID);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
        }else{
            System.out.println("Task with Priority " + priority + " not found.");
        }
    }
}
public class TaskScheduler{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList scheduler = new TaskList();

        scheduler.addAtBeginning(1, "Task 1", 5, "2025-02-15");
        scheduler.addAtEnd(2, "Task 2", 3, "2025-02-20");
        scheduler.addAtEnd(3, "Task 3", 4, "2025-02-18");
        scheduler.addAtPosition(1, 4, "Task 4", 2, "2025-02-10");

        System.out.println("All Tasks in Circular Linked List:");
        scheduler.display();

        System.out.println("\nEnter Task ID to remove:");
        scheduler.remove(sc.nextInt());

        System.out.println("\nAll Tasks after removal:");
        scheduler.display();

        System.out.println("\nViewing current task and moving to the next:");
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nEnter Priority to search tasks by:");
        int priority = sc.nextInt();
        scheduler.search(priority);

        sc.close();
    }
}
