import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
       TextContainer tc = new TextContainer();
       Class<?> c = TextContainer.class;
        Method []methods = c.getDeclaredMethods();
        if(c.isAnnotationPresent(SaveTo.class)){
            SaveTo st = c.getAnnotation(SaveTo.class);
            for (Method method: methods){
                if(method.isAnnotationPresent(SaveTo.class)){
                    method.invoke(tc,st.path());
                }
            }
        }
    }
}
