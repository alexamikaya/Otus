package testframework.classes;


public class Equal {
    public static void Equals(int expected, int actual, String message) {
        if (expected!=actual){
            System.out.println(message);
        }
    }
}
