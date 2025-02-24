import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class LoggingProxy {
    interface Greeting {
        void sayHello(String name);
    }

    static class GreetingImpl implements Greeting {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

    static class LoggingInvocationHandler implements InvocationHandler {
        private final Object target;

        public LoggingInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Calling method: " + method.getName());

            return method.invoke(target, args);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            Greeting greeting = new GreetingImpl();

            Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                    Greeting.class.getClassLoader(),
                    new Class[]{Greeting.class},
                    new LoggingInvocationHandler(greeting)
            );

            proxyGreeting.sayHello(name);
        }
    }
}