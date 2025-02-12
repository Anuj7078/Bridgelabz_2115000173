import java.util.*;
class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
class TextEditor {
    TextState head;
    TextState tail;
    TextState current;
    int size;
    final int maxHistorySize;
    TextEditor(int maxHistorySize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.maxHistorySize = maxHistorySize;
    }
    void addTextState(String content) {
        TextState newState = new TextState(content);
        if (head == null) {
            head = newState;
            tail = newState;
            current = newState;
        } else {
            if (size == maxHistorySize) {
                head = head.next;
                head.prev = null;
                size--;
            }
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = tail;
        }
        size++;
        System.out.println("******** New State Added ********");
        displayCurrentState();
    }
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("******** Undo ********");
            displayCurrentState();
        } else {
            System.out.println("No previous state to undo.");
        }
    }
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("******** Redo ********");
            displayCurrentState();
        } else {
            System.out.println("No next state to redo.");
        }
    }
    void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text State: " + current.content);
        } else {
            System.out.println("No content to display.");
        }
    }
    void displayHistory() {
        TextState temp = head;
        while (temp != null) {
            System.out.println("Text State: " + temp.content);
            temp = temp.next;
        }
    }
}
public class UndoRedoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor(10);

        System.out.println("Enter initial text state:");
        editor.addTextState(sc.nextLine());

        while (true) {
            System.out.println("Enter an action (1: Add Text, 2: Undo, 3: Redo, 4: Display History, 5: Exit): ");
            int action = sc.nextInt();
            sc.nextLine();  
            switch (action) {
                case 1:
                    System.out.println("Enter text to add:");
                    editor.addTextState(sc.nextLine());
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    System.out.println("******** History ********");
                    editor.displayHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid action.");
            }
        }
    }
}
