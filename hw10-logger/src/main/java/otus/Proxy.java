package otus;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Proxy {
    static String calc1 = null;
    static String calc2 = null;
    static String calc3 = null;
    public static void main(String[] args) {
        ClassInterface classInterface = Demo.newClass();
        calc1=classInterface.calc1(2);
        calc2=classInterface.calc2(2, 3);
        calc3=classInterface.calc3(3, 4, "test");
        logg();
    }

    public static void logg(){
        Class<ClassInterface> testlogging=ClassInterface.class;
        Logger logger = new Logger();
        for (Method method : testlogging.getDeclaredMethods()){
            Annotation annotation = method.getAnnotation(Log.class);
            Log log = (Log) annotation;
            String name = method.getName();;
            if (log!=null){
                try{
                    if (name=="calc1"){
                        logger.calculation(calc1);}
                    else if (name=="calc2"){
                        logger.calculation(calc2);}
                    else if (name=="calc3"){
                        logger.calculation(calc3);}

                } catch(Throwable ex)
                {
                    System.out.println(ex.getCause());
                }
            }
        }
    }
}

