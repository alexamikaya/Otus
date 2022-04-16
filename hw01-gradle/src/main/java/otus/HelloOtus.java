package otus;

import com.google.common.math.IntMath;

import java.math.RoundingMode;

public class HelloOtus {
        public static void main(String args[]) {

            int a = 121;

            int number = IntMath.sqrt(a, RoundingMode.HALF_EVEN);

            System.out.println("Result equals " + number);
        }
}


