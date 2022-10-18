package otus;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
class Demo {

    private Demo() {
    }

    static ClassInterface newClass() {
        InvocationHandler handler = new DemoInvocationHandler(new TestLogging());//создаем экземпляр оригинального класса
        return (ClassInterface) Proxy.newProxyInstance(Demo.class.getClassLoader(), //применяем механизм dynamic proxy
                new Class<?>[]{ClassInterface.class}, handler);//массив интерфейсов, которые нужно имплементировать
    }

    static class DemoInvocationHandler implements InvocationHandler {
        private final ClassInterface classInterface;

        DemoInvocationHandler(ClassInterface classInterface) {
            this.classInterface = classInterface;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { //логируем факт вызова


                Annotation annotation = method.getAnnotation(Log.class);
                Log log = (Log) annotation;
                otus.Proxy proxy1=new otus.Proxy();
                if (log != null) {
                    proxy1.logg(method,method.invoke(classInterface, args));
            }
            return method.invoke(classInterface, args);
        }

        @Override
        public String toString() {
            return "DemoInvocationHandler{" +
                    "myClass=" + classInterface +
                    '}';
        }
    }


}



