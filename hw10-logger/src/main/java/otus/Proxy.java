package otus;

public class Proxy {
    public static void main(String[] args) {
        ClassInterface classInterface = Demo.newClass();
        classInterface.calculation(2);
        classInterface.calculation(2, 3);
        classInterface.calculation(3, 4, "test");
    }
}
