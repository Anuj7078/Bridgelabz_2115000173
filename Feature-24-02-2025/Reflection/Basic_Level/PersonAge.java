import java.lang.reflect.Field;
import java.util.Scanner;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class PersonAge {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter initial age: ");
            int initialAge = scanner.nextInt();

            Person person = new Person(initialAge);
            Class<?> clazz = person.getClass();
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);

            System.out.println("Current Age: " + ageField.get(person));

            System.out.print("Enter new age: ");
            int newAge = scanner.nextInt();
            ageField.set(person, newAge);

            System.out.println("Updated Age: " + ageField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}