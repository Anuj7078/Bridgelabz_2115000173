import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class DIContainerUsingReflection {

    private final Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        instances.put(clazz, clazz.getDeclaredConstructor().newInstance());
    }

    public void inject(Object object) throws IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = instances.computeIfAbsent(field.getType(), this::createInstance);
                field.set(object, dependency);
            }
        }
    }

    private Object createInstance(Class<?> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance for class: " + clazz.getName(), e);
        }
    }
    public Map<Class<?>, Object> getInstances() {
        return instances;
    }
}

class ActionService {
    public void execute() {
        System.out.println("ActionService executed");
    }
}

class UserService {

    @Inject
    private ActionService actionService;

    public void performAction() {
        actionService.execute();
        System.out.println("UserService performed action");
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DIContainerUsingReflection diContainer = new DIContainerUsingReflection();

            diContainer.register(ActionService.class);
            diContainer.register(UserService.class);

            System.out.print("Enter the action you want to perform (1 for UserService action): ");
            if (scanner.nextInt() == 1) {
                UserService userService = (UserService) diContainer.getInstances().get(UserService.class);
                diContainer.inject(userService);
                userService.performAction();
            } else {
                System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}