package otus;

import com.google.common.math.IntMath;

import java.math.RoundingMode;

public class ForTest {
    public static int add(int a) {

        int number = IntMath.sqrt(a, RoundingMode.HALF_EVEN);
        return number;
    }
    private static String message() {

        String test = "Welcome";
        return test;
    }
}
