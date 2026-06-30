import java.lang.reflect.Method;

public class ReflectionExample {

    public void show() {
        System.out.println("Reflection Example");
    }

    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("ReflectionExample");

        Object obj = c.getDeclaredConstructor().newInstance();

        Method m = c.getMethod("show");

        m.invoke(obj);
    }
}
