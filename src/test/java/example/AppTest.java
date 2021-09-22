/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertTrue(App.search(array, 4));
    }
    @Test
    public void testNotFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertFalse(App.search(array, 5));
    }
    @Test
    public void  testEmptyArray(){
        ArrayList<Integer> array = new ArrayList<>();
        assertFalse(App.search(array, 1));
    }
    @Test
    public void  testNull(){
        assertFalse(App.search(null, 1));
    }

}
