import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simania.co.il/");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/table/tbody/tr/td[3]/form/table/tbody/tr[2]/td[1]/div/input")).sendKeys("אין ילדים רעים");
        driver.findElement(By.xpath("//*[@id=\"topLogo\"]/table/tbody/tr/td[3]/form/table/tbody/tr[2]/td[2]/input")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/table/tbody/tr/td[2]/div/h2"));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[3]/book-private-sellers/div/div[2]/div/button")).click();
        System.out.println(name.getText());
        List<WebElement> price = driver.findElements(By.tagName("td"));
        for (int i = 0; i < price.size(); i++) {
            if(price.get(i).getText().contains("₪")){
                System.out.println(price.get(i).getText());
            }
        }
    }
}