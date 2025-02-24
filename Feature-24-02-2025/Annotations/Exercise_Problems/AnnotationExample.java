import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) 
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Anuj")
    public void task1() {
        System.out.println("Executing Task 1");
    }
    @TaskInfo(priority = "Low", assignedTo = "Ankit")
    public void task2() {
        System.out.println("Executing Task 2");
    }
}

public class AnnotationExample {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        
        Method[] methods = TaskManager.class.getDeclaredMethods();
        for (Method method : methods) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            if (taskInfo != null) {
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned to: " + taskInfo.assignedTo());
                System.out.println("------");
            }
        }
    }
}
