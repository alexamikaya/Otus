package otus;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {

    public void action() {
        new TestLogging().calculation(6);
        new TestLogging().calculation(6,5);
        new TestLogging().calculation(6,7,"n");
    }

}
