import junit.framework.Test;
import org.junit.internal.TextListener;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runners.Suite;

import java.util.Scanner;
public class TestRunner {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();

        // Add a listener to print the results of each test
        junit.addListener(new RunListener() {
            @Override
            public void testFinished(Description description) {
                System.out.println("Test passed: " + description.getMethodName());
            }

            @Override
            public void testFailure(Failure failure) {
                System.out.println("Test failed: " + failure.getDescription().getMethodName());
            }
        });
        Result result = junit.run(TestLogin.class,TestJUnit.class);

        //the number of over all tests
        System.out.println("Tests run: " + result.getRunCount());
        //show number of every failure
        System.out.println("Tests failed: " + result.getFailureCount());
        //if all were successful
        System.out.println("Tests successful: " + result.wasSuccessful());
    }
}
