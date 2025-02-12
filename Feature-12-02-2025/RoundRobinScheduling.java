import java.util.*;
class Process {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
class CircularQueue {
    Process head;
    CircularQueue() {
        this.head = null;
    }

    void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }
    void removeProcess(int processID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Process temp = head;
        Process prev = null;
        if (head.processID == processID && head.next == head) {
            head = null;
            return;
        }
        if (head.processID == processID) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            prev.next = head.next;
            head = head.next;
            return;
        }
        while (temp != null && temp.processID != processID) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Process with ID " + processID + " not found.");
        } else {
            prev.next = temp.next;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Process temp = head;
        while (temp != null) {
            System.out.println("Process ID: " + temp.processID);
            System.out.println("Burst Time: " + temp.burstTime);
            System.out.println("Remaining Time: " + temp.remainingTime);
            System.out.println("Priority: " + temp.priority);
            System.out.println("******** next node ********");
            temp = temp.next;
            if (temp == head) break;
        }
    }
    void roundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        Process temp = head;
        int totalWaitingTime = 0, totalTurnAroundTime = 0, numProcesses = 0;
        while (temp != null) {
            numProcesses++;
            temp = temp.next;
            if (temp == head) break;
        }
        temp = head;
        int timeElapsed = 0;
        while (numProcesses > 0) {
            if (temp.remainingTime > timeQuantum) {
                temp.remainingTime -= timeQuantum;
                timeElapsed += timeQuantum;
                System.out.println("Process ID: " + temp.processID + " executed for " + timeQuantum + " units.");
            } else {
                timeElapsed += temp.remainingTime;
                totalWaitingTime += (timeElapsed - temp.burstTime);
                totalTurnAroundTime += timeElapsed;
                System.out.println("Process ID: " + temp.processID + " executed for remaining " + temp.remainingTime + " units and finished.");
                removeProcess(temp.processID);
                numProcesses--;
            }
            System.out.println("******** next node ********");
            temp = temp.next;
        }
        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double) numProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnAroundTime / (double) numProcesses));
    }
}
public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue scheduler = new CircularQueue();

        scheduler.addProcess(1, 5, 1);
        scheduler.addProcess(2, 3, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 2);

        System.out.println("Initial Process List:");
        scheduler.display();

        System.out.println("\nEnter time quantum:");
        int timeQuantum = sc.nextInt();

        scheduler.roundRobin(timeQuantum);

        sc.close();
    }
}
