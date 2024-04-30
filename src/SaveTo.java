import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
        String path();
    }

    @Target(value = ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
@interface Save{

    }
