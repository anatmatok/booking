import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestJUnit {
    static Scanner input = new Scanner(System.in);
    private static String human;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("enter your input");
        human = input.nextLine();
    }

    @Test
    public void testAdd() {
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine",str);
    }
    @Test
    public void testHuman1() {
        String str = "hello";
        assertTrue(human.contains(str));
    }
    @Test
    public void testSubtract() {
        int num = 5-3;
        assertEquals(2, num);
    }

    @Test
    public void testMultiply() {
        int num = 5*3;
        assertEquals(15, num);
    }

}