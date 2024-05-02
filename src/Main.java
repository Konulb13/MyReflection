import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyAnnClass an = new MyAnnClass();
        Class<?> cl = an.getClass();
        Method[] allMethods = cl.getDeclaredMethods();
        for (Method m : allMethods) {
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
                System.out.println(m.invoke(an, myAnnotation.a(), myAnnotation.b()));
            }

        }
    }
}

class MyAnnClass {
    @MyAnnotation(a = 42, b = 38)
    public int annMethod(int a, int b) {
        System.out.println("a = " + a + "\n" + "b = " + b);
        return a+b;
    }
}
