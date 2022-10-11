package otus;


import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class Proxy {
    static String calc1 = null;
    static String calc2 = null;
    static String calc3 = null;

    public static void main(String[] args) throws IOException, URISyntaxException, ClassNotFoundException {
        ClassInterface classInterface = Demo.newClass();
        calc1 = classInterface.calc1(2);
        calc2 = classInterface.calc2(2, 3);
        calc3 = classInterface.calc3(3, 4, "test");
        allClasses("otus"); //передаем название пакета, где хранятся классы

    }

    //метод ищет все классы в переданном пакете
    private static Iterable<Class> allClasses(String packageName) throws ClassNotFoundException, IOException, URISyntaxException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> pathClass = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            URI uri = new URI(resource.toString());
            pathClass.add(new File(uri.getPath()));//записываем пути ко всем классам
        }
        List<Class> classes = new ArrayList<Class>();
        for (File directory : pathClass) {
            classes.addAll(findClasses(directory, packageName));//обращаемся к методу поиска классов и записываем названия всех классов в данной папке
        }

        logg(classes);//вызываем метод логгирования
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }


    public static void logg(List<Class> classes) {

        for (Class clazz : classes) {

            Logger logger = new Logger();
            for (Method method : clazz.getDeclaredMethods()) {

                Annotation annotation = method.getAnnotation(Log.class);

                Log log = (Log) annotation;
                String name = method.getName();
                if (log != null) {
                    try {
                        if (name == "calc1") {
                            logger.calculation(calc1,name);
                        } else if (name == "calc2") {
                            logger.calculation(calc2,name);
                        } else if (name == "calc3") {
                            logger.calculation(calc3,name);
                        }

                    } catch (Throwable ex) {
                        System.out.println(ex.getCause());
                    }
                }
            }
        }
    }
}


