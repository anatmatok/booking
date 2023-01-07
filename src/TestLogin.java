import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestLogin {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();


        // Open the window in full screen mode
        driver.manage().window().maximize();
    }

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://www.google.co.il/");

    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
