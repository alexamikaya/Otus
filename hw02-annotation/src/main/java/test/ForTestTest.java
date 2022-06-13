package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import otus.ForTest;
import testframework.annotations.After;
import testframework.annotations.Before;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static testframework.classes.Equal.Equals;

class ForTestTest {
    ForTest test = new ForTest();
    private final ArrayList a = new ArrayList();

    @Before
    void setUp() {
       for(int i = 0; i < 100; i++){
           a.add(i++);
       }

    }

    @After
    void tearDown() {
        a.clear();
    }


    @testframework.annotations.Test
     void add() {
        for(int i = 0; i < a.size(); i++) {

            if(i==49) {
                Equals(5, test.add(i), "test failed");
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