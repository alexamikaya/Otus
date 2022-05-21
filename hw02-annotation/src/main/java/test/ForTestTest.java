package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import otus.ForTest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ForTestTest {
    ForTest test = new ForTest();
    private final ArrayList a = new ArrayList();

    @BeforeEach
    void setUp() {
       for(int i = 0; i < 100; i++){
           a.add(i++);
       }

    }

    @AfterEach
    void tearDown() {
        a.clear();
    }


    @Test
    void add() {
        for(int i = 0; i < a.size(); i++) {

            if(i==49) {
                Assertions.assertEquals(5, test.add(i), "test failed");
            }

        }
    }
    @Test
    void message() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ForTest privateO = new ForTest();

        Method privateMethod = ForTest.class.
                getDeclaredMethod("message");

        privateMethod.setAccessible(true);

        String returnValue = (String)
                privateMethod.invoke(privateO, null);
        assertSame("Welcome", returnValue, "test failed");


    }

}